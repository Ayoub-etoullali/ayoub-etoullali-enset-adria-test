package org.sid.orderservice.repository;

import org.sid.orderservice.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface TransfertRepository extends JpaRepository<Transfert, Long> {
    @RestResource(path = "/byWalletId")
    List<Transfert> findByWalletId(@Param("walletId") Long walletId);
}
