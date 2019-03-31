package com.atomikrobot.atomikweather.models;

import com.atomikrobot.atomikweather.models.Clouds;
import com.atomikrobot.atomikweather.models.Coord;
import com.atomikrobot.atomikweather.models.Main;
import com.atomikrobot.atomikweather.models.Sys;
import com.atomikrobot.atomikweather.models.Wind;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class listModel {
    private float id;
    private String name;
    @SerializedName("coord")
    private Coord CoordObject;
    @SerializedName("main")
    private Main MainObject;
    private float dt;
    @SerializedName("wind")
    private Wind WindObject;
    @SerializedName("sys")
    private Sys SysObject;
    private String rain = null;
    private String snow = null;
    @SerializedName("clouds")
    private Clouds CloudsObject;
    private ArrayList< weatherModel > weather = new ArrayList < weatherModel > ();


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return CoordObject;
    }

    public Main getMain() {
        return MainObject;
    }

    public float getDt() {
        return dt;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Sys getSys() {
        return SysObject;
    }

    public String getRain() {
        return rain;
    }

    public String getSnow() {
        return snow;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    public Coord getCoordObject() {
        return CoordObject;
    }

    public Main getMainObject() {
        return MainObject;
    }

    public Wind getWindObject() {
        return WindObject;
    }

    public Sys getSysObject() {
        return SysObject;
    }

    public Clouds getCloudsObject() {
        return CloudsObject;
    }

    public ArrayList<weatherModel> getWeather() {
        return weather;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoord(Coord coordObject) {
        this.CoordObject = coordObject;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public void setSnow(String snow) {
        this.snow = snow;
    }

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    public void setCoordObject(Coord coordObject) {
        CoordObject = coordObject;
    }

    public void setMainObject(Main mainObject) {
        MainObject = mainObject;
    }

    public void setWindObject(Wind windObject) {
        WindObject = windObject;
    }

    public void setSysObject(Sys sysObject) {
        SysObject = sysObject;
    }

    public void setCloudsObject(Clouds cloudsObject) {
        CloudsObject = cloudsObject;
    }

    public void setWeather(ArrayList<weatherModel> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "listModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CoordObject=" + CoordObject +
                ", MainObject=" + MainObject +
                ", dt=" + dt +
                ", WindObject=" + WindObject +
                ", SysObject=" + SysObject +
                ", rain='" + rain + '\'' +
                ", snow='" + snow + '\'' +
                ", CloudsObject=" + CloudsObject +
                ", weather=" + weather +
                '}';
    }
}




