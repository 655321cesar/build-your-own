package com.csantos.buildyourown.ui.webview;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WebviewViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WebviewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("https://www.vectary.com/viewer/v1/?model=da207ecb-98ed-47d8-b606-3b29d017ca69&env=studio3");
    }

    public LiveData<String> getText() {
        return mText;
    }
}