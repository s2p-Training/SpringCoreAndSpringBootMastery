package org.s2p.implementation;

import org.s2p.interfaces.Tyres;

public class BridgeStoneTyre implements Tyres
{

    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone tyres";
    }
}
