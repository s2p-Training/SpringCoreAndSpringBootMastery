package org.s2p.implementation;

import org.s2p.interfaces.Tyres;

public class MichelinTyres implements Tyres
{

    @Override
    public String rotate() {
        return "Moving vehicle with Michelin tyres";
    }
}
