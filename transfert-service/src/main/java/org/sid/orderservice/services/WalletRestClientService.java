package org.sid.orderservice.services;

import org.sid.orderservice.model.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wallet-service")
public interface WalletRestClientService {
    @GetMapping("/wallets/{id}?projection=fullWallet")
    public Wallet walletById(@PathVariable String id);
    @GetMapping("/wallets?projection=fullWallet")
    public PagedModel<Wallet> allWallets();
}
