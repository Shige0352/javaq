package com.javaq.api.domain.probrem

interface ProblemRepository {
    fun getById(problemId: ProblemId): Problem
}
