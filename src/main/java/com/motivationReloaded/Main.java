package com.motivationReloaded;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        //you can cast the above by writing it as follows
        //Nurse doctor = (Nurse) context.getBean("nurse");
        doctor.assist();
//        doctor.setQualification("Six years");
        //System.out.println(doctor);

//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1);
    }
}