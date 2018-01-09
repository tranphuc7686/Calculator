package com.example.admin.trainningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyAdapter mRcvAdapter;
    List<bean_Recy> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyView);
        data = new ArrayList<>();
        data.add(new bean_Recy("Wonder Woman","http://cdn-static.denofgeek.com/sites/denofgeek/files/styles/main_wide/public/wonder_woman_2_gal_gadot_quits_brett_ratner.jpg?itok=rAY70wub"));
        data.add(new bean_Recy("Iron Man","https://www.scienceabc.com/wp-content/uploads/2015/12/iron-man-suit.jpg"));
        data.add(new bean_Recy("Batman","https://wallpapersite.com/images/pages/pic_w/9687.jpg"));
        data.add(new bean_Recy("Superman","https://heroichollywood.b-cdn.net/wp-content/uploads/2017/10/Henry-Cavill-Superman-Man-of-Steel.jpg?x42694"));

        mRcvAdapter = new RecyAdapter(data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);

    }
}
