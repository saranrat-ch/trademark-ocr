package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import th.co.geniustree.trademark.ocr.domain.CtltLocation;

import java.util.Optional;

/**
 * Created by saranrat on 7/6/2560.
 */
public interface CtltLocationRepo extends JpaRepository<CtltLocation,Long>,JpaSpecificationExecutor<CtltLocation> {

    Optional<CtltLocation> findByProvCodeAndAndAumpCodeAndTumbonName(String provCode, String aumpCode, String tumbonName);
}
