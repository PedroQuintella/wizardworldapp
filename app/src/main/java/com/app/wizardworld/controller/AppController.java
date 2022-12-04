package com.app.wizardworld.controller;

import com.app.wizardworld.service.HouseService;
import com.app.wizardworld.service.SpellService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppController {

    private static Retrofit getRetrofit(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://wizard-world-api.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;
    }

    public static HouseService getHouseService(){
        HouseService houseService = getRetrofit().create(HouseService.class);
        return  houseService;
    }

    public static SpellService getSpellService(){
        SpellService spellService = getRetrofit().create(SpellService.class);
        return  spellService;
    }
}
