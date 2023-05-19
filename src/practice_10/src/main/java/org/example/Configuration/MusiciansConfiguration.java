package org.example.Configuration;

import org.example.Components.Drummer;
import org.example.Components.Guitarist;
import org.example.Components.Trombonist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusiciansConfiguration {

    @Bean("Drummer")
    public Drummer drummer(){
        return new Drummer();
    }

    @Bean("Guitarist")
    public Guitarist guitarist(){
        return new Guitarist();
    }

    @Bean("Trombonist")
    public Trombonist trombonist(){
        return new Trombonist();
    }
}
