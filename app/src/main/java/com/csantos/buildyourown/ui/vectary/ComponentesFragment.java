package com.csantos.buildyourown.ui.vectary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.csantos.buildyourown.ComponentesActivity;
import com.csantos.buildyourown.R;
import com.csantos.buildyourown.databinding.FragmentComponentesBinding;
import com.csantos.buildyourown.ui.webview.WebviewFragment;


public class ComponentesFragment extends Fragment {

    private ComponentesViewModel componentesViewModel;
    private FragmentComponentesBinding binding;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        componentesViewModel =
                new ViewModelProvider(this).get(ComponentesViewModel.class);


        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_componentes, container, false);
        context = rootView.getContext(); // Assign your rootView to context



        //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
        Intent intent = new Intent(context, ComponentesActivity.class);
        startActivity(intent);


        return rootView;
    }

    public static ComponentesFragment newInstance(String text) {

        ComponentesFragment f = new ComponentesFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}