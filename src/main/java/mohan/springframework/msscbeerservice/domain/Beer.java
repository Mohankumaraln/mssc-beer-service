package mohan.springframework.msscbeerservice.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Beer {
//   @Id
//   @GeneratedValue(generator = "UUID")
//
//   //org.hibernate.id.UUIDGenerator
//   @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
//   @Column(length = 36,columnDefinition = "varchar", updatable = false,nullable = false)
//   private UUID id;
@Id
@GeneratedValue(generator = "uuid2")
@GenericGenerator(name = "uuid2", strategy = "uuid2")
@Column(columnDefinition = "BINARY(16)")
private UUID id;

   @Version //optimistic locking.
   private Long version;

   //@Column(length = 36,columnDefinition = "varchar", updatable = false,nullable = false)
   @Column
   private String beerName;

   @CreationTimestamp
   @Column(updatable = false)
   private Timestamp createdDate;

   @UpdateTimestamp
   private Timestamp lastModifiedDate;

   @Column(unique = true)
   private Long UPC;
   @Column
   private BigDecimal price;
   @Column
   private Integer minOnHand;
   @Column
   private Integer quantityToBrew;
}
