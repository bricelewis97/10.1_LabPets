package com.tts;

public class Pet {


    private String petName;
    private int petAge;
    private String petLocation;
    private String petType;

    public Pet() {
        petName = "";
        petAge = 0;
        petLocation = "";
        petType = "";
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setPetLocation(String petLocation) {
        this.petLocation = petLocation;
    }
 }


