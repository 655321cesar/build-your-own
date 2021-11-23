package com.csantos.buildyourown.ui.videoview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.csantos.buildyourown.databinding.FragmentVideoBinding;
import com.csantos.buildyourown.ui.avisos.AvisosFragment;

public class VideoviewFragment extends Fragment {

    private VideoViewModel videoViewModel;
    private @NonNull FragmentVideoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        videoViewModel =
                new ViewModelProvider(this).get(VideoViewModel.class);

        binding = FragmentVideoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textSlideshow;

        final VideoView videoView = binding.videoView;
        videoView.setVideoPath(getArguments().getString("msg"));
        videoView.start();

       /* videoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
                videoView.setVideoPath("https://drive.google.com/uc?authuser=0&id=1L4-GI-KQWRuUM93y33tHd0ykwh3aMYdo&export=download");
                videoView.start();
            }
        });*/
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public static VideoviewFragment newInstance(String text) {

        VideoviewFragment f = new VideoviewFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}