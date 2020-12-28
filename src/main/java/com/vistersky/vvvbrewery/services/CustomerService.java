package com.vistersky.vvvbrewery.services;

import com.vistersky.vvvbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    public CustomerDTO getCustomerById(UUID customerId);
}
