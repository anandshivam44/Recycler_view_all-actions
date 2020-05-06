package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ProgrammingAdapter.CityAdapterEvents , View.OnClickListener {
    Button bt;
    ArrayList<String> daysOfWeek=new ArrayList<>();
    ArrayList<String> newArray=new ArrayList<>();
    ProgrammingAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt1=findViewById(R.id.button_1);
        Button bt2=findViewById(R.id.button_2);
        RecyclerView recyclerView=findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("1");
        daysOfWeek.add("2");
        daysOfWeek.add("3");
        daysOfWeek.add("4");
        daysOfWeek.add("5");
        daysOfWeek.add("6");
        daysOfWeek.add("7");
        daysOfWeek.add("8");
        daysOfWeek.add("9");
        daysOfWeek.add("10");
        daysOfWeek.add("11");
        newArray.add("Shivam");
        newArray.add("is");
        newArray.add("a");
        newArray.add("good");
        newArray.add("boy");


        mAdapter=new ProgrammingAdapter(this,daysOfWeek);
        recyclerView.setAdapter(mAdapter);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);

//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                daysOfWeek.add("Shivam Anand");
//                mAdapter.notifyItemInserted(daysOfWeek.size()-1);
//            }
//        });
    }

    @Override
    public void onCityClicked(int position) {
        Toast.makeText(this, "position"+" "+daysOfWeek.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "OnClick executed", Toast.LENGTH_SHORT).show();
        switch (v.getId()){
            case R.id.button_1:
                daysOfWeek.add(2,"Shivam Anand");
                mAdapter.notifyItemInserted(2);
                break;
            case R.id.button_2:
                daysOfWeek.clear();
                daysOfWeek.addAll(newArray);
                mAdapter.notifyDataSetChanged();

        }
    }


}
