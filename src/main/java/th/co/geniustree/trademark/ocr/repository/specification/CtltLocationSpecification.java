package th.co.geniustree.trademark.ocr.repository.specification;

import org.springframework.data.jpa.domain.Specification;
import th.co.geniustree.trademark.ocr.domain.CtltLocation;
import th.co.geniustree.trademark.ocr.domain.CtltLocation_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by saranrat on 7/6/2560.
 */
public class CtltLocationSpecification {
    public static Specification<CtltLocation> provCodeEqual(String provCode){
        return new Specification<CtltLocation>() {
            @Override
            public Predicate toPredicate(Root<CtltLocation> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get(CtltLocation_.provCode),provCode);
            }
        };
    }

    public static Specification<CtltLocation> aumpCodeEqal(String aumpCode){
        return new Specification<CtltLocation>() {
            @Override
            public Predicate toPredicate(Root<CtltLocation> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get(CtltLocation_.aumpCode),aumpCode);
            }
        };
    }

    public static Specification<CtltLocation> tumbonNameEqal(String tumbonName){
        return new Specification<CtltLocation>() {
            @Override
            public Predicate toPredicate(Root<CtltLocation> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get(CtltLocation_.tumbonName),tumbonName);
            }
        };
    }
}
