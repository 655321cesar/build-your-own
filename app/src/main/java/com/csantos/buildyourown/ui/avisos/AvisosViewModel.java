package com.csantos.buildyourown.ui.avisos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AvisosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    String texto = "Montagem e Instalação\n\n" +
            "Recomenda-se duas pessoas para a montagem e instalação do painel com prateleiras.\n" +
            "Superfícies irregulares e paredes curvas não são recomendadas, pois comprometem a fixação e podem danificar o produto.\n" +
            "Antes de iniciar a instalação do painel, verifique as condições da parede quanto a resistência ao peso e ao posicionamento de tubulações hidráulicas e elétricas, evitando danos a estas estruturas ao executar os furos. \n"+
            "Recomenda-se duas pessoas para a montagem e instalação do painel com prateleiras.\n" +
                    "Superfícies irregulares e paredes curvas não são recomendadas, pois comprometem a fixação e podem danificar o produto.\n" +
                    "Antes de iniciar a instalação do painel, verifique as condições da parede quanto a resistência ao peso e ao posicionamento de tubulações hidráulicas e elétricas, evitando danos a estas estruturas ao executar os furos. \n"+
            "Recomenda-se duas pessoas para a montagem e instalação do painel com prateleiras.\n" +
            "Superfícies irregulares e paredes curvas não são recomendadas, pois comprometem a fixação e podem danificar o produto.\n" +
            "Antes de iniciar a instalação do painel, verifique as condições da parede quanto a resistência ao peso e ao posicionamento de tubulações hidráulicas e elétricas, evitando danos a estas estruturas ao executar os furos. \n"+
            "Recomenda-se duas pessoas para a montagem e instalação do painel com prateleiras.\n" +
            "Superfícies irregulares e paredes curvas não são recomendadas, pois comprometem a fixação e podem danificar o produto.\n" +
            "Antes de iniciar a instalação do painel, verifique as condições da parede quanto a resistência ao peso e ao posicionamento de tubulações hidráulicas e elétricas, evitando danos a estas estruturas ao executar os furos. \n";


    public AvisosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(texto);
    }

    public LiveData<String> getText() {
        return mText;
    }
}