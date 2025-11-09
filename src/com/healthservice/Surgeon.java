package com.healthservice;

public class Surgeon extends HealthProfessional {
    private String surgicalSpecialty;

    public Surgeon(int id, String name, String department, String surgicalSpecialty) {
        super(id, name, department);
        this.surgicalSpecialty = surgicalSpecialty;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Surgeon: " + surgicalSpecialty);
    }
}