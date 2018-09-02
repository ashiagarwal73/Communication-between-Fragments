package com.example.ashi.communicationbetweenfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.CallMethod{
    FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //replacing container with fragments
        fragmentTransaction.replace(R.id.fragA, new FragmentA());
        fragmentB=new FragmentB();
        fragmentTransaction.replace(R.id.fragB,fragmentB);
        fragmentTransaction.commit();
    }

    @Override
    public void sendMessageToB(String msg) {
    //callback from fragment A
    fragmentB.showMessageInB("Your message:"+msg);//invoking method of fragment B
    }

}
