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

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
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
                    .UPC(BEER_1_UPC).build());

            beerRepository.save(Beer.builder()
                    .beerName("UB")
                    .price(new BigDecimal("12.99"))
                    .minOnHand(20)
                    .quantityToBrew(200)
                    .UPC(BEER_2_UPC).build());

            beerRepository.save(Beer.builder()
                    .beerName("KING")
                    .price(new BigDecimal("12.99"))
                    .minOnHand(20)
                    .quantityToBrew(200)
                    .UPC(BEER_3_UPC).build());
        }
        System.out.println("LOADED BEERS   "+beerRepository.count());
    }
}
