package com.example.tabbedapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    //Set up and inflate various layouts and views-------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up the ViewPager with the SectionsPageAdapter.
        //The ViewPager is where the fragments content will be displayed
        ViewPager myViewPager = findViewById(R.id.view_pager);
        setupViewPager(myViewPager);

        //This is where the tab titles go
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(myViewPager);
    }
    //End-------------------------------------------------------------------------------------------

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