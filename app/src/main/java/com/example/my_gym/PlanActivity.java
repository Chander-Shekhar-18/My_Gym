package com.example.my_gym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlanActivity extends AppCompatActivity {
    private static final String TAG = "PlanActivity";

    private TextView mondayEdit, tuesdayEdit, wednesdayEdit, thrusdayEdit, fridayEDit, saturdayEdit, sundayEdit;
    private RecyclerView mondayRecView, tuesdayRecView, wednesdayRecView, thrusdayRecView, fridayRecView, saturdayRecView, sundayRecView;
    private RelativeLayout noPlanRelLayout;
    private NestedScrollView nestedScrollView;
    private Button btnAddPlan;

    private PlanAdpter mondayAdapter, tuesdayAdapter, wednesdayAdapter, thrusdayAdapter, fridayAdapter, saturdayAdapter, sundayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        initViews();

        ArrayList<Plan> plans = Utils.getPlans();
        if (null != plans) {
            if (plans.size() > 0) {

                noPlanRelLayout.setVisibility(View.GONE);
                nestedScrollView.setVisibility(View.VISIBLE);
                initRecViews();

                setEditOnClickListeners();

            } else {
                noPlanRelLayout.setVisibility(View.VISIBLE);
                nestedScrollView.setVisibility(View.GONE);
                btnAddPlan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(PlanActivity.this, AllTrainingAactivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                });
            }

        } else {
            noPlanRelLayout.setVisibility(View.VISIBLE);
            nestedScrollView.setVisibility(View.GONE);
            btnAddPlan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PlanActivity.this, AllTrainingAactivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            });
        }
    }

    private void setEditOnClickListeners() {
        final Intent intent=new Intent(this,EditActivity.class);
        mondayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Monday");
                startActivity(intent);
            }
        });
        tuesdayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Tuesday");
                startActivity(intent);
            }
        });
        wednesdayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Wednesday");
                startActivity(intent);
            }
        });
        thrusdayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Thursday");
                startActivity(intent);
            }
        });
        fridayEDit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Friday");
                startActivity(intent);
            }
        });
        saturdayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Saturday");
                startActivity(intent);
            }
        });
        sundayEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("day","Sunday");
                startActivity(intent);
            }
        });
    }

    private void initRecViews() {
        Log.d(TAG, "initRecViews: started");
        mondayAdapter = new PlanAdpter(this);
        mondayRecView.setAdapter(mondayAdapter);
        mondayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        mondayAdapter.setPlans(getPlanByDay("Monday"));

        tuesdayAdapter = new PlanAdpter(this);
        tuesdayAdapter.setPlans(getPlanByDay("Tuesday"));
        tuesdayRecView.setAdapter(tuesdayAdapter);
        tuesdayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        wednesdayAdapter = new PlanAdpter(this);
        wednesdayAdapter.setPlans(getPlanByDay("Wednesday"));
        wednesdayRecView.setAdapter(wednesdayAdapter);
        wednesdayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        thrusdayAdapter = new PlanAdpter(this);
        thrusdayAdapter.setPlans(getPlanByDay("Thursday"));
        thrusdayRecView.setAdapter(thrusdayAdapter);
        thrusdayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        fridayAdapter = new PlanAdpter(this);
        fridayAdapter.setPlans(getPlanByDay("Friday"));
        fridayRecView.setAdapter(fridayAdapter);
        fridayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        saturdayAdapter = new PlanAdpter(this);
        saturdayAdapter.setPlans(getPlanByDay("Saturday"));
        saturdayRecView.setAdapter(saturdayAdapter);
        saturdayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        sundayAdapter = new PlanAdpter(this);
        sundayAdapter.setPlans(getPlanByDay("Sunday"));
        sundayRecView.setAdapter(sundayAdapter);
        sundayRecView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));


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
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void initViews() {
        Log.d(TAG, "initViews: Started");
        btnAddPlan = findViewById(R.id.btnAddPlan);
        nestedScrollView = findViewById(R.id.nestedScrollView);
        noPlanRelLayout = findViewById(R.id.noPlanRelLayout);
        mondayRecView = findViewById(R.id.mondayrecView);
        tuesdayRecView = findViewById(R.id.tuesdayrecView);
        wednesdayRecView = findViewById(R.id.wednesdayrecView);
        thrusdayRecView = findViewById(R.id.thrusdayrecView);
        fridayRecView = findViewById(R.id.fridayrecView);
        saturdayRecView = findViewById(R.id.saturdayrecView);
        sundayRecView = findViewById(R.id.sundayrecView);
        mondayEdit = findViewById(R.id.mondayEdit);
        tuesdayEdit = findViewById(R.id.tuesdayEdit);
        wednesdayEdit = findViewById(R.id.wednesdayEdit);
        thrusdayEdit = findViewById(R.id.ThrusdayEdit);
        fridayEDit = findViewById(R.id.fridayEdit);
        saturdayEdit = findViewById(R.id.saturdayEdit);
        sundayEdit = findViewById(R.id.sundayEdit);
    }
}