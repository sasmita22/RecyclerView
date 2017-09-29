package com.hiroshi.myapp;

/**
 * Created by hiros on 9/28/2017.
 */

public class Profile {
    private String nama;
    private String status;
    private int image;

    public Profile(String nama, String status, int image) {
        this.nama = nama;
        this.status = status;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public int getImage() {
        return image;
    }
}
