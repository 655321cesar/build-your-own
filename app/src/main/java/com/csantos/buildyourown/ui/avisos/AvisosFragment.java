package com.csantos.buildyourown.ui.avisos;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.csantos.buildyourown.AvisosActivity;
import com.csantos.buildyourown.ComponentesActivity;
import com.csantos.buildyourown.R;
import com.csantos.buildyourown.databinding.FragmentAvisosBinding;

public class AvisosFragment extends Fragment {

    private AvisosViewModel avisosViewModel;
    private FragmentAvisosBinding binding;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        avisosViewModel =
                new ViewModelProvider(this).get(AvisosViewModel.class);

        binding = FragmentAvisosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_avisos, container, false);
        context = rootView.getContext(); // Assign your rootView to context



        //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
        Intent intent = new Intent(context, AvisosActivity.class);
        startActivity(intent);


        return rootView;
    }

    public static AvisosFragment newInstance(String text) {

        AvisosFragment f = new AvisosFragment();
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