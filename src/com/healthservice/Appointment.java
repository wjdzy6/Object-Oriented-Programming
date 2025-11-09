package com.healthservice;

public class Appointment {
    private String patientName;
    private String mobile;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment(String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobile = mobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patients: " + patientName + "\nphone: " + mobile + "\ntime: " + timeSlot);
        System.out.println("Doctor Details: :");
        doctor.printDetails();
    }

    public String getPatientName() {
        return patientName;
    }
}