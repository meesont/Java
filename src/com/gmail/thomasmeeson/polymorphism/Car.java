/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.polymorphism;

public class Car {

    private String name, make, model;
    private int yearOfManufacture, registrationYear;
    private boolean isInsured, isTaxed;

    /**
     * Used to create a new car, takes parameters for all car variables
     * @param name The name of the car
     * @param make The make of the car (e.g. Volkswagen)
     * @param model The model of the car (e.g. Golf R)
     * @param yearOfManufacture The year the car was manufactured
     * @param registrationYear The year the car was registered
     * @param isInsured If the car is insured
     * @param isTaxed If the car is taxed
     */
    public Car(String name, String make, String model, int yearOfManufacture, int registrationYear, boolean isInsured, boolean isTaxed) {
        this.name = name.toUpperCase();
        this.make = make.toUpperCase();
        this.model = model.toUpperCase();
        this.yearOfManufacture = yearOfManufacture;
        this.registrationYear = registrationYear;
        this.isInsured = isInsured;
        this.isTaxed = isTaxed;
    }

    /**
     * Used to create a new car, use if {@param model} is unknown
     * @param name The name of the car
     * @param make The make of the car (e.g. Volkswagen)
     * @param yearOfManufacture The year the car was manufactured
     * @param registrationYear The year the car was registered
     * @param isInsured If the car is insured
     * @param isTaxed If the car is taxed
     */
    public Car(String name, String make, int yearOfManufacture, int registrationYear, boolean isInsured, boolean isTaxed) {
        this.name = name.toUpperCase();
        this.make = make.toUpperCase();
        this.yearOfManufacture = yearOfManufacture;
        this.registrationYear = registrationYear;
        this.isInsured = isInsured;
        this.isTaxed = isTaxed;
        this.model = "UNKNOWN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public boolean isTaxed() {
        return isTaxed;
    }

    public void setTaxed(boolean taxed) {
        isTaxed = taxed;
    }



}
