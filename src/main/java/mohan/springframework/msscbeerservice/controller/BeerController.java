package mohan.springframework.msscbeerservice.controller;

import mohan.springframework.msscbeerservice.services.BeerService;
import mohan.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    BeerService beerService;

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //Todo
        BeerDto dt =  beerService.getById(beerId,true);
        return new ResponseEntity<>(dt, HttpStatus.OK);
    }

    @PostMapping
    public  ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //Todo
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public  ResponseEntity updateBeerById(@RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId){
        //Todo
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
