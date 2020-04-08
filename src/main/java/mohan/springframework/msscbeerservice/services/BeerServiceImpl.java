package mohan.springframework.msscbeerservice.services;

import mohan.springframework.msscbeerservice.domain.Beer;
import mohan.springframework.msscbeerservice.repositories.BeerRepository;
import mohan.springframework.msscbeerservice.web.model.BeerDto;
import mohan.springframework.msscbeerservice.web.model.BeerPagedList;
import mohan.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    BeerRepository beerRepository;
    @Override
    public BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand) {

        return null;
    }

    @Override
    public BeerDto getById(UUID beerId, Boolean showInventoryOnHand) {
        Optional<Beer> op =  beerRepository.findById(beerId);
        BeerDto dt = BeerDto.builder().build();
        if (op.isPresent() ) {
            Beer b = op.get();
            dt.setId(b.getId());
            dt.setBeerName(b.getBeerName());
            dt.setUPC(b.getUPC());
        }
            return dt;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto getByUpc(String upc) {
        return null;
    }
}
