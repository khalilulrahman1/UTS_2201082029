package com.khalilul.produk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProdukApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdukApplication.class, args);
	}

}
