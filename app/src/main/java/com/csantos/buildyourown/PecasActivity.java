package com.csantos.buildyourown;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.csantos.buildyourown.ui.avisos.AvisosFragment;
import com.csantos.buildyourown.ui.image.ImageFragment;
import com.csantos.buildyourown.ui.videoview.VideoviewFragment;
import com.csantos.buildyourown.ui.webview.WebviewFragment;

public class PecasActivity extends FragmentActivity {
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
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1rA1vsblU6ClNkErnUhMw-2FViEU9RQQf");
                case 1: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=15JL0EU_WX8u12FS0e0kWYYVIksdEQQ3t");
                case 2: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1yhGyusMt8trlBv9IW-eVp_rCDYKZJ4ay");
                case 3: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=182aYHQATnuWVUVEHTtKiqbIjmYR36qaz");
                case 4: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=13ywC0HsO1ZuhFAE2kjL2JNEQHxqWOJzH");
                case 5: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=20f97fa2-16b7-48f1-a9ce-80610c7e4749&env=studio3");
                case 6: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Fcfne57DzJ4FZNtmudx65okfahe04SKN");
                case 7: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=bd50fabd-7276-4d35-ac09-7f305ee0c261&env=studio3");
                case 8: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1VgZFSK5gZ0qbk7vzm6k_lO1U0oCGZ39p");
                case 9: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=db864eb8-8d67-4c9f-b301-e7cad3ec234a&env=studio3");
                case 10: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1mJWuC0yrc0nXAbZTn6xsgGn6n8P0lt3r");
                case 11: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=c7e9255b-b991-4382-a186-3aa2ee662f49&env=studio3");
                case 12: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Xn_C_TZQ9r6DgK44txfNwCQpnG27XT27");
                case 13: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=22522b23-8243-43fb-90bb-345587f9b749&env=studio3");
                case 14: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1c9B7nYQJ4ld3QLAS5IpqbarOc4Gm1HK9");
                case 15: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=679ad688-9482-4e43-9bb5-dfb0d58abab5&env=studio3");
                case 16: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1XzUI_sTTWwQeXzsarGUyhhhAA9Kwszet");
                case 17: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=8f064685-4c2d-4917-8162-612e8dffd9c5&env=studio3");
                case 18: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1_QkxrY49Ehh0uVFcQsGpSBHjkdgjdNr-");
                case 19: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=69f19b20-4ff6-4072-9dce-7a82a0536363&env=studio3");
                case 20: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1HpWFPBkYlBD1nVJ4kp7CQtrHOO0QBpNh");
                case 21: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=9df0e59a-9a1d-4500-ae91-265c6ecd3a2c&env=studio3");
                case 22: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1F_KIBw7DAusGVToByxueq8WW0FfXpXyW");
                case 23: return
                        WebviewFragment.newInstance("https://www.vectary.com/viewer/v1/?model=9df0e59a-9a1d-4500-ae91-265c6ecd3a2c&env=studio3");

                default: return AvisosFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 24;
        }
    }
}
