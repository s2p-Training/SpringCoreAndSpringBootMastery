package org.s2p.main;

import org.s2p.config.ProjectConfig;
import org.s2p.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);

        vehicleServices.playMusic();
        vehicleServices.moveVehicle();
    }
}
