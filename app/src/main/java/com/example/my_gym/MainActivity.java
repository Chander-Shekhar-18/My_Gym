package com.example.my_gym;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button btnPlans,btnAllTrainings,btnAbout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiViews();
        Utils.initTrainings();


        btnAllTrainings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllTrainingAactivity.class);
                startActivity(intent);
            }
        });
        btnPlans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PlanActivity.class);
                startActivity(intent);
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context;
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                        .setTitle("About")
                        .setMessage("Created By Chander Shekhar\n"+
                                "Visit For More")
                        .setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setPositiveButton("Visit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(MainActivity.this,Insta.class);
                                startActivity(intent);
                            }
                        });
                builder.create().show();
            }
        });
    }

    private void initiViews() {
        Log.d(TAG, "initiViews: Started");
        btnPlans=findViewById(R.id.btnPlanActivity);
        btnAbout=findViewById(R.id.btnAbout);
        btnAllTrainings=findViewById(R.id.btnAllActivity);
    }
}