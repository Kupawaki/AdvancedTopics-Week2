package com.example.tabbedapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//The three fragments are identical, all comments here apply to the rest
public class Frag1 extends Fragment
{

    //Nullable is necessary because onCreateView may return null if we don't call it in MainActivity.onCreate
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //Inflate the layout
        View view = inflater.inflate(R.layout.frag_1,container,false);

        //Get the button, set a listener, make a toast for testing
        Button tab1BTN = view.findViewById(R.id.tab1BTN);
        tab1BTN.setOnClickListener(view1 -> Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show());

        return view;
    }
}
