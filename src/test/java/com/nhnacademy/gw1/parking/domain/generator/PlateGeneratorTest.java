package com.nhnacademy.gw1.parking.domain.generator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PlateGeneratorTest {

    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest
    @EnumSource(value = PlateGenerator.class, names = {"COMPACT","SEDAN","FULL_SIZE"})
    void generate_NotNull_plate(PlateGenerator type){

        String plate = type.generateLicense();

        assertNotNull(plate);
        System.out.println(plate);
    }

}