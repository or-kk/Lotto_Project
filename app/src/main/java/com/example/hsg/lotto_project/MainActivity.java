package com.example.hsg.lotto_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hsg.lotto_project.com.example.lotto_project.ActivityName;
import com.example.hsg.lotto_project.com.example.lotto_project.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity   {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupLotto();

    }

    private void setupLotto(){

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(this, getMenu());
        mRecyclerView.setAdapter(mAdapter);

    }

    private List<ActivityName> getMenu(){

        List<ActivityName> lottoList = new ArrayList<>();

        lottoList.add(new ActivityName("랜덤생성",RandomActivity.class));
        lottoList.add(new ActivityName("지정생성",AppointActivity.class));

        return  lottoList;

    }


}
