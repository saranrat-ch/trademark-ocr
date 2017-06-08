package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CTLT_LOCATION", uniqueConstraints = @UniqueConstraint(columnNames = "LOC_CODE"))
public class CtltLocation extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 414960391513516729L;

    @Id
    @SequenceGenerator(name = "CTLT_LOCATION_SEQ", sequenceName = "CTLT_LOCATION_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_LOCATION_SEQ")
    @Column(name = "LOC_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long locId;

    @Column(name = "LOC_CODE", unique = true, nullable = false, length = 6)
    private String locCode;

    @Column(name = "REG_ID", precision = 15, scale = 0)
    private Long regId;

    @Column(name = "LOC_ABBR_NAME", nullable = false, length = 50)
    private String locAbbrName;

    @Column(name = "LOC_NAME", nullable = false)
    private String locName;

    @Column(name = "LOC_REP_NAME")
    private String locRepName;

    @Column(name = "AUMP_CODE", length = 6)
    private String aumpCode;

    @Column(name = "PROV_CODE", length = 6)
    private String provCode;

    @Column(name = "POST_CODE", length = 10)
    private String postcode;

    @Column(name = "PROV_NAME", length = 150)
    private String provName;

    @Column(name = "AUMP_NAME", length = 150)
    private String aumpName;

    @Column(name = "TUMBON_NAME", length = 150)
    private String tumbonName;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    public CtltLocation() {
    }

    public CtltLocation(Long locId) {
        this.locId = locId;
    }

    public Long getLocId() {
        return this.locId;
    }

    public void setLocId(Long locId) {
        this.locId = locId;
    }

    public String getLocCode() {
        return this.locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public Long getRegId() {
        return this.regId;
    }

    public void setRegId(Long regId) {
        this.regId = regId;
    }

    public String getLocAbbrName() {
        return this.locAbbrName;
    }

    public void setLocAbbrName(String locAbbrName) {
        this.locAbbrName = locAbbrName;
    }

    public String getLocName() {
        return this.locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocRepName() {
        return this.locRepName;
    }

    public void setLocRepName(String locRepName) {
        this.locRepName = locRepName;
    }

    public String getAumpCode() {
        return this.aumpCode;
    }

    public void setAumpCode(String aumpCode) {
        this.aumpCode = aumpCode;
    }

    public String getProvCode() {
        return this.provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProvName() {
        return this.provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getAumpName() {
        return this.aumpName;
    }

    public void setAumpName(String aumpName) {
        this.aumpName = aumpName;
    }

    public String getTumbonName() {
        return this.tumbonName;
    }

    public void setTumbonName(String tumbonName) {
        this.tumbonName = tumbonName;
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
        hash = 29 * hash + Objects.hashCode(this.locId);
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
        final CtltLocation other = (CtltLocation) obj;
        return Objects.equals(this.locId, other.locId);
    }

}
