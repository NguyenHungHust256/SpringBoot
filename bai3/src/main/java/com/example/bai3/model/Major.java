package com.example.bai3.model;

public class Major {
    private int majorId;
    private String name;

    public Major() {
    }

    public Major(int majorId, String name) {
        this.majorId = majorId;
        this.name = name;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
