package com.csantos.buildyourown;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.csantos.buildyourown.ui.avisos.AvisosFragment;
import com.csantos.buildyourown.ui.image.ImageFragment;
import com.csantos.buildyourown.ui.webview.WebviewFragment;

public class AvisosActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }
    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1HN9QKAe47o3sC4DIg9gcIynxPcFJj0Ow");
                case 1: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Sjy-sNcGOac0Zu65gi5_Wr0l40sEh6Ly");
                case 2: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1JGL4d5A6slvCUbyz-nSz1SSkxjQVqFUB");
                case 3: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1zBLGbLaKZ-lAhQcsAricnzIUDBRyWySw");
                case 4: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1WieGO6_uN0Cy-attgkp8wbDe6wTi-r80");
                case 5: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1_ls2BOv3m6i-iuuefzi4rPAT2LUDNe6H");

                default: return AvisosFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 6;
        }
    }
}
