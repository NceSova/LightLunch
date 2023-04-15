package com.example.lightlunch;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class ReciepesApiService {

    private static ReciepesApi reciepesApi;

    private static ReciepesApi create() {
        return RetrofitService.getInstance().create(ReciepesApi.class);
    }

    public static ReciepesApi getInstance() {
        if (reciepesApi == null) reciepesApi = create();
        return reciepesApi;
    }
}
