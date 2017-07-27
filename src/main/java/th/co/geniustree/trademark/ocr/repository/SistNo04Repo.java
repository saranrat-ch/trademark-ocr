package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistNo04;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

import java.util.Optional;

public interface SistNo04Repo extends JpaRepository<SistNo04,Long> {

    Optional<SistNo04> findBySistRecvTm(SistRecvTm sistRecvTm);
}
