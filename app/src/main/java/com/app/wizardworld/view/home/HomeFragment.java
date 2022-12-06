package com.app.wizardworld.view.home;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.wizardworld.R;
import com.app.wizardworld.adapter.SpellAdapter;
import com.app.wizardworld.controller.AppController;
import com.app.wizardworld.model.Spell;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    View view;
    Toolbar toolbar;
    RecyclerView recyclerView;
    SpellAdapter spellAdapter;
    Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        spellAdapter = new SpellAdapter();

        getAllSpells();
        return  view;
    }

    public void getAllSpells(){

        Call<List<Spell>> spellsList = AppController.getSpellService().getAllSpells();
        spellsList.enqueue(new Callback<List<Spell>>() {
            @Override
            public void onResponse(Call<List<Spell>> call, Response<List<Spell>> response) {
                if (response.isSuccessful()){
                    List<Spell> spellResponseList = response.body();

                    spellAdapter.setData(spellResponseList);
                    recyclerView.setAdapter(spellAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<Spell>> call, Throwable t) {
                Log.e("Falha na requisição", t.getLocalizedMessage());


            }
        });
    }
}
