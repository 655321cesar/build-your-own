package com.csantos.buildyourown.ui.vectary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FerramentasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FerramentasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}