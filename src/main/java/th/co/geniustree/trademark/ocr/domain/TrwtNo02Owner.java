package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "TRWT_NO02_OWNER")
public class TrwtNo02Owner extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8498483505291059362L;

    @Id
    @SequenceGenerator(name = "TRWT_NO02_OWNER_SEQ", sequenceName = "TRWT_NO02_OWNER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO02_OWNER_SEQ")
    @Column(name = "OWNER_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long ownerId;

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    @ManyToOne
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne
    @JoinColumn(name = "TRW_NO02_ID")
    private TrwtNo02 trwtNo02;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "OWNER_TYPE", length = 1)
    private String ownerType;

    @Column(name = "OWNER_NAME", length = 150)
    private String ownerName;

    @Column(name = "OWNER_SURNAME", length = 150)
    private String ownerSurname;

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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public CtltTitle getCtltTitle() {
        return ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public CtltLocation getCtltLocation() {
        return ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public CtltOccupation getCtltOccupation() {
        return ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
    }

    public CtltNation getCtltNation() {
        return ctltNation;
    }

    public void setCtltNation(CtltNation ctltNation) {
        this.ctltNation = ctltNation;
    }

    public TrwtNo02 getTrwtNo02() {
        return trwtNo02;
    }

    public void setTrwtNo02(TrwtNo02 trwtNo02) {
        this.trwtNo02 = trwtNo02;
    }

    public CtltCountry getCtltCountry() {
        return ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerCardid() {
        return ownerCardid;
    }

    public void setOwnerCardid(String ownerCardid) {
        this.ownerCardid = ownerCardid;
    }

   public String getOwnerAddr() {
        return ownerAddr;
    }

    public void setOwnerAddr(String ownerAddr) {
        this.ownerAddr = ownerAddr;
    }

    public String getOwnerSoi() {
        return ownerSoi;
    }

    public void setOwnerSoi(String ownerSoi) {
        this.ownerSoi = ownerSoi;
    }

    public String getOwnerRoad() {
        return ownerRoad;
    }

    public void setOwnerRoad(String ownerRoad) {
        this.ownerRoad = ownerRoad;
    }

    public String getOwnerPostcode() {
        return ownerPostcode;
    }

    public void setOwnerPostcode(String ownerPostcode) {
        this.ownerPostcode = ownerPostcode;
    }

   public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerFax() {
        return ownerFax;
    }

    public void setOwnerFax(String ownerFax) {
        this.ownerFax = ownerFax;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

     public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

     public String getOwnerMoo() {
        return ownerMoo;
    }

    public void setOwnerMoo(String ownerMoo) {
        this.ownerMoo = ownerMoo;
    }

    public String getFullCountry(){
        return getCtltCountry().getCountryName();
    }
    public String getFullOwnerAddress(){
        return getCtltLocation().getLocRepName();
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final TrwtNo02Owner other = (TrwtNo02Owner) obj;
        if (!Objects.equals(this.ownerId, other.ownerId)) {
            return false;
        }
        return true;
    }
}
