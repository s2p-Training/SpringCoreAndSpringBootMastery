package org.s2p.main;


import org.s2p.beans.Person;
import org.s2p.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person =  context.getBean(Person.class);
    }
}
