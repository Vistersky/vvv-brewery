package com.vistersky.vvvbrewery.services;

import com.vistersky.vvvbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .name("Adam")
                .build();
    }
}
