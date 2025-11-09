package com.healthservice;

public class GeneralPractitioner extends HealthProfessional {
    private boolean acceptsNewPatients;

    public GeneralPractitioner(int id, String name, String department, boolean acceptsNewPatients) {
        super(id, name, department);
        this.acceptsNewPatients = acceptsNewPatients;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Admission of new patients : " + (acceptsNewPatients ? "TRUE" : "FALSE"));
    }
}