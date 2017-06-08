package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

/**
 * Created by saranrat on 7/6/2560.
 */
public interface SistRecvTmRepo extends JpaRepository<SistRecvTm,Long> {

    SistRecvTm findByTrNo(Long trNo);
}
