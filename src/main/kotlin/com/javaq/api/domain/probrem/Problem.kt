package com.javaq.api.domain.probrem

data class Problem (
        val problemId: ProblemId,
        val problemStatement: ProblemStatement,
        val problemAnswer: ProblemAnswer
)
