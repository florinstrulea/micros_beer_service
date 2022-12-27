package beer.micros_beer_service.web.interfaces;

import beer.micros_beer_service.web.model.BeerDto;

import java.util.UUID;

public interface BeerRepo {
  BeerDto getBeerById(UUID beerId);

  BeerDto saveNewBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

  void deleteById(UUID beerId);
}
