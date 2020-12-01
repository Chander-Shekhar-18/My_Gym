package com.example.my_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EditActivity extends AppCompatActivity implements PlanAdpter.RemovePlan {
    private static final String TAG = "EditActivity";

    private TextView txtDay;
    private RecyclerView recyclerView;
    private Button btnAddPlan;

    private PlanAdpter adpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        initViews();

        adpter=new PlanAdpter(this);
        adpter.setType("edit");
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Intent intent=getIntent();
        if (null!=intent){
            String day=intent.getStringExtra("day");
            if (null!=day){
                txtDay.setText(day);
                ArrayList<Plan>plans=getPlanByDay(day);
                adpter.setPlans(plans);
            }
        }
        btnAddPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addPLanTOIntent = new Intent(EditActivity.this,AllTrainingAactivity.class);
                startActivity(addPLanTOIntent);
            }
        });
    }

    private ArrayList<Plan> getPlanByDay(String day) {
        ArrayList<Plan> allPlans = Utils.getPlans();
        ArrayList<Plan> plans = new ArrayList<>();
        for (Plan p : allPlans) {
            if (p.getDay().equalsIgnoreCase(day)) {
                plans.add(p);
            }
        }
        return plans;
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,PlanActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initViews() {
        Log.d(TAG, "initViews: Started");
        txtDay=findViewById(R.id.txtDay);
        recyclerView=findViewById(R.id.recyclerView);
        btnAddPlan=findViewById(R.id.btnAddPlanEdt);
    }

    @Override
    public void onRemoveResult(Plan plan) {
        if (Utils.removePlan(plan)){
            Toast.makeText(this, "Training Removed From Your Plan", Toast.LENGTH_SHORT).show();
            adpter.setPlans(getPlanByDay(plan.getDay()));
        }
    }
}