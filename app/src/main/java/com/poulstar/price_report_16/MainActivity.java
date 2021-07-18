package com.poulstar.price_report_16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment f1= new MainFragment();
        FragmentManager f1_manager = getSupportFragmentManager();
        FragmentTransaction f1_tranTransaction = f1_manager.beginTransaction();
        f1_tranTransaction.replace(R.id.fragment_layout, f1);
        f1_tranTransaction.commit();
    }
}