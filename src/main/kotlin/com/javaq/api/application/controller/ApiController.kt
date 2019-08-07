package com.javaq.api.application.controller

import com.javaq.api.application.form.anser.AnswerForm
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {
    @PostMapping("/api/sourceExecute")
    fun sourceExecute(@ModelAttribute answerForm: AnswerForm) {
        
    }
}
