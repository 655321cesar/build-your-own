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

import com.csantos.buildyourown.PecasActivity;
import com.csantos.buildyourown.R;
import com.csantos.buildyourown.databinding.FragmentPecasBinding;



public class PecasFragment extends Fragment {

    private PecasViewModel pecasViewModel;
    private FragmentPecasBinding binding;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pecasViewModel =
                new ViewModelProvider(this).get(PecasViewModel.class);


        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        context = rootView.getContext(); // Assign your rootView to context



        //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
        Intent intent = new Intent(context, PecasActivity.class);
        startActivity(intent);


        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}