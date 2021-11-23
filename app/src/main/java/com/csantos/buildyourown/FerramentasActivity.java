package com.csantos.buildyourown;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.csantos.buildyourown.ui.avisos.AvisosFragment;
import com.csantos.buildyourown.ui.image.ImageFragment;
import com.csantos.buildyourown.ui.vectary.FerramentasFragment;
import com.csantos.buildyourown.ui.videoview.VideoviewFragment;
import com.csantos.buildyourown.ui.webview.WebviewFragment;

public class FerramentasActivity extends FragmentActivity {
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
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1e4FKWnIL5XjvcaWz-x2100SzXGqsyxlU");
                case 1: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1F6jIqCSt4HKNV8SfkFB_fcm6CSSmDV6j");
                case 2: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1e5HBwquzFBwlVGrdekqsOfYHwmWjG6L5");
                case 3: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=3edf71a1-62e2-490f-b5ee-fa4a32633dae&env=studio3");
                case 4: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1MZDu3IWMavtNYJhvXfoJ8148a8Nh2gVR");
                case 5: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=e45aab04-50f2-4320-aa8b-03d21eeb8f11&env=studio3");
                case 6: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1auPeN6ZUULK8QkcOEPWDb4uHbUKtVDia");
                case 7: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=c10426b5-e9ee-44de-84c3-8b969535a60e&env=studio3");
                case 8: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=15aeVgo2NC3fvbsy4CbEo6bJErE7KO6os");
                case 9: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=0aaeb215-91e3-4038-8d6c-685210028b02&env=studio3");
                case 10: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1j4vN6AXJr2ZnGk-cfteTly_zrP83KxJO");
                case 11: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=1e00cbff-f9c6-4ac2-93fc-9c84c24ef962&env=studio3");
                default: return AvisosFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 12;
        }
    }
}
