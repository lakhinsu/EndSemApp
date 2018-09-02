package com.example.lak.endsemapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lak on 01-09-2018.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList=new ArrayList<>();
        private final List<String> mTtitleList=new ArrayList<>();

        public void addFragment(Fragment fragment,String title){
            mFragmentList.add(fragment);
            mTtitleList.add(title);
        }

        public SectionsPagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {

            return mFragmentList.size();
        }

        public CharSequence getTitle(int position){

            return mTtitleList.get(position);
        }
}
