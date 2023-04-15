package com.example.lightlunch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ReciepesApi {

    @GET("reciepe")
    Call<List<Reciepe>> getReciepes();
}
