package com.javaq.api.domain.file

import com.javaq.api.domain.programLanguage.ProgramLanguage

data class File(
    val sourceCode: String,
    val programLanguage: ProgramLanguage,
    val fileName: String
)
