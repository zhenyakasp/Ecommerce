package com.example.ecommerce.presentation.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    private val _screenDelayed = MutableLiveData(false)
    var screenDelayed: LiveData<Boolean> = _screenDelayed

    fun launchDelay() {
        viewModelScope.launch(Dispatchers.Main) {
            delay(3000)

            _screenDelayed.value = true
        }
    }
}