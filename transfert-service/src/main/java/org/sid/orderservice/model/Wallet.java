package org.sid.orderservice.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Wallet {
    private String id;
    private double solde;
    private Date dateCreation;
    private String devise;
}
