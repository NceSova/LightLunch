package com.example.lightlunch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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

            }
        });

        List<Reciepe> Reciepts = new ArrayList<>();
        Reciepts.add(new Reciepe("S","A","S"));

        ReciepeAdapter adapter = new ReciepeAdapter(Reciepts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}