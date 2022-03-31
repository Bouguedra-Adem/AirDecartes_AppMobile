package com.example.my_application_decartes;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {
    private static RetrofitAPI service;
    private static ApiManager apiManager;

    private ApiManager() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://airdecartes.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(RetrofitAPI.class);
    }
    public static ApiManager getInstance() {
        if (apiManager == null) {
            apiManager = new ApiManager();
        }
        return apiManager;
    }
    public void AddData(TauxPollution dt, Callback<TauxPollution> callback) {
        Log.e("EEE",dt.toString());
        Call<TauxPollution> userCall = service.createTask(dt);
        userCall.enqueue(callback);
    }
}
