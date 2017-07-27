package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.CtltNiceClass;
import th.co.geniustree.trademark.ocr.domain.RpstTrClass;
import th.co.geniustree.trademark.ocr.domain.RpstTrademark;

import java.util.Optional;

public interface RpstTrClassRepo extends JpaRepository<RpstTrClass,Long> {

    Optional<RpstTrClass> findByRpstTrademarkAndCtltNiceClass(RpstTrademark rpstTrademark, CtltNiceClass ctltNiceClass);
}
