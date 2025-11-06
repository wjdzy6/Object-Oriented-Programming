package com.healthservice;

public class AssignmentOne {
    public static void main(String[] args) {
        // 创建健康专业人员
        HealthProfessional gp = new GeneralPractitioner(101, "张医生", "全科", true);
        HealthProfessional surgeon = new Surgeon(202, "李医生", "外科", "心血管");

        // 创建预约
        Appointment appt1 = new Appointment("王患者", "13800138000", "09:00", gp);
        Appointment appt2 = new Appointment("陈患者", "13900139000", "10:30", surgeon);

        // 打印预约详情
        System.out.println("=== 预约详情 ===");
        appt1.printDetails();
        System.out.println("----------------------");
        appt2.printDetails();
    }
}