package com.example.electronica;

public class Microcontrollers {
    private String name;
    private String typ;
    private int image;
    private String vendor;

    public Microcontrollers(String name, String typ, int image,String vendor) {
        this.name = name;
        this.typ = typ;
        this.image = image;
        this.vendor=vendor;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return typ;
    }

    public int getImage() {
        return image;
    }

    public String getVendor() { return vendor;}

}