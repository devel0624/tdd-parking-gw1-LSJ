package com.nhnacademy.gw1.parking.domain.generator;


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
            return numberGenerator.generateLicense(70,29);
        }
    };
    protected final LicenseGenerator numberGenerator;

    PlateGenerator() {
        numberGenerator = new LicenseGenerator();
    }

    public abstract String generateLicense();
}
