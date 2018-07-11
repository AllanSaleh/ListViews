package com.example.allan.testlistviews;

public class Student {
    private String name;
    private int mark;
    private int imageResourceId;

    public Student(int imageResourceId, String name, int mark) {
        this.name = name;
        this.mark = mark;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
