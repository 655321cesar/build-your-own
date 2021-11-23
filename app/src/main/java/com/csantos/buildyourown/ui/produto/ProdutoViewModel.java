package com.csantos.buildyourown.ui.produto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProdutoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    String texto = "https://www.vectary.com/viewer/v1/?model=766e9273-c8ce-4203-a1d3-eefb9c8349a8&env=studio3";


    public ProdutoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(texto);
    }

    public LiveData<String> getText() {
        return mText;
    }
}