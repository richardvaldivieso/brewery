package net.valdivieso.brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import net.valdivieso.brewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }
    
}
