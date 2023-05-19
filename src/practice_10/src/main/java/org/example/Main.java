package org.example;

import org.example.Components.Guitarist;
import org.example.Configuration.MusiciansConfiguration;
import org.example.Interfaces.Musician;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MusiciansConfiguration.class);
        Musician drummer = (Musician) applicationContext.getBean("Drummer");
        Musician guitarist = applicationContext.getBean(Guitarist.class);
        Musician trombonist = (Musician) applicationContext.getBean("Trombonist");

        drummer.doCoding();
        guitarist.doCoding();
        trombonist.doCoding();
    }
}