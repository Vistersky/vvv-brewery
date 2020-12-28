package com.vistersky.vvvbrewery.services;

import com.vistersky.vvvbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    public BeerDTO getBeerById(UUID beerId);
}
