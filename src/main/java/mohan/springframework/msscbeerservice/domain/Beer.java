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
   @Id
   @GeneratedValue(generator = "UUID")
   @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
   @Column(length = 36,columnDefinition = "varchar", updatable = false,nullable = false)
   private UUID id;

   @Version //optimistic locking.
   private Long version;

   @CreationTimestamp
   @Column(updatable = false)
   private Timestamp createdDate;

   @UpdateTimestamp
   private Timestamp lastModifiedDate;

   @Column(unique = true)
   private Long UPC;
   private BigDecimal price;
   private Integer minOnHand;
}