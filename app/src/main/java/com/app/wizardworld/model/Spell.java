package com.app.wizardworld.model;

public class Spell {
    private String id;
    private String name;
    private String incantation;
    private String effect;
    private String type;
    private String light;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncantation() {
        return incantation;
    }

    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", incantation='" + incantation + '\'' +
                ", effect='" + effect + '\'' +
                ", type='" + type + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
