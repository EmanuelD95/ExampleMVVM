package com.emanuel.examplemvvm.data

import com.emanuel.examplemvvm.data.model.QuoteModel
import com.emanuel.examplemvvm.data.model.QuoteProvider
import com.emanuel.examplemvvm.data.model.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}