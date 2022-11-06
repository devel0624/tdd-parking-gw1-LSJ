package com.nhnacademy.gw1.parking.domian.generator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


@Slf4j
class PlateMiddleCharacterTest {

    @BeforeEach
    void setup(){

    }

    @Test
    void enum_Info(){
        System.out.println("length : " + PlateMiddleCharacter.values().length);
        System.out.println("Enum PlateMiddleCharacter contain");
        Arrays.stream(PlateMiddleCharacter.values())
                .forEach((x)-> System.out.print(x.getKorChar()+" "));
    }
}