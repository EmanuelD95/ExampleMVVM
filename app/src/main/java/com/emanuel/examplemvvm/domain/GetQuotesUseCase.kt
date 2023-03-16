package com.emanuel.examplemvvm.domain

import com.emanuel.examplemvvm.data.model.QuoteModel
import com.emanuel.examplemvvm.data.QuoteRepository

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}