package com.javaq.api.domain.judgementResult

data class JudgementResultImpl(override val isSuccess: IsSuccess, override val stdOut: StdOut) : JudgementResult
