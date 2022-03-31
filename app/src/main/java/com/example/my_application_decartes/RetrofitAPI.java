package com.example.my_application_decartes;

import com.google.android.gms.tasks.Task;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {


    @POST("/AddData")
    Call<TauxPollution> createTask(@Body TauxPollution taux);


}
