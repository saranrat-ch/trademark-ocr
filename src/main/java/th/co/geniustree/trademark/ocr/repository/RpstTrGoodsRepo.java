package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.CtltNiceClass;
import th.co.geniustree.trademark.ocr.domain.RpstTrClass;
import th.co.geniustree.trademark.ocr.domain.RpstTrGoods;


import java.util.List;

public interface RpstTrGoodsRepo extends JpaRepository<RpstTrGoods,Long>{

    List<RpstTrGoods> findByRpstTrClassAndCtltNiceClass(RpstTrClass rpstTrClass, CtltNiceClass ctltNiceClass);
}
