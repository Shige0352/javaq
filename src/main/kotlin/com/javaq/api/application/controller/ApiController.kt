package com.javaq.api.application.controller

import com.javaq.api.application.service.SourceCodeExecuteService
import com.javaq.api.domain.answer.Answer
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController(val sourceCodeExecuteService: SourceCodeExecuteService) {
    @PostMapping("/api/sourceExecute")
    fun sourceExecute(@ModelAttribute answer: Answer) {

    }
}
