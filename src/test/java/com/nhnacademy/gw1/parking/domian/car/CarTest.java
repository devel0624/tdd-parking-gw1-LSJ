package com.nhnacademy.gw1.parking.domian.car;

import com.nhnacademy.gw1.parking.domian.car.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CarTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void car_Creation_Test(){
        Car compact = new Car("COMPACT");
        Car sedan = new Car("SEDAN");

        assertAll(
                () -> assertThat(compact.getType()).hasToString("COMPACT"),
                () -> assertThat(sedan.getType()).hasToString("SEDAN")
        );
    }

    @Test
    void car_Creation_Failed_By_Invalid_Type(){

        assertThatThrownBy(() -> new Car("INVALID"))
                .isInstanceOf(InvalidTypeOfCar.class)
                .hasMessageContaining("Invalid Type : ");
    }

    @Test
    void car_SetPlate_Success(){

        Car compact = new Car("compact");

    }
}