package com.example.atabbedapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment
{
    public static final String TAG = "Frag3";

    private Button btnTEST3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_1, container, false);

        btnTEST3 = view.findViewById(R.id.btnTEST3);
        btnTEST3.setOnClickListener(view1 ->
        {
            Toast.makeText(getActivity(), "Button 3 Pressed", Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
