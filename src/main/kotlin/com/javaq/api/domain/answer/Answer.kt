package com.javaq.api.domain.answer

import com.javaq.api.domain.file.Files

data class Answer (
        val files: Files,
        val problemId: Int
)