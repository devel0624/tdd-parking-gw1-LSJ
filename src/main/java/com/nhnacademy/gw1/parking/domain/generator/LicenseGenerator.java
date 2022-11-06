package com.nhnacademy.gw1.parking.domain.generator;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class LicenseGenerator {

    public String generateLicense(int init, int end){
        Random random = new Random();

        int typeNumber = init + random.nextInt(end);

        int middleCharNum = random.nextInt(PlateMiddleCharacter.values().length);
        char kor = getKorChar(middleCharNum);

        int mainNumber = 1000 + random.nextInt(8999);

        String format = "%02d%c %4d"; //12가 1234;

        return String.format(format,typeNumber,kor,mainNumber);
    }

    private char getKorChar(int middleCharNum) {
        return Arrays.stream(PlateMiddleCharacter.values())
                .filter((x) -> x.ordinal() == middleCharNum)
                .collect(Collectors.toList())
                .get(0)
                .getKorChar();
    }
}
