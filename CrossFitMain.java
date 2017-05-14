package com.example.daily.crossfit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.ImageButton;




public class CrossFitMain extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fit_main);







        ImageButton cmale = (ImageButton) findViewById(R.id.male);
        ImageButton cfemale = (ImageButton) findViewById(R.id.female);
        ImageButton cnutrients = (ImageButton) findViewById(R.id.nutrients);
        ImageButton cworkout = (ImageButton) findViewById(R.id.workout);

        cmale.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

            Intent i = new Intent(CrossFitMain.this,Male.class);
                startActivity(i);
            }
        });

        cfemale.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(CrossFitMain.this, Female.class);
                startActivity(i);
            }
        });

        cnutrients.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i=new Intent(CrossFitMain.this, Nutrients.class);
                startActivity(i);
            }
        });

        cworkout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                                     Intent intent = new Intent(CrossFitMain.this, CrossFitWorkout.class);
                                     startActivity(intent);}

            }
        );


    }


}