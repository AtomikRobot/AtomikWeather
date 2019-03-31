package com.atomikrobot.atomikweather.models;

import java.util.ArrayList;

public class CitiesModel {
    private String message;
    private String cod;
    private float count;
    private ArrayList <listModel> list = new ArrayList <listModel> ();


    // Getter Methods

    public String getMessage() {
        return message;
    }

    public String getCod() {
        return cod;
    }

    public float getCount() {
        return count;
    }

    public ArrayList<listModel> getList() {
        return list;
    }

    // Setter Methods

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public void setList(ArrayList<listModel> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CitiesModel{" +
                "message='" + message + '\'' +
                ", cod='" + cod + '\'' +
                ", count=" + count +
                '}';
    }
}
