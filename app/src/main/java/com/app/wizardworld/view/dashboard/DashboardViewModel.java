package com.app.wizardworld.view.dashboard;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.wizardworld.controller.AppController;
import com.app.wizardworld.model.House;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();

        Call<List<House>> housesList = AppController.getHouseService().getAllHouses();
        housesList.enqueue(new Callback<List<House>>() {
            @Override
            public void onResponse(Call<List<House>> call, Response<List<House>> response) {
                if (response.isSuccessful()){
                    Log.e("Sucesso na requisição", response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<House>> call, Throwable t) {
                Log.e("Falha na requisição", t.getLocalizedMessage());


            }
        });

    }

    public LiveData<String> getText() {
        return mText;
    }
}
