package pl.javastart.restoffers.offers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OffersRepository extends JpaRepository<Offers, Long> {
    List<Offers> findAllByTitleIgnoreCaseContaining(String title);
}
