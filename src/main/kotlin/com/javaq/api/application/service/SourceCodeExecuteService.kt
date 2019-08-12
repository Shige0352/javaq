package com.javaq.api.application.service

import com.javaq.api.domain.judgementResult.JudgementResult

interface SourceCodeExecuteService {
    //ソースの実行と回答の比較
    fun a(): JudgementResult?
}