package mohan.springframework.msscbeerservice;

import mohan.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/beer")
public class Controller {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable Long beerId){
        //Todo
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //Todo
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public  ResponseEntity updateBeerById(@RequestBody BeerDto beerDto, @PathVariable Long beerId){
        //Todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
