package br.edu.infnet.appJogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppJogosApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppJogosApplication.class, args);
	}
}
