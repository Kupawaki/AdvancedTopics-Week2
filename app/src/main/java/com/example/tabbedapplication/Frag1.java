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
    private Button btnTEST;

    //Nullable is necessary because onCreateView may return null if we don't call it in MainActivity.onCreate
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        //Inflate the layout
        View view = inflater.inflate(R.layout.frag_1,container,false);

        //Get the button, set a listener, make a toast for testing
        btnTEST = view.findViewById(R.id.btnTEST1);
        btnTEST.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
