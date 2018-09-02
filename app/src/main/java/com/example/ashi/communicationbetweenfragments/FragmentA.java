package com.example.ashi.communicationbetweenfragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FragmentA extends Fragment {
    CallMethod callMethod;
    EditText editText;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callMethod=(CallMethod)context;//registers the activity while attaching the fragment and assigning the reference to object of interface
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1, container, false);
        editText=view.findViewById(R.id.editText);
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callMethod.sendMessageToB(editText.getText().toString());//this method will be called inside the activity on click from fragment since the activity implements this interface
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
    interface CallMethod{

        void sendMessageToB(String msg);
    }
}
