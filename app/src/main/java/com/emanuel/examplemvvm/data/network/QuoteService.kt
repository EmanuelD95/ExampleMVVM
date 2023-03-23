package com.emanuel.examplemvvm.data.network

import com.emanuel.examplemvvm.core.RetrofitHelper
import com.emanuel.examplemvvm.data.model.QuoteModel
import com.emanuel.examplemvvm.data.model.network.QuoteApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}