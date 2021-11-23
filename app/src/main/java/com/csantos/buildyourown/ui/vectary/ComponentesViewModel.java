package com.csantos.buildyourown.ui.vectary;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ComponentesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ComponentesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}