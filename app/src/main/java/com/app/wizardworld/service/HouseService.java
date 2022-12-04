package com.app.wizardworld.service;

import com.app.wizardworld.model.House;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HouseService {
    @GET("houses/")
    Call<List<House>> getAllHouses();
}
