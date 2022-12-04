package com.app.wizardworld.service;

import com.app.wizardworld.model.Spell;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpellService {

    @GET("Spells/")
    Call<List<Spell>> getAllSpells();
}
