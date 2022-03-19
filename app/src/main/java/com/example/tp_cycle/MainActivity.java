package com.example.tp_cycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tp_cycle.adapter.StarAdapter;
import com.example.tp_cycle.beans.Star;
import com.example.tp_cycle.service.StarService;


public class MainActivity extends AppCompatActivity  {

    private StarService fs;
    private RecyclerView recycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}



