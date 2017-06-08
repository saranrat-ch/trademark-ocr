/*
 * Copy right 2016 Genius-Tree Co., Ltd.
 */
package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jittagornp
 */
@Embeddable
public class CtltFeeCostPK implements Serializable {

    @Column(name = "FEE_ID")
    private Long feeId;

    @Enumerated(EnumType.STRING)
    @Column(name = "ACT_YEAR")
    private ActYear year;

    public CtltFeeCostPK() {
    }

    public CtltFeeCostPK(Long feeId, ActYear year) {
        this.feeId = feeId;
        this.year = year; 
    }

    public Long getFeeId() {
        return feeId;
    }

    public ActYear getYear() {
        return year; 
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.feeId);
        hash = 89 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CtltFeeCostPK other = (CtltFeeCostPK) obj;
        if (!Objects.equals(this.feeId, other.feeId)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

}
