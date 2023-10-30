package org.sid.customerservice;

import org.sid.customerservice.entities.Client;
import org.sid.customerservice.entities.Wallet;
import org.sid.customerservice.repository.CLientRepository;
import org.sid.customerservice.repository.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner start(WalletRepository walletRepository, CLientRepository cLientRepository){
		return args -> {
			cLientRepository.saveAll(List.of(
					Client.builder().name("ayoub").email("ayoub@gmail.com").build(),
					Client.builder().name("samira").email("samira@gmail.com").build(),
					Client.builder().name("mustapha").email("mustapha@gmail.com").build(),
					Client.builder().name("hayat").email("hayat@gmail.com").build(),
					Client.builder().name("karima").email("karima@gmail.com").build(),
					Client.builder().name("radouan").email("radouan@gmail.com").build(),
					Client.builder().name("ihssan").email("ihssan@gmail.com").build()
			));
			cLientRepository.findAll().forEach(System.out::println);

			Random random=new Random();
			walletRepository.saveAll(List.of(
					Wallet.builder().id("khvbaqlmd5s4dqsd").solde(random.nextInt(10000)).dateCreation(new Date()).devise("DH").build(),
					Wallet.builder().id("zdzfdhjeq54q1ddd").solde(random.nextInt(10000)).dateCreation(new Date()).devise("DH").build(),
					Wallet.builder().id("dzkhdbfdfefejqdq").solde(random.nextInt(10000)).dateCreation(new Date()).devise("DH").build(),
					Wallet.builder().id("dqfdfzfdffrfzfef").solde(random.nextInt(10000)).dateCreation(new Date()).devise("DH").build()
			));
			walletRepository.findAll().forEach(System.out::println);
		};
	}

}
