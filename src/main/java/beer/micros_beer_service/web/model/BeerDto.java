package beer.micros_beer_service.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created 26/12/2022
 **/
@Data //getters and setters + hashcode and equals methods
@NoArgsConstructor //constructor with no arguments
@AllArgsConstructor //constructor with all the arguments
@Builder //implements the build pattern
public class BeerDto {
  private UUID id;
  private Integer version;
  private OffsetDateTime createdDate;
  private OffsetDateTime lastModifiedDate;
  private String beerName;
  private BeerStyleEnum beerStyle;
  private Long upc;
  private BigDecimal price;
  private Integer quantityOnHand;
}
