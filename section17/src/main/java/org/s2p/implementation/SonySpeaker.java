package org.s2p.implementation;

import org.s2p.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker
{
    @Override
    public String makeSound() {
        return "Playing music with Sony speaker";
    }
}
