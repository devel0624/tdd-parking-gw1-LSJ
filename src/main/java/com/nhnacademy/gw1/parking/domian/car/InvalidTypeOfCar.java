package com.nhnacademy.gw1.parking.domian.car;

public class InvalidTypeOfCar extends RuntimeException{
    public InvalidTypeOfCar(String type) {
        super("Invalid Type : " + type);
    }
}
