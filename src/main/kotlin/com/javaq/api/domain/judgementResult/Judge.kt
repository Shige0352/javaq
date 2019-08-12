package com.javaq.api.domain.judgementResult

import com.javaq.api.domain.io.StdOut
import com.javaq.api.domain.probrem.ProblemAnswer

object Judge {
    fun judge(stdOut: StdOut, problemAnswer: ProblemAnswer): JudgementResult {
        return JudgementResult(
                IsSuccess(stdOut.value == problemAnswer.value),
                StdOut(stdOut.value)
        )
    }
}
