package org.sid.orderservice.model;

import lombok.Data;

@Data
public class Client {
    private Long id;
    private String name;
    private String email;
}
