package th.co.geniustree.trademark.ocr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.trademark.ocr.domain.SistNo05;
import th.co.geniustree.trademark.ocr.domain.SistRecvTm;

import java.util.Optional;

public interface SistNo05Repo extends JpaRepository<SistNo05,Long> {
    Optional<SistNo05> findBySistRecvTm(SistRecvTm sistRecvTm);
}
