package com.javaq.api.application.controller

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.javaq.api.domain.answer.Answer
import com.javaq.api.domain.execute.ExecuteSourceService
import com.javaq.api.domain.judgementResult.Judge
import com.javaq.api.domain.judgementResult.JudgementResult
import com.javaq.api.domain.probrem.ProblemId
import com.javaq.api.domain.probrem.ProblemRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class ApiController(
        val problemRepository: ProblemRepository
) {
    @PostMapping("/sourceExecute")
    fun sourceExecute(@RequestBody answerJson: String): JudgementResult {
        val mapper = jacksonObjectMapper()
        val answer = mapper.readValue(answerJson, Answer::class.java)
        val executeResult = ExecuteSourceService(answer.files)
        val problem = problemRepository.getById(answer.problemId)
        val result = Judge.judge(executeResult.stdOut, problem.problemAnswer)
        return result
    }

    @GetMapping("problem/{problemId}")
    fun getProblemStatement(@PathVariable problemId: Int): String {
        val problem = problemRepository.getById(ProblemId(problemId))
        return problem.problemStatement.value
    }
}
