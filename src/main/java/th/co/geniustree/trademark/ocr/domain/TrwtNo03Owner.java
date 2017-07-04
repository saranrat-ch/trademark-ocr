package th.co.geniustree.trademark.ocr.domain;


import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "TRWT_NO03_OWNER")
public class TrwtNo03Owner extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = 1416267182365516244L;

    @Id
    @SequenceGenerator(name = "TRWT_NO03_OWNER_SEQ", sequenceName = "TRWT_NO03_OWNER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO03_OWNER_SEQ")
    @Column(name = "OWNER_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long ownerId;

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
    @JoinColumn(name = "TRW_NO03_ID")
    private TrwtNo03 trwtNo03;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "OWNER_TYPE", length = 1)
    private String ownerType;

    @NotBlank(message = "กรุณาระบุชื่อ")
    @Column(name = "OWNER_NAME", length = 150)
    private String ownerName;

    @Column(name = "OWNER_SURNAME", length = 150)
    private String ownerSurname;

    @NotBlank(message = "ระบุที่อยู่")
    @Column(name = "OWNER_CARDID", length = 50)
    private String ownerCardid;

    @Column(name = "OWNER_ADDR", length = 150)
    private String ownerAddr;

    @Column(name = "OWNER_SOI", length = 150)
    private String ownerSoi;

    @Column(name = "OWNER_ROAD", length = 150)
    private String ownerRoad;

    @Column(name = "OWNER_POSTCODE", length = 10)
    private String ownerPostcode;

    @Column(name = "OWNER_PHONE", length = 50)
    private String ownerPhone;

    @Column(name = "OWNER_FAX", length = 50)
    private String ownerFax;

    @Column(name = "OWNER_EMAIL", length = 150)
    private String ownerEmail;

    @Column(name = "USE_STATUS", length = 1)
    private String useStatus;

    @Column(name = "OWNER_MOO", length = 150)
    private String ownerMoo;

    public TrwtNo03Owner() {
    }

    public TrwtNo03Owner(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public TrwtNo03 getTrwtNo03() {
        return this.trwtNo03;
    }

    public void setTrwtNo03(TrwtNo03 trwtNo03) {
        this.trwtNo03 = trwtNo03;
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

    public String getOwnerType() {
        return this.ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return this.ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerCardid() {
        return this.ownerCardid;
    }

    public void setOwnerCardid(String ownerCardid) {
        this.ownerCardid = ownerCardid;
    }

    public String getOwnerAddr() {
        return this.ownerAddr;
    }

    public void setOwnerAddr(String ownerAddr) {
        this.ownerAddr = ownerAddr;
    }

    public String getOwnerSoi() {
        return this.ownerSoi;
    }

    public void setOwnerSoi(String ownerSoi) {
        this.ownerSoi = ownerSoi;
    }

    public String getOwnerRoad() {
        return this.ownerRoad;
    }

    public void setOwnerRoad(String ownerRoad) {
        this.ownerRoad = ownerRoad;
    }

    public String getOwnerPostcode() {
        return this.ownerPostcode;
    }

    public void setOwnerPostcode(String ownerPostcode) {
        this.ownerPostcode = ownerPostcode;
    }

    public String getOwnerPhone() {
        return this.ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerFax() {
        return this.ownerFax;
    }

    public void setOwnerFax(String ownerFax) {
        this.ownerFax = ownerFax;
    }

    public String getOwnerEmail() {
        return this.ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getUseStatus() {
        return this.useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public String getOwnerMoo() {
        return this.ownerMoo;
    }

    public void setOwnerMoo(String ownerMoo) {
        this.ownerMoo = ownerMoo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ownerId);
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
        final TrwtNo03Owner other = (TrwtNo03Owner) obj;
        if (!Objects.equals(this.ownerId, other.ownerId)) {
            return false;
        }
        return true;
    }

}
