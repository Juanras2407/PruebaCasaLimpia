package com.prueba.casalimpia.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EntityScan(basePackages = {"com.prueba.casalimpia.entity"})
public class test {
	@Bean(name="config")
	@Primary
	private static void test() {
		
	}

}
