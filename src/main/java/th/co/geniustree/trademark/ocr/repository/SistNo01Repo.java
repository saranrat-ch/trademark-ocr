package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistNo01;

import java.util.Optional;

/**
 * Created by saranrat on 7/6/2560.
 */
public interface SistNo01Repo extends JpaRepository<SistNo01,Long> {

      Optional<SistNo01> findByTrNo(Long trNo);
}
