package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by apple on 3/20/17.
 */
@Entity
@Table(name = "TRWT_NO01_FILING")
public class TrwtNo01Filing implements Serializable {
    @Id
    @SequenceGenerator(name = "TRWT_NO01_FILING_SEQ", sequenceName = "TRWT_NO01_FILING_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO01_FILING_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "OTOP_TYPE")
    private String otopType;

    @Column(name = "OTOP_NO")
    private String otopNo;

    @Column(name = "GVM")
    private boolean gvm;

    @Column(name = "CER_MARK_RULE", length = 1000)
    private String cerMarkRule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOtopType() {
        return otopType;
    }

    public void setOtopType(String otopType) {
        this.otopType = otopType;
    }

    public String getOtopNo() {
        return otopNo;
    }

    public void setOtopNo(String otopNo) {
        this.otopNo = otopNo;
    }

    public boolean isGvm() {
        return gvm;
    }

    public void setGvm(boolean gvm) {
        this.gvm = gvm;
    }

    public String getCerMarkRule() {
        return cerMarkRule;
    }

    public void setCerMarkRule(String cerMarkRule) {
        this.cerMarkRule = cerMarkRule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrwtNo01Filing that = (TrwtNo01Filing) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
