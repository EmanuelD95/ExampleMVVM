package com.emanuel.examplemvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.emanuel.examplemvvm.model.QuoteModel
import com.emanuel.examplemvvm.model.QuoteProvider

class QuoteViewModel: ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }


}