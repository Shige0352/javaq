package com.javaq.api.domain.execute

import com.javaq.api.domain.io.StdErr
import com.javaq.api.domain.io.StdOut

data class ExecuteResult(val stdOut: StdOut, val stdErr: StdErr)
