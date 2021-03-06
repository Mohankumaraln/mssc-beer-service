package mohan.springframework.msscbeerservice.repositories;

import mohan.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository <Beer, UUID>{
}
