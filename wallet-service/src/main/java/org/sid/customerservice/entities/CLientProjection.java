package org.sid.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCLient",types = Wallet.class)
public interface CLientProjection {
    public Long getId();
    public String getName();
    public String getEmail();
}
