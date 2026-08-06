package vn.edu.ptit.web_grading_system.config_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
@EnableFeignClients
public class ConfigServerApplication {

	private static final Logger log = LoggerFactory.getLogger(ConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	@Bean
	public CommandLineRunner startupInfo() {
		return args -> log.info("🚀 Config Server started successfully — version 4.5.0");
	}

}