package com.example.tabbedapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    //This function is how we add our three fragments to the above lists----------------------------
    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    //End-------------------------------------------------------------------------------------------

    //Constructor-----------------------------------------------------------------------------------
    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }
    //End-------------------------------------------------------------------------------------------

    //Required methods for this adapter to function, similar to a recyclerAdapter-------------------
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
    //End-------------------------------------------------------------------------------------------
}
