package beer.micros_beer_service.web.services;

import beer.micros_beer_service.web.interfaces.BeerRepo;
import beer.micros_beer_service.web.model.BeerDto;
import beer.micros_beer_service.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerService implements BeerRepo {
  @Override
  public BeerDto getBeerById(UUID beerId) {
    return BeerDto.builder()
            .id(beerId)
            .beerName("Kastel Beer")
            .beerStyle(BeerStyleEnum.IPA)
            .build();


  }

  /**
   * This method saves a new beer
   *
   * @param beerDto it's an object that it is saved
   * @return It returns a BeerDto
   */
  @Override
  public BeerDto saveNewBeer(BeerDto beerDto) {
    return BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName("Paix Dieux")
            .beerStyle(BeerStyleEnum.IPA)
            .build();
  }

  /**
   * @param beerId
   * @param beerDto
   */
  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {
    //todo impl - would add a real impl to update beer
  }

  @Override
  public void deleteById(UUID beerId) {
    log.debug("Deleting a beer...");
  }


}
