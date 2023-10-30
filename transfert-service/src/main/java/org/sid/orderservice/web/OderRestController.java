package org.sid.orderservice.web;

import org.sid.orderservice.entities.Transfert;
import org.sid.orderservice.model.Wallet;
import org.sid.orderservice.model.Client;
import org.sid.orderservice.repository.TransfertRepository;
import org.sid.orderservice.services.WalletRestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class OderRestController {

    private TransfertRepository transfertRepository;
    private WalletRestClientService walletRestClientService;

    public OderRestController(TransfertRepository transfertRepository, WalletRestClientService walletRestClientService) {
        this.transfertRepository = transfertRepository;
        this.walletRestClientService = walletRestClientService;
    }

    @GetMapping("/fullTransfer")
    public List<Transfert> getOrders() {
        List<Transfert> transferts = transfertRepository.findAll();
        List<Wallet> wallets = walletRestClientService.allWallets().getContent().stream().toList();

        Random random=new Random();
        transferts.forEach(o -> {
            o.setWallet((List<Wallet>) wallets.get(random.nextInt(wallets.size())));
        });
        return transferts;
    }

    @GetMapping("/fullTransfer/{id}")
    public Transfert getOrder(@PathVariable Long id) {
        Transfert transfert = transfertRepository.findById(id).get();
        Wallet wallet = walletRestClientService.walletById(String.valueOf(transfert.getWalletId()));
        transfert.setWallet((List<Wallet>) wallet);
//        transfert.getProductItems().forEach(pi -> {
//            Client client = inventoryRestClientService.productById(pi.getProductId());
//            pi.setClient(client);
//        });
        return transfert;
    }
}
