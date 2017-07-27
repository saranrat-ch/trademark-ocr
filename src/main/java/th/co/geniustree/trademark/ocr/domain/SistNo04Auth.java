package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SIST_NO04_AUTH")
public class SistNo04Auth extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "SIST_NO04_AUTH_SEQ", sequenceName = "SIST_NO04_AUTH_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO04_AUTH_SEQ")
    @Column(name = "AUTH_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long authId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_NO04_ID", nullable = false)
    private SistNo04 sistNo04;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "AUTH_TYPE", length = 1)
    private String authType;

    @Column(name = "AUTH_TYPE_DET")
    private String authTypeDet;

    @Column(name = "AUTH_CARD_NO", length = 50)
    private String authCardNo;

    @Column(name = "AUTH_CARD_TYPE", length = 1)
    private String authCardType;

    @Column(name = "AUTH_NAME", length = 150)
    private String authName;

    @Column(name = "AUTH_DET")
    private String authDet;

    @Column(name = "AUTH_GENDER", length = 1)
    private String authGender;

    @Column(name = "AUTH_ADDR", length = 1000)
    private String authAddr;

    @Column(name = "LOC_CODE", length = 8)
    private String locCode;

    @Column(name = "AUTH_POSTCODE", length = 10)
    private String authPostcode;

    @Column(name = "AUTH_PHONE", length = 50)
    private String authPhone;

    @Column(name = "AUTH_FAX", length = 50)
    private String authFax;

    @Column(name = "AUTH_EMAIL", length = 150)
    private String authEmail;

    @Column(name = "CHANGE_DET", length = 1000)
    private String changeDet;

    @Column(name = "AUTH_SEQ", precision = 1, scale = 0)
    private Long authSeq;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_RECEIPT_ID")
    private TrwtNo04Receipt trwtNo04Receipt;

    public SistNo04Auth() {
    }

    public SistNo04Auth(Long authId) {
        this.authId = authId;
    }


    @Transient
    public Long getPk() {
        return authId;
    }


    public Long getAuthId() {
        return this.authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
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

    public CtltNation getCtltNation() {
        return this.ctltNation;
    }

    public void setCtltNation(CtltNation ctltNation) {
        this.ctltNation = ctltNation;
    }

    public SistNo04 getSistNo04() {
        return this.sistNo04;
    }

    public void setSistNo04(SistNo04 sistNo04) {
        this.sistNo04 = sistNo04;
    }

    public CtltCountry getCtltCountry() {
        return this.ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public String getAuthType() {
        return this.authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthTypeDet() {
        return this.authTypeDet;
    }

    public void setAuthTypeDet(String authTypeDet) {
        this.authTypeDet = authTypeDet;
    }

    public String getAuthCardNo() {
        return this.authCardNo;
    }

    public void setAuthCardNo(String authCardNo) {
        this.authCardNo = authCardNo;
    }

    public String getAuthCardType() {
        return this.authCardType;
    }

    public void setAuthCardType(String authCardType) {
        this.authCardType = authCardType;
    }

    public String getAuthName() {
        return this.authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthDet() {
        return this.authDet;
    }

    public void setAuthDet(String authDet) {
        this.authDet = authDet;
    }

    public String getAuthGender() {
        return this.authGender;
    }

    public void setAuthGender(String authGender) {
        this.authGender = authGender;
    }

    public String getAuthAddr() {
        return this.authAddr;
    }

    public void setAuthAddr(String authAddr) {
        this.authAddr = authAddr;
    }

    public String getLocCode() {
        return this.locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public String getAuthPostcode() {
        return this.authPostcode;
    }

    public void setAuthPostcode(String authPostcode) {
        this.authPostcode = authPostcode;
    }

    public String getAuthPhone() {
        return this.authPhone;
    }

    public void setAuthPhone(String authPhone) {
        this.authPhone = authPhone;
    }

    public String getAuthFax() {
        return this.authFax;
    }

    public void setAuthFax(String authFax) {
        this.authFax = authFax;
    }

    public String getAuthEmail() {
        return this.authEmail;
    }

    public void setAuthEmail(String authEmail) {
        this.authEmail = authEmail;
    }

    public String getChangeDet() {
        return this.changeDet;
    }

    public void setChangeDet(String changeDet) {
        this.changeDet = changeDet;
    }

    public Long getAuthSeq() {
        return this.authSeq;
    }

    public void setAuthSeq(Long authSeq) {
        this.authSeq = authSeq;
    }

    public TrwtNo04Receipt getTrwtNo04Receipt() {
        return trwtNo04Receipt;
    }

    public void setTrwtNo04Receipt(TrwtNo04Receipt trwtNo04Receipt) {
        this.trwtNo04Receipt = trwtNo04Receipt;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.authId);
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
        final SistNo04Auth other = (SistNo04Auth) obj;
        if (!Objects.equals(this.authId, other.authId)) {
            return false;
        }
        return true;
    }

}
