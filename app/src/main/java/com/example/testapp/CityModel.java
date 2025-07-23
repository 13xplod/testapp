package com.example.testapp;

public class CityModel {
    String cityName;
    String regNumber;
    int imageRes;

    public CityModel(int imageRes, String regNumber, String cityName) {
        this.imageRes = imageRes;
        this.regNumber = regNumber;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getImage() {
        return imageRes;
    }
}
