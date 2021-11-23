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

public class MontagemActivity extends FragmentActivity {
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
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1scAm2AQcSRdNIh23VHm3mVRcLNDiSukX");
                case 1: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1oBB6GhejInhXR5nFFU6k4WcYY9OFbpD_");
                case 2: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Fof7ZhedzGhwv6dHSwtttNBSnkWuSfvC");
                case 3: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1i7_-lqLQy1e1Bv6OVDyiS0DuDPpxGvtm");
                case 4: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1vLVNc08K_Pm1QaaAZ4Yzmxy9rSRR2r46");
                case 5: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1oHeREwkt-SwHN5-23THU_YxDrLoUeEb5");
                case 6: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1kKH-PGQ-MRc1UPDnIityLjwOYCSaIUtz");
                case 7: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=18aT1Fl77fosvLEsqbBoS5RIjGqwISow6");
                case 8: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1UjEiOR24eFh7BgarVTw628KPYxouUJfB");
                case 9: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1US36bkSFZFQgXcWHcQzM8u8lD-Hk2nkx");
                case 10: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1qKt8X--0tFuZ0Sy-dRTOlmAGt0F1lqqR");
                case 11: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1_rzQKbIGjlV6EVvDrAKe1lFRZP21Y95K");
                case 12: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1l2A74iRrw4Z2k-ji27UEq32zUDGMcWws");
                case 13: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1P03SUlox3NyEtQPe2zDWuNTbkYN2ArcO");
                case 14: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1YChLW2OOJO0XNxV3Y7f4tUc0_nB5k7Mv");
                case 15: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1_FnxcC-ufvbjP67Ic0gpZkREbU1XokZ2");
                case 16: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1MMP-UGDN7bPqsifC1ca3k_YZ4m1e7qwh");
                case 17: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1sZQ9d4do7J9gEdD3tPESRDQWIbLmUdvp");
                case 18: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1bHP-CFwlQthDOy2gnsOBiD3Th_UJGCna");
                case 19: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1a7mxbxP66aSuOKjEjz95BeVCMcn_vD2d");
                case 20: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1TpuuEiwejOWfXMcPPd6GmBE81-nZDLun");
                case 21: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1VOEODGZdAxTKiCllLBX67DExUR3G1a_X");
                case 22: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1GoAMlO0QsQSs-7GL2Y_BT2y5h8sBiVx_");
                case 23: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1U2atQkhvHoyzUnwuLLWb74tOLgOhGvMD");
                case 24: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Xckz2N8vFOR879-wszs5VD3iIuAfIaId");
                case 25: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1j47QwZCarFEZn8CFsPEG_T5FL-LeusWe");
                case 26: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=19Ue5V-hA2B7Sa6i2ysi8T1G4Yq6F9Ptg");
                case 27: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1bbmLfn1ZB65uJ8ZREqmBnry8VBtu9tve");
                case 28: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1bqAdbxCdkp5qgyLIGyM5uzuuBa2OHJsB");
                case 29: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1qoQj4VQn-_z1aXvRB4r2VPcH-zXmzwtv");
                case 30: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1uhmS3D5Z7j_v7unkLGYI2LvW8kN2H0GL");
                case 31: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1XkrRClIAp3JsjPc779P030igeNrDEMpf");
                case 32: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1uiRJj_gpo-dJesprEPm9Y7yBXRll8o29");
                case 33: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1nMfgg7FQdXXmVSpT0tagSSk7FayznE3y");
                case 34: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1DGjDEBNhCKiOTFpESaqwPictmJugkij8");
                case 35: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1S80xYxuZ42kbgDsB6WwB7YhDnFVQFjkg");
                case 36: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=10Ry8jwYMeAhpDdBIj8sWt7zJOBFDs5hO");
                case 37: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1KIACVb0b4rafHWGT_nFeAwLs6k_Ep3Ko");
                case 38: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1k2ybe6hwL0xs67GxaoQJEzO_dp7sxO33");
                case 39: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1-mQwU6IAqx8jV1-PgHUuvtLs_2-gUuEQ");
                case 40: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1VnWoHajJp8R8z-LufGclusAbVCMcI54d");
                case 41: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1zwJc15L05dJ7sD3-QqC_lTzAPbDolF8_");
                case 42: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1IiFWI6A-7kHnKLDfBWb3HWD85jooTLtm");
                case 43: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1WzI_jhY8py5Uza_b4E0i1YLn2dY_QidJ");
                case 44: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1IG8IwnzLpjDxVTl7-2WgWql2ZRL6cahf");
                case 45: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Dr5_N4X5QYM5vKtG__jYr8LrjR2tTir1");
                case 46: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1L4HaU2zcjgCwSORdw-hK9ZKANtxJ5Z8u");
                case 47: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1tJ8zhfv1qe68BlJKLCpIuEojCPtHScpe");
                case 48: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=19dEu8r1hB-CQKBHbX4okJYgynDjJ8yHA");
                case 49: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1IJUfRDe6cFdTCXEHh1bZJL5vHXLujgRH");
                case 50: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1RsBF6vtJhkBzIVCZqpTKW3qlKugHOjO8");
                case 51: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=14OIhZSAGC2x5ogtvWVCFKAR8hGpDhQDp");
                case 52: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1lmr1icTvLoBABplb3rXrKn460tmde9vY");
                case 53: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1CAS-arke8nJNc5TndMbgZRofGmCI7NlU");
                case 54: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1ZRsqZDeEJXY8fA-j0OiQO7saaU275Bgp");
                case 55: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=17isbp78G19kRvRc-f64JCex6iPF-7LIX");
                case 56: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1PmTXfJ7uFtMR48XR7P0jJIxGKymFpVNS");
                case 57: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1H3H5FUUmhSBe3NdhRJvVLQkSqjox1xFM");
                case 58: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=18zZ7Sp3qJVGlGGrYgkcZ0Qdkk_zUZ9vK");
                case 59: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1VZtEZjClAJNsW4leGnYtSM5ujmqvfc1w");
                case 60: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1asmtWVDh2fC9TTg0XlUBPYcPdLH9CIo_");
                case 61: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1AL7Bf3-0dVsTA_8Glc-zKmCTX39NyJR0");
                case 62: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=13IuexEY_4JoNdIyC2J0ogKzf4UFMRRgI");
                case 63: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1tNxXbkuet6TgM9UjmGZBFfcJMUiObb8B");
                case 64: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=17eGFxGmYHnLzjQ0MWiwkydKcSnWKEZyh");
                case 65: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=11mUgain75Ash-jpYowj-o_P20KyiKn8_");
                case 66: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1WNN-PRL39Blf--isWSz2TnDup6-mclXE");
                case 67: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=14NO4Hr3KltUgXwDx4nOysSnNd8VSKDjt");
                case 68: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Vy5UIdqL_z3BGT1R0zspGvGl-uhEcBJC");
                case 69: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1FbJZ2vKyCfqgy4_SOeRxoa8Qm3Gy6utk");
                case 70: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1mwD-WyXyVh8dVZdVwj3Z9WKNE0tr7pUk");
                case 71: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1uwLl0EcpzjoABhlDUedO4xpmDPvVnNVf");
                case 72: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1B89mZvmP8-E59_THEQypldmIyrdANjYA");
                case 73: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1luaSyOLwQo9qCrypK_bTIX0-eSHaAkU0");
                case 74: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=12TpbkwI8jgIFEjN0hZjhz_D5PxT1sf-8");
                case 75: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1pXyPDVLMsts5T7HBz4SZPZPsoVn0bqe0");
                case 76: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1pXyPDVLMsts5T7HBz4SZPZPsoVn0bqe0");
                case 77: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1dQROo0WAUHikdHDhQ90ULD5t_68S17p7");
                case 78: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1TIGeQjvsSO1ctGw80xfuXsTpnlemFuPG");
                case 79: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1Gq_FlebGbQwNrumXDghEluRcZBnNtr2H");
                case 80: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1uk5yPz11Latdyr0S7NyihSlPApJKaUAj");
                case 81: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1-ju9QyPK5BE1xb7AzrCQLhG6n1QCqI70");
                case 82: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1CI-S4zhNrZ781HfXwgfUr6zxTarG5adk");
                case 83: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1ZLMkgGsZPna43tTljY86QBZN7-H9nSva");
                case 84: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=17Y5zmBMSmasMnZ-QJ4IqB4Mf3pY2aXDY");
                case 85: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1gYY3Nl5zxOTOZIn7kdRoFfLM2kKGVT9j");
                case 86: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1E6FVYvKMuedxmGo4csyik-bofQKvZCpH");
                case 87: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1PKxAB16FA74BG1hDp4kWWXMMRS4rcWuR");
                case 88: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1NJ8iJVC-TeMbgc9RQApsumgoxJ_DYf3b");
                case 89: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1PLNYfJ6Twql_0evNO00wkkGyge609bN9");
                case 90: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=12NFgQfK5JFAKnxUHSaivAf1_2_kJzMnS");
                case 91: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1-nERvIDJV_LeGMCyE_uPCkLsoKNM4TOV");
                case 92: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1weZ9nfBYGcoba7sANFJbJ0skeyeZSsuH");
                case 93: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1QsemuEbpR-6cK57fDVozlf7WLIyp4nTi");
                case 94: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1I_85cjh1vix8uyLpVntaK88suvpHLYP1");
                case 95: return
                        VideoviewFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=16_BM881PPs3uX-MfE8kX30yYS5hBAwwg");
                case 96: return
                        ImageFragment.newInstance("https://drive.google.com/uc?authuser=0&export=view&id=1JwpHOWjq-23yN00CXCv1JB3oNovjjKwq");
                default: return AvisosFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 96;
        }
    }
}
