package com.atomikrobot.atomikweather.models;

public class Clouds {
    private float all;


    // Getter Methods

    public float getAll() {
        return all;
    }

    // Setter Methods

    public void setAll(float all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}
