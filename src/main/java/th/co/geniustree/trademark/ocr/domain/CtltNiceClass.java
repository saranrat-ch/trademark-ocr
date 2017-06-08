package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CTLT_NICE_CLASS")
public class CtltNiceClass extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "CTLT_NICE_CLASS_SEQ", sequenceName = "CTLT_NICE_CLASS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_NICE_CLASS_SEQ")
    @Column(name = "NICE_CLASS_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long niceClassId;

    @Column(name = "NICE_CLASS_CODE", nullable = false, length = 2)
    private String niceClassCode;

    @Column(name = "NICE_CLASS_TNAME", length = 1000)
    private String niceClassTname;

    @Column(name = "NICE_CLASS_ENAME", length = 1000)
    private String niceClassEname;

    @Column(name = "NICE_CLASS_FLAG", length = 1)
    private String niceClassFlag;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    @Column(name = "NICE_CLASS_RELATE", length = 150)
    private String niceClassRelate;

    public Long getNiceClassId() {
        return niceClassId;
    }

    public void setNiceClassId(Long niceClassId) {
        this.niceClassId = niceClassId;
    }

    public String getNiceClassCode() {
        return niceClassCode;
    }

    public void setNiceClassCode(String niceClassCode) {
        this.niceClassCode = niceClassCode;
    }

    public String getNiceClassTname() {
        return niceClassTname;
    }

    public void setNiceClassTname(String niceClassTname) {
        this.niceClassTname = niceClassTname;
    }

    public String getNiceClassEname() {
        return niceClassEname;
    }

    public void setNiceClassEname(String niceClassEname) {
        this.niceClassEname = niceClassEname;
    }

    public String getNiceClassFlag() {
        return niceClassFlag;
    }

    public void setNiceClassFlag(String niceClassFlag) {
        this.niceClassFlag = niceClassFlag;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getNiceClassRelate() {
        return niceClassRelate;
    }

    public void setNiceClassRelate(String niceClassRelate) {
        this.niceClassRelate = niceClassRelate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CtltNiceClass that = (CtltNiceClass) o;
        return Objects.equals(niceClassId, that.niceClassId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(niceClassId);
    }
}
