package beer.micros_beer_service.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {
  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @Column(length = 36, columnDefinition = "varchar2", updatable = false, nullable = false)
  private UUID id;

  @Version
  private Long version;

  //@CreationTimestamp
  @Column(updatable = false)
  private Timestamp createdDate;

  //@UpdateTimestamp
  private Timestamp lastModifiedDate;
  private String beerName;
  private String beerStyle;

  @Column(unique = true)
  private String upc;
  private BigDecimal price;
  private Integer minOnHand;
  private Integer quantityToBrew;

}
