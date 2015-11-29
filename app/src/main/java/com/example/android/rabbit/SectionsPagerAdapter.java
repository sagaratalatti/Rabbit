package com.example.android.rabbit;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.rabbit.camera.CameraFragment;

/**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        protected Context mContext;

        public SectionsPagerAdapter(Context context,FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a InboxFragment (defined as a static inner class below).
            switch (position){
                case 0:
                    return new InboxFragment();
                case 1:
                    return new CameraFragment();
                case 2:
                    return new FeedsFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return mContext.getString(R.string.title_section1).toUpperCase();
                case 1:
                    return mContext.getString(R.string.title_section2).toUpperCase();
                case 2:
                    return mContext.getString(R.string.title_section3).toUpperCase();
            }
            return null;
        }

    }
