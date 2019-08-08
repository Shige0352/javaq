package com.javaq.api.application.controller

import com.javaq.api.application.form.anser.AnswerForm
import com.javaq.api.domain.judgementResult.IsSuccess
import com.javaq.api.domain.judgementResult.IsSuccessImpl
import com.javaq.api.domain.judgementResult.JudgementResult
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {
    @PostMapping("/api/sourceExecute")
    fun sourceExecute(@ModelAttribute answerForm: AnswerForm) {
        //受け渡す





        
    }
}
