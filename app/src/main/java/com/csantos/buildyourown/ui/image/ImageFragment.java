package com.csantos.buildyourown.ui.image;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.csantos.buildyourown.R;
import com.csantos.buildyourown.databinding.FragmentHomeBinding;
import com.csantos.buildyourown.databinding.FragmentImageBinding;
import com.csantos.buildyourown.ui.videoview.VideoviewFragment;

import java.io.InputStream;
import java.net.URL;

public class ImageFragment extends Fragment {

    private ImageViewModel homeViewModel;
    private FragmentImageBinding binding;
    Context context;
    public final static String PACKAGE = "com.csantos.buildyourown";

    private int getDrawable(String name) {
        return getId(name, "drawable");
    }

    private int getId(String name, String type) {
        return getResources().getIdentifier(name, type, PACKAGE);
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



       homeViewModel =
                new ViewModelProvider(this).get(ImageViewModel.class);

        binding = FragmentImageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView imageView = binding.textImage;

        Glide.with(this).load(getArguments().getString("msg")).override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL).into(imageView);

        /*homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // Intent intent = new Intent(context, MontagemActivity.class);
               // startActivity(intent);

                imageView.setImageResource(R.drawable.img_home);
            }
        });*/
        return root;
        }

    public static ImageFragment newInstance(String text) {

        ImageFragment f = new ImageFragment();
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