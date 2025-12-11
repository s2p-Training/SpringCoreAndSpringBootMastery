package org.s2p.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(
        basePackageClasses = {
                org.s2p.beans.Person.class,
                org.s2p.beans.Vehicle.class,
        },
        basePackages = {
                "org.s2p.implementation",
                "org.s2p.services",
                "org.s2p.aspects"
        }
)
@EnableAspectJAutoProxy
public class ProjectConfig
{

}