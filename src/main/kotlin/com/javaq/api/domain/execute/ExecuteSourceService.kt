package com.javaq.api.domain.execute

import com.javaq.api.domain.file.Files
import com.javaq.api.domain.io.StdErr
import com.javaq.api.domain.io.StdOut


object ExecuteSourceService {
    operator fun invoke(files: Files): ExecuteResult {
        return ExecuteResult(StdOut("Hello World"), StdErr(""))
    }
}
