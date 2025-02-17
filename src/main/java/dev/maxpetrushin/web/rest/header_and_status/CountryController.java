package dev.maxpetrushin.web.rest.header_and_status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = new Country();
        c.setName("France");
        c.setPopulation(67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .body(c);
    }
}
