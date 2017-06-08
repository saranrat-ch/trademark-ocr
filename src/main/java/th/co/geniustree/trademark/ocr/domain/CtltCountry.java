package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CTLT_COUNTRY")
public class CtltCountry extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = -8436543381721716900L;
    @Id
    @SequenceGenerator(name = "CTLT_COUNTRY_SEQ", sequenceName = "CTLT_COUNTRY_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_COUNTRY_SEQ")
    @Column(name = "COUNTRY_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long countryId;

    @Column(name = "COUNTRY_NAME", nullable = false, length = 150)
    private String countryName;

    @Column(name = "COUNTRY_CODE", length = 50)
    private String countryCode;

    @Column(name = "ASEAN_FLAG", length = 1)
    private String aseanFlag;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;



    public CtltCountry() {
    }

    public CtltCountry(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }


    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    public String getAseanFlag() {
        return this.aseanFlag;
    }

    public void setAseanFlag(String aseanFlag) {
        this.aseanFlag = aseanFlag;
    }


    public String getUseFlag() {
        return this.useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.countryId);
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
        final CtltCountry other = (CtltCountry) obj;
        if (!Objects.equals(this.countryId, other.countryId)) {
            return false;
        }
        return true;
    }

}
