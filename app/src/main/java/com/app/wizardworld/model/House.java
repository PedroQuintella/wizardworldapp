package com.app.wizardworld.model;

public class House {
    private String id;
    private String name;
    private String houseColours;
    private String founder;
    private String animal;
    private String element;
    private String ghost;
    private String commonRoom;

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

    public String getHouseColours() {
        return houseColours;
    }

    public void setHouseColours(String houseColours) {
        this.houseColours = houseColours;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }

    public String getCommonRoom() {
        return commonRoom;
    }

    public void setCommonRoom(String commonRoom) {
        this.commonRoom = commonRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", houseColours='" + houseColours + '\'' +
                ", founder='" + founder + '\'' +
                ", animal='" + animal + '\'' +
                ", element='" + element + '\'' +
                ", ghost='" + ghost + '\'' +
                ", commonRoom='" + commonRoom + '\'' +
                '}';
    }
}
