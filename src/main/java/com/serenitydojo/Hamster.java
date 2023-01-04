package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteToy;

    public Hamster(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public String play() {
        return "runs in " + favoriteToy.toLowerCase();
    }
}
