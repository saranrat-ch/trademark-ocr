/*
 * Copy right 2016 Genius-Tree Co., Ltd.
 */
package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author jittagornp
 */
@Entity
@Table(name = "CTLT_FEE_COST")
public class CtltFeeCost implements Serializable {

    @EmbeddedId
    private CtltFeeCostPK id;

    @Column(name = "FEE_COST", precision = 10)
    private BigDecimal feeCost;

    @ManyToOne
    @JoinColumn(
            name = "FEE_ID",
            referencedColumnName = "FEE_ID",
            insertable = false,
            updatable = false
    )
    private CtltFee fee;

    public CtltFeeCost() {
    }

    public CtltFeeCost(CtltFeeCostPK id) {
        this.id = id;
    }

    public CtltFeeCostPK getId() {
        return id;
    }

    public void setId(CtltFeeCostPK id) {
        this.id = id;
    }

    public BigDecimal getFeeCost() {
        return feeCost;
    }

    public void setFeeCost(BigDecimal feeCost) {
        this.feeCost = feeCost;
    }

    public CtltFee getFee() {
        return fee;
    }

    public void setFee(CtltFee fee) {
        this.fee = fee;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final CtltFeeCost other = (CtltFeeCost) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
