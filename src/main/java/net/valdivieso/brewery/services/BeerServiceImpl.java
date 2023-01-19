package net.valdivieso.brewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import net.valdivieso.brewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .bearName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        BeerDto findDto = getBeerById(beerId);
        if (findDto != null) {
            findDto.setBearName(beerDto.getBearName());
            findDto.setBeerStyle(beerDto.getBeerStyle());
        }
        
    }
    
}
