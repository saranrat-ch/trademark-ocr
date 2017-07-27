package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_NO04")
public class SistNo04 extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = 5936485909288771853L;

    @Id
    @SequenceGenerator(name = "SIST_NO04_SEQ", sequenceName = "SIST_NO04_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO04_SEQ")
    @Column(name = "TR_NO04_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long trNo04Id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONT_COUNTRY_ID")
    private CtltCountry ctltCountry;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONT_LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "TR_NO04_DATE", nullable = false, length = 7)
    private LocalDate trNo04Date;

    @Column(name = "TR_NO04_SEQ", precision = 22, scale = 0)
    private Long trNo04Seq;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @Column(name = "TR_DATE", length = 7)
    private LocalDate trDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COM_ORG_ID")
    private CtltOrganize ctltOrganize;

    @Column(name = "PAY_FLAG", length = 1)
    private String payFlag;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "CONT_NAME", length = 150)
    private String contName;

    @Column(name = "CONT_TO", length = 1)
    private String contTo;

    @Column(name = "CONT_TO_DET")
    private String contToDet;

    @Column(name = "CONT_TYPE", length = 1)
    private String contType;

    @Column(name = "CONT_TYPE_DET")
    private String contTypeDet;

    @Column(name = "CONT_CARD_TYPE", length = 1)
    private String contCardType;

    @Column(name = "CONT_CARD_NO", length = 25)
    private String contCardNo;

    @Column(name = "CONT_GENDER", length = 1)
    private String contGender;

    @Column(name = "CONT_ADDR", length = 1000)
    private String contAddr;

    @Column(name = "CONT_LOC_CODE", length = 8)
    private String contLocCode;

    @Column(name = "CONT_POSTCODE", length = 8)
    private String contPostcode;

    @Column(name = "CONT_PHONE", length = 150)
    private String contPhone;

    @Column(name = "CONT_FAX", length = 150)
    private String contFax;

    @Column(name = "CONT_EMAIL", length = 150)
    private String contEmail;

    @Column(name = "AUTH_TYPE", length = 1)
    private String authType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECV_ID")
    private SistRecvTm sistRecvTm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_ID")
    private CtltRecvJob ctltRecvJob;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCAN_ID")
    private CtstScan ctstScan;

    @Column(name = "SEND_FLAG", length = 1)
    private String sendFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NO04_ID")
    private TrwtNo04 trwtNo04;

    /* Add Since 2559 */
    @Column(name = "AUTH_TYPE_SUB", length = 1)
    private String authTypeSub;

    /* Add Since 2559 */
    public SistNo04() {
    }

    public SistNo04(Long trNo04Id) {
        this.trNo04Id = trNo04Id;
    }

    @Transient
    public Long getPk() {
        return trNo04Id;
    }

    public Long getTrNo04Id() {
        return this.trNo04Id;
    }

    public void setTrNo04Id(Long trNo04Id) {
        this.trNo04Id = trNo04Id;
    }

    public CtltCountry getCtltCountry() {
        return this.ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public RpstTrademark getRpstTrademark() {
        return this.rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public Long getTrNo04Seq() {
        return this.trNo04Seq;
    }

    public void setTrNo04Seq(Long trNo04Seq) {
        this.trNo04Seq = trNo04Seq;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public void setTrNo04Date(LocalDate trNo04Date) {
        this.trNo04Date = trNo04Date;
    }

    public LocalDate getTrDate() {
        return trDate;
    }

    public void setTrDate(LocalDate trDate) {
        this.trDate = trDate;
    }

    public CtltOrganize getCtltOrganize() {
        return this.ctltOrganize;
    }

    public void setCtltOrganize(CtltOrganize ctltOrganize) {
        this.ctltOrganize = ctltOrganize;
    }

    public String getPayFlag() {
        return this.payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getContName() {
        return this.contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContTo() {
        return this.contTo;
    }

    public void setContTo(String contTo) {
        this.contTo = contTo;
    }

    public String getContToDet() {
        return this.contToDet;
    }

    public void setContToDet(String contToDet) {
        this.contToDet = contToDet;
    }

    public String getContType() {
        return this.contType;
    }

    public void setContType(String contType) {
        this.contType = contType;
    }

    public String getContTypeDet() {
        return this.contTypeDet;
    }

    public void setContTypeDet(String contTypeDet) {
        this.contTypeDet = contTypeDet;
    }

    public String getContCardType() {
        return this.contCardType;
    }

    public void setContCardType(String contCardType) {
        this.contCardType = contCardType;
    }

    public String getContCardNo() {
        return this.contCardNo;
    }

    public void setContCardNo(String contCardNo) {
        this.contCardNo = contCardNo;
    }

    public String getContGender() {
        return this.contGender;
    }

    public void setContGender(String contGender) {
        this.contGender = contGender;
    }

    public String getContAddr() {
        return this.contAddr;
    }

    public void setContAddr(String contAddr) {
        this.contAddr = contAddr;
    }

    public String getContLocCode() {
        return this.contLocCode;
    }

    public void setContLocCode(String contLocCode) {
        this.contLocCode = contLocCode;
    }

    public String getContPostcode() {
        return this.contPostcode;
    }

    public void setContPostcode(String contPostcode) {
        this.contPostcode = contPostcode;
    }

    public String getContPhone() {
        return this.contPhone;
    }

    public void setContPhone(String contPhone) {
        this.contPhone = contPhone;
    }

    public String getContFax() {
        return this.contFax;
    }

    public void setContFax(String contFax) {
        this.contFax = contFax;
    }

    public String getContEmail() {
        return this.contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public String getAuthType() {
        return this.authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthTypeSub() {
        return this.authTypeSub;
    }

    public void setAuthTypeSub(String authTypeSub) {
        this.authTypeSub = authTypeSub;
    }

    public SistRecvTm getSistRecvTm() {
        return sistRecvTm;
    }

    public void setSistRecvTm(SistRecvTm sistRecvTm) {
        this.sistRecvTm = sistRecvTm;
    }

    public CtltRecvJob getCtltRecvJob() {
        return ctltRecvJob;
    }

    public void setCtltRecvJob(CtltRecvJob ctltRecvJob) {
        this.ctltRecvJob = ctltRecvJob;
    }

    public CtstScan getCtstScan() {
        return ctstScan;
    }

    public void setCtstScan(CtstScan ctstScan) {
        this.ctstScan = ctstScan;
    }

    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    public TrwtNo04 getTrwtNo04() {
        return trwtNo04;
    }

    public void setTrwtNo04(TrwtNo04 trwtNo04) {
        this.trwtNo04 = trwtNo04;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.trNo04Id);
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
        final SistNo04 other = (SistNo04) obj;
        if (!Objects.equals(this.trNo04Id, other.trNo04Id)) {
            return false;
        }
        return true;
    }

}
