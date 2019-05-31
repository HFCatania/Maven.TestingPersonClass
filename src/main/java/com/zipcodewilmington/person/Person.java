package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private String hairColor;
    private String eyeColor;
    private String homeTown;
    private boolean drives;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        height = 6;
        hairColor= "brown";
        eyeColor = "green";
        homeTown = "Philadelphia";
        drives = true;

    }


    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int height, String hairColor, String eyeColor, String homeTown, boolean drives) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.homeTown = homeTown;
        this.drives = drives;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setDrives(boolean drives) {
        this.drives = drives;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public String getHairColor() {
        return this.hairColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public boolean getDrives() {
        return this.drives;
    }
}
