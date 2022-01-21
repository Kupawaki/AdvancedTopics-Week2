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

import java.util.zip.Inflater;

public class Frag1 extends Fragment
{
    public static final String TAG = "Frag1";

    private Button btnTEST1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_1, container, false);

        btnTEST1 = view.findViewById(R.id.btnTEST1);
        btnTEST1.setOnClickListener(view1 ->
        {
            Toast.makeText(getActivity(), "Button 1 Pressed", Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
