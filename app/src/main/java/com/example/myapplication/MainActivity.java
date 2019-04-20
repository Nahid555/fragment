package com.example.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button b1;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                BlankFragment2 blankFragment=new BlankFragment2();
                fragmentTransaction.add(R.id.f2,blankFragment);
                fragmentTransaction.commit();
            }
        });
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               FragmentManager fragmentManager=getSupportFragmentManager();
               FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

               BlankFragment blankFragment=new BlankFragment();
               fragmentTransaction.add(R.id.f1,blankFragment);
               fragmentTransaction.commit();
           }
       });






    }


}
