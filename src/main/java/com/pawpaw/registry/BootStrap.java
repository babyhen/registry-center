package com.pawpaw.registry;

import com.pawpaw.framework.core.PawpawApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootStrap {
    public static void main(String[] args) {

        PawpawApplication application = new PawpawApplication();
        application.run(BootStrap.class, args);

    }
}
