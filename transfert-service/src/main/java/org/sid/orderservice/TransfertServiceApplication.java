package org.sid.orderservice;

import org.sid.orderservice.entities.Transfert;
import org.sid.orderservice.enums.Status;
import org.sid.orderservice.model.Wallet;
import org.sid.orderservice.repository.TransfertRepository;
import org.sid.orderservice.services.WalletRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableFeignClients // démarrer @FeignClient au démarrage
public class TransfertServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfertServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            TransfertRepository transfertRepository,
            WalletRestClientService walletRestClientService){

        return args -> {
            List<Wallet> wallets = walletRestClientService.allWallets().getContent().stream().toList();

            String customerId = "khvbaqlmd5s4dqsd";
            Wallet wallet = walletRestClientService.walletById(customerId);

//            Random random = new Random();
//            for (int i = 0; i < 20; i++) {
//                Transfert transfert = Transfert.builder()
//                        .walletId(Long.valueOf(wallets.get(random.nextInt(wallets.size())).getId()))
//                        .etat(Math.random() > 0.5 ? Status.PENDING : Status.CREATED)
//                        .date(new Date())
//                        .build();
//                    }
//
                };
            }
        }

