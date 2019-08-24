package com.javaq.api.application.controller

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.javaq.api.domain.answer.Answer
import com.javaq.api.domain.execute.ExecuteSourceService
import com.javaq.api.domain.judge.Judge
import com.javaq.api.domain.probrem.ProblemId
import com.javaq.api.domain.probrem.ProblemRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class ApiController(
        val problemRepository: ProblemRepository
) {
    @PostMapping("/execute")
    fun execute(@RequestBody answerJson: String): JudgeForm {
        val mapper = jacksonObjectMapper()
        val answer = mapper.readValue(answerJson, Answer::class.java)
        val executeResult = ExecuteSourceService(answer.files)
        val problem = problemRepository.getById(answer.problemId)
        val judge = Judge(executeResult.stdOut, problem.problemAnswer)
        val judgmentResult = judge.judgment()
        val judgeForm = JudgeForm(executeResult.stdOut.value, judgmentResult)
        return judgeForm
    }
    @CrossOrigin
    @GetMapping("problem/{problemId}")
    fun getProblemStatement(@PathVariable problemId: Int): String {
        val problem = problemRepository.getById(ProblemId(problemId))
        return problem.problemStatement.value
    }
}
