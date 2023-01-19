package net.valdivieso.brewery.services;

import java.util.UUID;

import net.valdivieso.brewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
