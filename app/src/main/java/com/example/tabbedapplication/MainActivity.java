package com.example.tabbedapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    private SectionsPageAdapter mSectionsPageAdapter;

    //The ViewPager is where the fragments content will be displayed
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //Set up the ViewPager with the SectionsPageAdapter.
        mViewPager = findViewById(R.id.view_pager);
        setupViewPager(mViewPager);

        //This is where the tab titles go
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    //This passes the fragment info to the Adapter--------------------------------------------------
    private void setupViewPager(ViewPager viewPager)
    {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Frag1(), "First Tab");
        adapter.addFragment(new Frag2(), "Second Tab");
        adapter.addFragment(new Frag3(), "Third Tab");
        viewPager.setAdapter(adapter);
    }
    //End-------------------------------------------------------------------------------------------
}