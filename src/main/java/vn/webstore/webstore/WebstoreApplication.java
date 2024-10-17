package vn.webstore.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import vn.webstore.webstore.service.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)

public class WebstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebstoreApplication.class, args);
	}

}
