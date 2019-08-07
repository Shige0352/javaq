package com.javaq.api.domain.judgementResult

data class JudgementResultImpl(override val isSuccess: Boolean, override val stdOut: StdOut) : JudgementResult
