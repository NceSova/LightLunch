package com.example.lightlunch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        ReciepesApiService.getInstance().getReciepes().enqueue(new Callback<List<Reciepe>>() {
            @Override
            public void onResponse(@NonNull Call<List<Reciepe>> call, @NonNull Response<List<Reciepe>> response) {
                Log.d("DEBUG", "debug");
            }

            @Override
            public void onFailure(@NonNull Call<List<Reciepe>> call, @NonNull Throwable t) {
                Log.e("FAIL", "fail");
            }
        });

        List<Reciepe> Reciepts = new ArrayList<>();
        Reciepts.add(new Reciepe("Салат «Студенческий»",
                "Самый распространенный рецепт этого салата – сухарики с хреном, красная фасоль из банки и сосиски. Это все перемешивается и заправляется майонезом, солить не нужно. Кстати, есть еще второй вариант. Вам понадобятся помидор, вареная колбаса, капуста, кукуруза и, конечно, майонез. Также можно отварить куриную грудку, но это уже явно не студенческий салат!",
                "S"));

        ReciepeAdapter adapter = new ReciepeAdapter(Reciepts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        BottomNavigationView BNView = findViewById(R.id.bottom_navigation);
        BNView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.page_1:

                    case R.id.page_2:

                    case R.id.page_3:

                    default: return false;
                }
            }
        });
    }
}