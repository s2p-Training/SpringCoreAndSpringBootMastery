package org.s2p.implementation;

import org.s2p.interfaces.Speaker;

public class SonySpeaker implements Speaker
{
    @Override
    public String makeSound() {
        return "Playing music with Sony speaker";
    }
}
