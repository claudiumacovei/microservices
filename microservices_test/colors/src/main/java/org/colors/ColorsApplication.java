package org.colors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ColorsApplication 
{
	public static void main(String[] args) {
	    SpringApplication.run(ColorsApplication.class, args);
	}
}
