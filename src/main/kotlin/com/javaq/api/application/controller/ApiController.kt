package com.javaq.api.application.controller

import com.javaq.api.domain.answer.Answer
import com.javaq.api.domain.execute.ExecuteSourceService
import com.javaq.api.domain.judgementResult.Judge
import com.javaq.api.domain.judgementResult.JudgementResult
import com.javaq.api.domain.probrem.ProblemRepository
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController(
        val problemRepository: ProblemRepository
) {
    @PostMapping("/api/sourceExecute")
    fun sourceExecute(@ModelAttribute answer: Answer): JudgementResult {
        val executeResult = ExecuteSourceService(answer.files)
        val problem = problemRepository.getById(answer.problemId)
        val result = Judge.judge(executeResult.stdOut, problem.problemAnswer)
        return result
    }
}
