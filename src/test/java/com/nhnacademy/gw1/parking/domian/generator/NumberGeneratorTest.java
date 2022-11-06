package com.nhnacademy.gw1.parking.domian.generator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    LicenseGenerator numberGenerator;

    @BeforeEach
    void setUp() {
        numberGenerator = new LicenseGenerator();
    }

    @Test
    void generate_License(){
        String license = numberGenerator.generateLicense(1, 99);

        assertNotNull(license);
        System.out.println(license);
    }
}