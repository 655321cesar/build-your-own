package com.csantos.buildyourown.ui.produto;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.csantos.buildyourown.databinding.FragmentProdutoBinding;
import com.csantos.buildyourown.databinding.FragmentWebviewBinding;
import com.csantos.buildyourown.ui.videoview.VideoviewFragment;

public class ProdutoFragment extends Fragment {

    private ProdutoViewModel produtoViewModel;
    private FragmentProdutoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        produtoViewModel =
                new ViewModelProvider(this).get(ProdutoViewModel.class);

        binding = FragmentProdutoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final WebView webView = binding.produto;

        produtoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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

