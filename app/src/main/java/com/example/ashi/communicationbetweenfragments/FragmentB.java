package com.example.ashi.communicationbetweenfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2, container, false);
        // Inflate the layout for this fragment
        textView=view.findViewById(R.id.data);
        return view;
    }

    public void showMessageInB(String msg)
    {
        textView.setText(msg);
    }
}
