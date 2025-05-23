package org.param.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ParamSoftDiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParamSoftDiscoveryserverApplication.class, args);
	}

}
