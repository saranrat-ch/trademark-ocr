package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import th.co.geniustree.trademark.ocr.domain.SistNo03;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

import java.util.Optional;

/**
 * Created by saranrat on 4/7/2560.
 */
public interface SistNo03Repo extends JpaRepository<SistNo03,Long> {
    Optional<SistNo03> findBySistRecvTm(SistRecvTm sistRecvTm);
}
