package org.s2p.implementation;

import org.s2p.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker
{
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
