package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.CtltCountry;

import java.util.Optional;

/**
 * Created by saranrat on 7/6/2560.
 */
public interface CtltCountryRepo extends JpaRepository<CtltCountry,Long> {
}
