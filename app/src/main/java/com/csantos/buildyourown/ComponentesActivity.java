package com.csantos.buildyourown;


import android.os.Bundle;
import android.webkit.WebViewFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.csantos.buildyourown.ui.avisos.AvisosFragment;
import com.csantos.buildyourown.ui.image.ImageFragment;
import com.csantos.buildyourown.ui.videoview.VideoviewFragment;
import com.csantos.buildyourown.ui.webview.WebviewFragment;

public class ComponentesActivity extends FragmentActivity {
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
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Rso1E1U3393gE-hG_vOCiKyy72yBOFar");
                case 1: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=165Yx89XMEg4I4FFZb3WY_S89pIH-SJIl");
                case 2: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1wRZixlsqim5d_WERujYKc_dn5XNYrRkg");
                case 3: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1IMqxsD7JgzKvvhLkUa3gzyNn0FYsrQnW");
                case 4: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=290aa97c-c341-495b-a580-ff2d1030f63b&env=studio3");
                case 5: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1BZKZFC14y9YHznnrqreT2cyB4_8471fO");
                case 6: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=87ea6853-2fc8-4b92-b5a4-670cd81e9569&env=studio3");
                case 7: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1PS0vP9Pg-p5iH4jJWqub7-bpl5-Q7077");
                case 8: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=21aace86-5860-4022-8b2c-d0c4d2e5066e&env=studio3");
                case 9: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=13pbA0JEF2Pg0cR-C4lp-fAVyoZyMo2Lv");
                case 10: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=5642d903-284f-4fd4-974a-7123df636a26&env=studio3");
                case 11: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1PyX1BE4hMgs57VrI4GNOqgT26LYnPEtO");
                case 12: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=9f1296a6-4901-49ba-aeb2-a45a048a81a5&env=studio3");
                case 13: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1_mDJactBmBhQYcugd_vr14IjMPmBA2Cs");
                case 14: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=412f058c-1088-47a5-831c-36774cc45fb7&env=studio3");
                case 15: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1QyLvhyO6YUxgz5FteQR3yW_hXG7vFJ0n");
                case 16: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=313b029b-a298-42ca-80bf-2bcfa542ddef&env=studio3");
                case 17: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1RrA2P-EiRmUOjP_T5Cb012FT4Jin_3Ka");
                case 18: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=1ba6c6e2-2577-449f-b945-657545856e17&env=studio3");
                case 19: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1cJKrHNwlq4-tS_vYUhiBpSpyhNTu-0oR");
                case 20: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=78797047-4289-4cfb-aee1-7e47f189bbff&env=studio3");
                case 21: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1u54Cg6yCgWB39tff0QjN0AVgfqVyczJl");
                case 22: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=8e1e00f8-e8c2-4a02-a35b-29a2f6cbb015&env=studio3");
                case 23: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1y_KbY8spL7ZAaEdi9IFBo8JbudJkYMx5");
                case 24: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=0cddd5ec-8d26-4ce1-afe5-d5157c27c5e9&env=studio3");
                case 25: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1o5VOWdoqUsXU2yPAbiDESAYgoTcOXVeh");
                case 26: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=f24f2f2a-ea26-4524-9e89-54ce297ea674&env=studio3");

                default: return AvisosFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 27;
        }
    }
}
