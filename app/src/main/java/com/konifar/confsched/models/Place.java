package com.konifar.confsched.models;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Place {

    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;

    public Place() {
    }

}
