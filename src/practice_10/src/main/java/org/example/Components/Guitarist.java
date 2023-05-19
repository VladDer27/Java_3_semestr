package org.example.Components;

import org.example.Interfaces.Musician;

public class Guitarist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Guitarist is playing guitar");
    }
}
