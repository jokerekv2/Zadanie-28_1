package pl.javastart.restoffers.offers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OffersRestController {

    private final OffersRepository offersRepository;

    public OffersRestController(OffersRepository offersRepository) {
        this.offersRepository = offersRepository;
    }

    @GetMapping("/api/offers")
    public List<Offers> findAll(@RequestParam(required = false) String title) {
        if (title != null) {
            return offersRepository.findAllByTitleIgnoreCaseContaining(title);
        } else {
            return offersRepository.findAll();
        }
    }

    @GetMapping("/api/offers/count")
    public long countOffers() {
        return offersRepository.count();
    }

    @PostMapping("/api/offers")
    public ResponseEntity<Offers> addOffer(@RequestBody Offers offer) {
        if(offer.getId() != null) {
            return ResponseEntity.badRequest().build();
        } else {
            offersRepository.save(offer);
            return ResponseEntity.ok(offer);
        }

    }

}
