package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void testConstructorWithAll() {
        Person person = new Person();
        String expectedName = "";
        int expectedAge = Integer.MAX_VALUE;
        int expectedHeight = 6;
        String expectedHairColor= "brown";
        String expectedEyeColor = "green";
        String expectedHomeTown = "Philadelphia";
        boolean expectedDrives = true;


        String actualName = person.getName();
        int actualAge = person.getAge();
        int actualHeight = person.getHeight();
        String actualHairColor= person.getHairColor();
        String actualEyeColor = person.getEyeColor();
        String actualHomeTown = person.getHomeTown();
        boolean actualDrives = person.getDrives();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedHairColor, actualHairColor);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedHomeTown, actualHomeTown);
        Assert.assertEquals(expectedDrives, actualDrives);

    }




    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setHeight() {
        Person person = new Person();
        Integer expected = 2147483647;
        person.setHeight(expected);
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setHairColor() {
        Person person = new Person();
        String expected = "red";
        person.setHairColor(expected);
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setEyeColor() {
        Person person = new Person();
        String expected = "brown";
        person.setEyeColor(expected);
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void setHomeTown() {
        Person person = new Person();
        String expected = "new york";
        person.setHomeTown(expected);
        String actual = person.getHomeTown();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setDrives() {
        Person person = new Person();
        Boolean expected = true;
        person.setDrives(expected);
        Boolean actual = person.getDrives();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        Person person = new Person();

    }

    @Test
    public void getAge() {
    }

    @Test
    public void getHeight() {
    }

    @Test
    public void getHairColor() {
    }

    @Test
    public void getEyeColor() {
    }

    @Test
    public void getHomeTown() {
    }

    @Test
    public void isDrives() {
    }
}
