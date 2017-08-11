package th.co.geniustree.trademark.ocr.domain;

// Generated Nov 20, 2013 10:21:02 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Objects;

/**
 * TrwtNo05Jowner generated by hbm2java
 */
@Entity
@Table(name = "TRWT_NO05_JOWNER")
public class TrwtNo05Jowner extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = -5501123081800673244L;

    @Id
    @SequenceGenerator(name = "TRWT_NO05_JOWNER_SEQ", sequenceName = "TRWT_NO05_JOWNER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO05_JOWNER_SEQ")
    @Column(name = "JOWNER_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long jownerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NO05_ID")
    private TrwtNo05 trwtNo05;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "JOWNER_TYPE", length = 1)
    private String jownerType;

    @Column(name = "JOWNER_NAME", length = 150)
    private String jownerName;

    @Column(name = "JOWNER_SURNAME", length = 150)
    private String jownerSurname;

    @Column(name = "JOWNER_CARDID", length = 50)
    private String jownerCardid;

    @Column(name = "JOWNER_ADDR", length = 150)
    private String jownerAddr;

    @Column(name = "JOWNER_MOO", length = 150)
    private String jownerMoo;

    @Column(name = "JOWNER_SOI", length = 150)
    private String jownerSoi;

    @Column(name = "JOWNER_ROAD", length = 150)
    private String jownerRoad;

    @Column(name = "JOWNER_POSTCODE", length = 10)
    private String jownerPostcode;

    @Column(name = "JOWNER_PHONE", length = 50)
    private String jownerPhone;

    @Column(name = "JOWNER_FAX", length = 50)
    private String jownerFax;

    @Column(name = "JOWNER_EMAIL", length = 150)
    private String jownerEmail;

    @Column(name = "USE_STATUS", length = 1)
    private String useStatus;

    public Long getJownerId() {
        return this.jownerId;
    }

    public void setJownerId(Long jownerId) {
        this.jownerId = jownerId;
    }

    public CtltTitle getCtltTitle() {
        return this.ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public CtltOccupation getCtltOccupation() {
        return this.ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
    }

    public TrwtNo05 getTrwtNo05() {
        return this.trwtNo05;
    }

    public void setTrwtNo05(TrwtNo05 trwtNo05) {
        this.trwtNo05 = trwtNo05;
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

    public String getJownerType() {
        return this.jownerType;
    }

    public void setJownerType(String jownerType) {
        this.jownerType = jownerType;
    }

    public String getJownerName() {
        return this.jownerName;
    }

    public void setJownerName(String jownerName) {
        this.jownerName = jownerName;
    }

    public String getJownerSurname() {
        return this.jownerSurname;
    }

    public void setJownerSurname(String jownerSurname) {
        this.jownerSurname = jownerSurname;
    }

    public String getJownerCardid() {
        return this.jownerCardid;
    }

    public void setJownerCardid(String jownerCardid) {
        this.jownerCardid = jownerCardid;
    }

    public String getJownerAddr() {
        return this.jownerAddr;
    }

    public void setJownerAddr(String jownerAddr) {
        this.jownerAddr = jownerAddr;
    }

    public String getJownerSoi() {
        return this.jownerSoi;
    }

    public void setJownerSoi(String jownerSoi) {
        this.jownerSoi = jownerSoi;
    }

    public String getJownerRoad() {
        return this.jownerRoad;
    }

    public void setJownerRoad(String jownerRoad) {
        this.jownerRoad = jownerRoad;
    }

    public String getJownerPostcode() {
        return this.jownerPostcode;
    }

    public void setJownerPostcode(String jownerPostcode) {
        this.jownerPostcode = jownerPostcode;
    }

    public String getJownerPhone() {
        return this.jownerPhone;
    }

    public void setJownerPhone(String jownerPhone) {
        this.jownerPhone = jownerPhone;
    }

    public String getJownerFax() {
        return this.jownerFax;
    }

    public void setJownerFax(String jownerFax) {
        this.jownerFax = jownerFax;
    }

    public String getJownerEmail() {
        return this.jownerEmail;
    }

    public void setJownerEmail(String jownerEmail) {
        this.jownerEmail = jownerEmail;
    }

    public String getUseStatus() {
        return this.useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public String getJownerMoo() {
        return jownerMoo;
    }

    public void setJownerMoo(String jownerMoo) {
        this.jownerMoo = jownerMoo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.jownerId);
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
        final TrwtNo05Jowner other = (TrwtNo05Jowner) obj;
        if (!Objects.equals(this.jownerId, other.jownerId)) {
            return false;
        }
        return true;
    }

}