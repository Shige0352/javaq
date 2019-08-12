package com.javaq.api.domain.answer

import com.javaq.api.domain.file.Files
import com.javaq.api.domain.probrem.ProblemId

data class Answer (
        val files: Files,
        val problemId: ProblemId
)