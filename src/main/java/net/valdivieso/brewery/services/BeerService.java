package net.valdivieso.brewery.services;

import java.util.UUID;

import net.valdivieso.brewery.web.model.BeerDto;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

}
