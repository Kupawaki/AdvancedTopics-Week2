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

public class Frag2 extends Fragment
{
    public static final String TAG = "Frag2";

    private Button btnTEST2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_1, container, false);

        btnTEST2 = view.findViewById(R.id.btnTEST2);
        btnTEST2.setOnClickListener(view1 ->
        {
            Toast.makeText(getActivity(), "Button 2 Pressed", Toast.LENGTH_LONG).show();
        });

        return view;
    }
}
