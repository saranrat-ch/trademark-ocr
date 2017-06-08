package th.co.geniustree.trademark.ocr.domain;

// Generated Nov 15, 2013 10:18:15 AM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CTLT_OCCUPATION")
public class CtltOccupation extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = -9217918875419232698L;
    @Id
    @SequenceGenerator(name = "CTLT_OCCUPATION_SEQ", sequenceName = "CTLT_OCCUPATION_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_OCCUPATION_SEQ")
    @Column(name = "OCCU_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long occuId;

    @Column(name = "OCCU_NAME", nullable = false, length = 150)
    private String occuName;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    public CtltOccupation() {
    }

    public CtltOccupation(Long occuId) {
        this.occuId = occuId;
    }

    public Long getOccuId() {
        return this.occuId;
    }

    public void setOccuId(Long occuId) {
        this.occuId = occuId;
    }


    public String getOccuName() {
        return this.occuName;
    }

    public void setOccuName(String occuName) {
        this.occuName = occuName;
    }


    public String getUseFlag() {
        return this.useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.occuId);
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
        final CtltOccupation other = (CtltOccupation) obj;
        if (!Objects.equals(this.occuId, other.occuId)) {
            return false;
        }
        return true;
    }

}
