package com.example.my_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AllTrainingAactivity extends AppCompatActivity {
    private static final String TAG = "AllTrainingAactivity";

    private RecyclerView recyclerView;
    private trainingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_training_aactivity);
        recyclerView=findViewById(R.id.recyclerView);

        adapter=new trainingAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<Training>allTraings=Utils.getTrainings();
        if (null != allTraings){
            adapter.setTrainings(allTraings);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent =new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}