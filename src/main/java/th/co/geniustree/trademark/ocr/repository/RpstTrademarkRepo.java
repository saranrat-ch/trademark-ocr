package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.RpstTrademark;

import java.util.Optional;

/**
 * Created by saranrat on 3/7/2560.
 */
public interface RpstTrademarkRepo extends JpaRepository<RpstTrademark,Long> {

    Optional<RpstTrademark> findByTrNo(Long trNo);
}
