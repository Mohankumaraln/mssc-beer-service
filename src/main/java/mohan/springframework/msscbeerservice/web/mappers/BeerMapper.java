package mohan.springframework.msscbeerservice.web.mappers;

import mohan.springframework.msscbeerservice.domain.Beer;
import mohan.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer    BeerDtoToBeer(BeerDto beerDto);
}
