package com.example.journal0114.Auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class LoginViewModel extends ViewModel {
    //라이브베이타 : 뮤터블 - 라이브데이타를 상속
    //내부에서만 바꿀수 있게
    //자바에서 만들었지반 XML에서 표시되도록 @
    public LiveData<String> joinButtonText = new MutableLiveData<>("Navigate to Join");

}