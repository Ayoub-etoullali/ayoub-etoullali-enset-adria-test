package org.sid.orderservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.orderservice.enums.Status;
import org.sid.orderservice.model.Client;
import org.sid.orderservice.model.Wallet;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Transfert {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Status etat;
    private double montant;

    private Long walletId;

    @Transient
    private Wallet source;
    @Transient
    private Wallet destination;

    @Transient
    private Client client;
    @Transient
    private List<Wallet> Wallet;
}
