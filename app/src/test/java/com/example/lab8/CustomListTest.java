package com.example.lab8;


import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class CustomListTest {

    private CustomList MockCityList() {
        // if your CustomList constructor takes two arguments:
        return new CustomList(null, new ArrayList<>());
        // if it only takes one argument (most common):
        // return new CustomList(new ArrayList<>());
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int initialSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(initialSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City city = new City("Regina", "SK");
        list.addCity(city);

        assertTrue(list.hasCity(city));           // should be true
        assertFalse(list.hasCity(new City("Calgary", "AB"))); // should be false
    }



}