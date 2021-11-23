package com.csantos.buildyourown.ui.webview;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WebviewViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WebviewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("https://www.vectary.com/viewer/v1/?model=766e9273-c8ce-4203-a1d3-eefb9c8349a8&env=studio3");
        //"https://www.vectary.com/viewer/v1/?model=766e9273-c8ce-4203-a1d3-eefb9c8349a8&env=studio3"

    }

    public LiveData<String> getText() {
        return mText;
    }
}