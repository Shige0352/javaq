package com.javaq.api.infrastracuture

import com.javaq.api.domain.probrem.*
import org.springframework.stereotype.Repository

@Repository
class ProblemStoreWithMyBatis : ProblemRepository {
    override fun getById(problemId: ProblemId): Problem {
        return Problem(
            ProblemId(problemId.value),
            ProblemStatement("Hello Worldが出力されるようにしてください。"),
            ProblemAnswer("Hello World")
        )
    }
}
