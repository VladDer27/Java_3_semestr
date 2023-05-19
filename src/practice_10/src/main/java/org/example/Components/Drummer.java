package org.example.Components;

import org.example.Interfaces.Musician;

public class Drummer implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Drummer is playing drums");
    }
}
