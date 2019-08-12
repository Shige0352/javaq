package com.javaq.api.domain.judgementResult

import com.javaq.api.domain.io.StdOut

data class JudgementResult (
    val isSuccess: IsSuccess,
    val stdOut: StdOut
)
