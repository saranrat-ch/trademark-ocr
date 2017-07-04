package th.co.geniustree.trademark.ocr.domain;

// Generated Jan 29, 2014 4:37:08 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Objects;

/**
 * SistNo02Agency generated by hbm2java
 */
@Entity
@Table(name = "SIST_NO02_AGENCY")
public class SistNo02Agency extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = 3359054765037569942L;

    @Id
    @SequenceGenerator(name = "SIST_NO02_AGENCY_SEQ", sequenceName = "SIST_NO02_AGENCY_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO02_AGENCY_SEQ")
    @Column(name = "AGENCY_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long agencyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_NO02_ID", nullable = false)
    private SistNo02 sistNo02;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AGEN_ID")
    private CtltAgency ctltAgency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "AGEN_TYPE", length = 1)
    private String agenType;

    @Column(name = "AGEN_TYPE_DET")
    private String agenTypeDet;

    @Column(name = "AGEN_CARD_NO", length = 50)
    private String agenCardNo;

    @Column(name = "AGEN_CARD_TYPE", length = 1)
    private String agenCardType;

    @Column(name = "AGEN_NAME", length = 150)
    private String agenName;

    @Column(name = "AGEN_GENDER", length = 1)
    private String agenGender;

    @Column(name = "AGEN_ADDR", length = 1000)
    private String agenAddr;

    @Column(name = "LOC_CODE", length = 8)
    private String locCode;

    @Column(name = "AGEN_POSTCODE", length = 10)
    private String agenPostcode;

    @Column(name = "AGEN_PHONE", length = 50)
    private String agenPhone;

    @Column(name = "AGEN_FAX", length = 50)
    private String agenFax;

    @Column(name = "AGEN_EMAIL", length = 150)
    private String agenEmail;

    @Column(name = "AGEN_KIND", length = 1)
    private String agenKind;

    @Column(name = "AGEN_SEQ", precision = 2, scale = 0)
    private Long agenSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_AGENCY_ID")
    private TrwtNo02Agency trwtNo02Agency;

    @Column(name = "AND_OR_TYPE", length = 1)
    private String andOrType;

    public SistNo02Agency() {
    }

    public SistNo02Agency(Long agencyId) {
        this.agencyId = agencyId;
    }

    @Transient
    public Long getPk() {
        return agencyId;
    }

    public Long getAgencyId() {
        return this.agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public SistNo02 getSistNo02() {
        return this.sistNo02;
    }

    public void setSistNo02(SistNo02 sistNo02) {
        this.sistNo02 = sistNo02;
    }

    public CtltOccupation getCtltOccupation() {
        return this.ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
    }

    public CtltAgency getCtltAgency() {
        return this.ctltAgency;
    }

    public void setCtltAgency(CtltAgency ctltAgency) {
        this.ctltAgency = ctltAgency;
    }

    public CtltNation getCtltNation() {
        return this.ctltNation;
    }

    public void setCtltNation(CtltNation ctltNation) {
        this.ctltNation = ctltNation;
    }

    public CtltCountry getCtltCountry() {
        return this.ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public String getAgenType() {
        return this.agenType;
    }

    public void setAgenType(String agenType) {
        this.agenType = agenType;
    }

    public String getAgenTypeDet() {
        return this.agenTypeDet;
    }

    public void setAgenTypeDet(String agenTypeDet) {
        this.agenTypeDet = agenTypeDet;
    }

    public String getAgenCardNo() {
        return this.agenCardNo;
    }

    public void setAgenCardNo(String agenCardNo) {
        this.agenCardNo = agenCardNo;
    }

    public String getAgenCardType() {
        return this.agenCardType;
    }

    public void setAgenCardType(String agenCardType) {
        this.agenCardType = agenCardType;
    }

    public String getAgenName() {
        return this.agenName;
    }

    public void setAgenName(String agenName) {
        this.agenName = agenName;
    }

    public String getAgenGender() {
        return this.agenGender;
    }

    public void setAgenGender(String agenGender) {
        this.agenGender = agenGender;
    }

    public String getAgenAddr() {
        return this.agenAddr;
    }

    public void setAgenAddr(String agenAddr) {
        this.agenAddr = agenAddr;
    }

    public String getLocCode() {
        return this.locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public String getAgenPostcode() {
        return this.agenPostcode;
    }

    public void setAgenPostcode(String agenPostcode) {
        this.agenPostcode = agenPostcode;
    }

    public String getAgenPhone() {
        return this.agenPhone;
    }

    public void setAgenPhone(String agenPhone) {
        this.agenPhone = agenPhone;
    }

    public String getAgenFax() {
        return this.agenFax;
    }

    public void setAgenFax(String agenFax) {
        this.agenFax = agenFax;
    }

    public String getAgenEmail() {
        return this.agenEmail;
    }

    public void setAgenEmail(String agenEmail) {
        this.agenEmail = agenEmail;
    }

    public String getAgenKind() {
        return this.agenKind;
    }

    public void setAgenKind(String agenKind) {
        this.agenKind = agenKind;
    }

    public Long getAgenSeq() {
        return this.agenSeq;
    }

    public void setAgenSeq(Long agenSeq) {
        this.agenSeq = agenSeq;
    }

    public TrwtNo02Agency getTrwtNo02Agency() {
        return trwtNo02Agency;
    }

    public void setTrwtNo02Agency(TrwtNo02Agency trwtNo02Agency) {
        this.trwtNo02Agency = trwtNo02Agency;
    }

    public String getAndOrType() {
        return andOrType;
    }

    public void setAndOrType(String andOrType) {
        this.andOrType = andOrType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.agencyId);
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
        final SistNo02Agency other = (SistNo02Agency) obj;
        if (!Objects.equals(this.agencyId, other.agencyId)) {
            return false;
        }
        return true;
    }

}