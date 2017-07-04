package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistNo02;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

import java.util.Optional;

/**
 * Created by saranrat on 3/7/2560.
 */
public interface SistNo02Repo extends JpaRepository<SistNo02,Long> {

    Optional<SistNo02> findBySistRecvTm(SistRecvTm sistRecvTm);
}
