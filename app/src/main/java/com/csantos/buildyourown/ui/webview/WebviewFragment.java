package com.csantos.buildyourown.ui.webview;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.csantos.buildyourown.databinding.FragmentWebviewBinding;

public class WebviewFragment extends Fragment {

    private WebviewViewModel webviewViewModel;
    private FragmentWebviewBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        webviewViewModel =
                new ViewModelProvider(this).get(WebviewViewModel.class);

        binding = FragmentWebviewBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final WebView webView = binding.webview;
        webviewViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(s);

            }
        });
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

