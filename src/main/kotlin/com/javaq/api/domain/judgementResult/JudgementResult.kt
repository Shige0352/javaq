package com.javaq.api.domain.judgementResult

import com.javaq.api.domain.io.StdOut

data class JudgementResult(
        val isSuccess: Boolean,
        val stdOut: String
)
