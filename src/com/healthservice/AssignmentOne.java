package com.healthservice;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {

    private static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Create health professionals
        HealthProfessional gp = new GeneralPractitioner(101, "张医生", "全科", true);
        HealthProfessional surgeon = new Surgeon(202, "李医生", "外科", "心血管");

        // Create an appointment
        createAppointment("王患者", "13800138000", "09:00", gp);
        createAppointment("陈患者", "13900139000", "10:30", surgeon);

        // Print appointment details
        System.out.println("=== 预约详情 ===");
        for (Appointment appt : appointments) {
            appt.printDetails();
        }

        // cancel booking
        cancelBooking("王患者");

        // Print the details of the cancelled appointment
        System.out.println("=== 取消后的预约详情 ===");
        for (Appointment appt : appointments) {
            appt.printDetails();
        }
    }

    // The method of creating an appointment
    public static void createAppointment(String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobile, timeSlot, doctor);
        appointments.add(appointment);
    }

    // The method of canceling an appointment
    public static void cancelBooking(String patientName) {
        appointments.removeIf(appointment -> appointment.getPatientName().equals(patientName));
    }
}