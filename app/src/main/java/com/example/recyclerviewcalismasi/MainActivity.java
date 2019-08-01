package com.example.recyclerviewcalismasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    KitapAdapter kitapAdapter;
    List<Kitap> kitapList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        kitapList= new ArrayList<>();
        kitapList.add(new Kitap("Çalıkuşu","Reşat Nuri Güntekin",R.drawable.calikusu));
        kitapList.add(new Kitap("Beyoğlu'nun En Güzel Abisi","Ahmet Ümit",R.drawable.beyoglu));

        kitapAdapter=new KitapAdapter(getApplicationContext(),kitapList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(kitapAdapter);

    }
}
