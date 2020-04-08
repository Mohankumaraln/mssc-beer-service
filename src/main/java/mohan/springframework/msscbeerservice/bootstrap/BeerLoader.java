package mohan.springframework.msscbeerservice.bootstrap;

import mohan.springframework.msscbeerservice.domain.Beer;
import mohan.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;
    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                    .beerName("PLE")
            .price(new BigDecimal("12.99"))
                    .minOnHand(20)
                    .quantityToBrew(200)
            .UPC(12345678L).build());

            beerRepository.save(Beer.builder()
                    .beerName("KING")
                    .price(new BigDecimal("12.99"))
                    .minOnHand(20)
                    .quantityToBrew(200)
                    .UPC(12345679L).build());
        }
        System.out.println("LOADED BEERS   "+beerRepository.count());
    }
}
