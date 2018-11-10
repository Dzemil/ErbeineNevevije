package com.example.dzemil.erbeinenevevije;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<Hadith> hadiths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hadiths = new ArrayList<>();

        Hadith hadith1 = new Hadith("Hadith 1","Bosnian", "Arabic");
        hadiths.add(hadith1);

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MainAdapter(hadiths);
        recyclerView.setAdapter(adapter);
    }
}
