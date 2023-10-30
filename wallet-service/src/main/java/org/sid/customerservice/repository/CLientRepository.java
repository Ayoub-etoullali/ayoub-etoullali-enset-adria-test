package org.sid.customerservice.repository;

import org.sid.customerservice.entities.Client;
import org.sid.customerservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CLientRepository extends JpaRepository<Client, Long> {

}
