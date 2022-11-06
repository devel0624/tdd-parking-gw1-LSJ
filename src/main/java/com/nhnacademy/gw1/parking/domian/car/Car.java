package com.nhnacademy.gw1.parking.domian.car;

import com.nhnacademy.gw1.parking.domian.generator.PlateGenerator;

import java.util.Arrays;

public class Car {


    private final String type;

    public Car(String type) {

        checkInvalidType(type);

        this.type = type;
    }

    private void checkInvalidType(String type) {
        if(Arrays.stream(PlateGenerator.values()).
                noneMatch((x) -> x.name().equalsIgnoreCase(type))){
            throw new InvalidTypeOfCar(type);
        }
    }

    public String getType() {
        return type;
    }
}