package com.javaq.api.domain.judge

import com.javaq.api.domain.io.StdOut
import com.javaq.api.domain.probrem.ProblemAnswer

data class Judge(val stdOut: StdOut, val problemAnswer: ProblemAnswer) {
    fun judgment(): Boolean {
        return stdOut.value == problemAnswer.value
    }
}
