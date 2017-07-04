package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

import java.util.Optional;

/**
 * Created by saranrat on 7/6/2560.
 */
public interface SistRecvTmRepo extends JpaRepository<SistRecvTm,Long> {

    Optional<SistRecvTm> findByTrNo(Long trNo);

    Optional<SistRecvTm> findByPayRefNo(Long payRefNo);
}
