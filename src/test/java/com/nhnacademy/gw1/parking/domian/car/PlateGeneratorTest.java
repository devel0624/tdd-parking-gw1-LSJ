package com.nhnacademy.gw1.parking.domian.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateGeneratorTest {

    PlateGenerator generator;

    @BeforeEach
    void setUp() {
    }

    @Test
    void values() {
        String temp_Plate = generator.generatePlate();

        assertNotNull(temp_Plate);
    }

    @Test
    void valueOf() {
    }
}