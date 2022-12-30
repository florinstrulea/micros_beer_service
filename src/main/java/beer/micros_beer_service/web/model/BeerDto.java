package beer.micros_beer_service.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Positive;
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
  @Null
  private UUID id;
  @Null
  private Integer version;
  @Null
  private OffsetDateTime createdDate;
  @Null
  private OffsetDateTime lastModifiedDate;
  @NotBlank
  private String beerName;
  @NotNull
  private BeerStyleEnum beerStyle;
  @NotNull
  @Positive
  private Long upc;
  @NotNull
  @Positive
  private BigDecimal price;
  private Integer quantityOnHand;
}
