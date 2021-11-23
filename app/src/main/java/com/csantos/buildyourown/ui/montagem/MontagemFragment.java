package com.csantos.buildyourown.ui.montagem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.csantos.buildyourown.R;
import com.csantos.buildyourown.MontagemActivity;
import com.csantos.buildyourown.databinding.FragmentMontagemBinding;


public class MontagemFragment extends Fragment {

    private MontagemViewModel montagemViewModel;
    private FragmentMontagemBinding binding;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        montagemViewModel =
                new ViewModelProvider(this).get(MontagemViewModel.class);


        //Pass your layout xml to the inflater and assign it to rootView.
       View rootView = inflater.inflate(R.layout.fragment_montagem, container, false);
       context = rootView.getContext(); // Assign your rootView to context



        //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
       Intent intent = new Intent(context, MontagemActivity.class);
       startActivity(intent);


        return rootView;
    }

       /* binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textSlideshow;
        final ImageView imageView = binding.imageView;

        montagemViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
                imageView.setImageResource(R.drawable.image2);
            }
        });
        return root;
    }*/



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}