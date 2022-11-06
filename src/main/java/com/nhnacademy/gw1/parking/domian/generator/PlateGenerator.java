package com.nhnacademy.gw1.parking.domian.generator;


public enum PlateGenerator {
    COMPACT{
        @Override
        public String generateLicense() {
            return numberGenerator.generateLicense(1,69);
        }
    },
    SEDAN{
        @Override
        public String generateLicense() {
            return numberGenerator.generateLicense(1,69);
        }
    },
    FULL_SIZE{
        @Override
        public String generateLicense() {
            return numberGenerator.generateLicense(70,99);
        }
    };
    protected LicenseGenerator numberGenerator;

    PlateGenerator() {
        numberGenerator = new LicenseGenerator();
    }

    public abstract String generateLicense();
}
