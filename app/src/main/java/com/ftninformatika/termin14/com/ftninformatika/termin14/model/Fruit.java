package com.ftninformatika.termin14.com.ftninformatika.termin14.model;

public class Fruit {
    private int id;
    private String name;
    private String description;
    private String imageFilename;
    private float rating;

    public static Fruit[] fruits ={
            new Fruit(0,"Apple","round and sweet","apple.jpg",3),
            new Fruit(1,"orange","sweet and orange","orange.jpg",4),
            new Fruit(2,"grape","red or white","grape.jpg", 5)
    };

    public Fruit(int id,String name, String description, String imageFilename,float rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageFilename = imageFilename;
        this.rating = rating;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }
}
