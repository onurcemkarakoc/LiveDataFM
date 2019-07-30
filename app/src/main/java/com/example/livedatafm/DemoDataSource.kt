package com.example.livedatafm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DemoDataSource {
    private val _numbersLiveDate = MutableLiveData<List<Int>>()
    val numberLiveData: LiveData<List<Int>> get() = _numbersLiveDate

    private val numbers = mutableListOf(1, 2, 3, 4)

    fun loadNumbers() {
        _numbersLiveDate.postValue(numbers)
    }

    fun addItem(a: Int) {

        numbers.add(a)
        _numbersLiveDate.postValue(numbers)

    }
}