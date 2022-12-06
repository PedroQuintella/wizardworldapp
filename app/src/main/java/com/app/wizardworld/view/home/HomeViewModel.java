package com.app.wizardworld.view.home;

import android.util.Log;

import com.app.wizardworld.R;
import com.app.wizardworld.adapter.SpellAdapter;
import com.app.wizardworld.controller.AppController;
import com.app.wizardworld.model.Spell;
import com.app.wizardworld.model.House;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();

        Call<List<Spell>> spellList = AppController.getSpellService().getAllSpells();
        spellList.enqueue(new Callback<List<Spell>>() {
            @Override
            public void onResponse(Call<List<Spell>> call, Response<List<Spell>> response) {
                if (response.isSuccessful()){
                    Log.e("Sucesso na requisição", response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<Spell>> call, Throwable t) {
                Log.e("Falha na requisição", t.getLocalizedMessage());


            }
        });

    }

    public LiveData<String> getText() {
        return mText;
    }
