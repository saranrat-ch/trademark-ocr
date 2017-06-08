package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_NO09")
public class SistNo09 extends BaseEntity implements Serializable {


    private static final long serialVersionUID = -5017402974172804125L;

    @Id
    @SequenceGenerator(name = "SIST_NO09_SEQ", sequenceName = "SIST_NO09_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO09_SEQ")
    @Column(name = "TR_NO09_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long trNo09Id;

    @Temporal(TemporalType.DATE)
    @Column(name = "REQ_DATE", length = 7)
    private Date reqDate;

    @Column(name = "REQ_NAME", length = 150)
    private String reqName;

    @Column(name = "AGEN_ID", precision = 15, scale = 0)
    private Long agenId;

    @Column(name = "TR_REQ_NO", precision = 15, scale = 0)
    private Long trReqNo;

    @Column(name = "CHK21_QTY", precision = 12)
    private BigDecimal chk21Qty;

    @Column(name = "CHK22_QTY", precision = 12)
    private BigDecimal chk22Qty;

    @Column(name = "CHK23_QTY", precision = 12)
    private BigDecimal chk23Qty;

    @Column(name = "CHK24_QTY", precision = 12)
    private BigDecimal chk24Qty;

    @Column(name = "CHK25_QTY", precision = 12)
    private BigDecimal chk25Qty;

    @Column(name = "CHK26_QTY", precision = 12)
    private BigDecimal chk26Qty;

    @Column(name = "CHK27_QTY", precision = 12)
    private BigDecimal chk27Qty;

    @Column(name = "CHK28_QTY", precision = 12)
    private BigDecimal chk28Qty;

    @Column(name = "CHK29_QTY", precision = 12)
    private BigDecimal chk29Qty;

    @Column(name = "CHK29_DESC")
    private String chk29Desc;

    @Column(name = "FEE21_AMOUNT", precision = 12)
    private BigDecimal fee21Amount;

    @Column(name = "FEE22_AMOUNT", precision = 12)
    private BigDecimal fee22Amount;

    @Column(name = "FEE23_AMOUNT", precision = 12)
    private BigDecimal fee23Amount;

    @Column(name = "FEE24_AMOUNT", precision = 12)
    private BigDecimal fee24Amount;

    @Column(name = "FEE25_AMOUNT", precision = 12)
    private BigDecimal fee25Amount;

    @Column(name = "FEE26_AMOUNT", precision = 12)
    private BigDecimal fee26Amount;

    @Column(name = "FEE27_AMOUNT", precision = 12)
    private BigDecimal fee27Amount;

    @Column(name = "FEE28_AMOUNT", precision = 12)
    private BigDecimal fee28Amount;

    @Column(name = "FEE29_AMOUNT", precision = 12)
    private BigDecimal fee29Amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NICE_CLASS_ID")
    private CtltNiceClass ctltNiceClass;

    @Column(name = "NICE_CLASS_RELATE", length = 150)
    private String niceClassRelate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MARK_ID")
    private RpstMark rpstMark;

    @Column(name = "FEE_AMOUNT", precision = 12)
    private BigDecimal feeAmount;

    @Column(name = "USER_QUERY", length = 20)
    private String userQuery;

    @Column(name = "TIME_AMOUNT", precision = 15)
    private Long timeAmount;

    @Column(name = "LOGIN_FLAG", length = 1)
    private String loginFlag;

    @Column(name = "CHK21_FEE", precision = 12)
    private BigDecimal chk21Fee;

    @Column(name = "CHK22_FEE", precision = 12)
    private BigDecimal chk22Fee;

    @Column(name = "CHK23_FEE", precision = 12)
    private BigDecimal chk23Fee;

    @Column(name = "CHK24_FEE", precision = 12)
    private BigDecimal chk24Fee;

    @Column(name = "CHK25_FEE", precision = 12)
    private BigDecimal chk25Fee;

    @Column(name = "CHK26_FEE", precision = 12)
    private BigDecimal chk26Fee;

    @Column(name = "CHK27_FEE", precision = 12)
    private BigDecimal chk27Fee;

    @Column(name = "CHK28_FEE", precision = 12)
    private BigDecimal chk28Fee;

    @Column(name = "CHK29_FEE", precision = 12)
    private BigDecimal chk29Fee;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECV_ID")
    private SistRecvTm sistRecvTm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_ID")
    private CtltRecvJob ctltRecvJob;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCAN_ID")
    private CtstScan ctstScan;

    @Column(name = "PAY_REF_NO", precision = 15, scale = 0)
    private Long payRefNo;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIPT_DATE", length = 7)
    private Date receiptDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECEIPT_SCAN_ID")
    private CtstScan receiptScanId;

    @Column(name = "ENGLISH_FLAG", length = 1)
    private String englishFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SIGN_PERSON_ID")
    private CtltOfficer signCtltOfficer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRINT_PERSON_ID")
    private CtltOfficer printCtltOfficer;

    @Column(name = "APPOINT_FLAG", length = 1)
    private String appointFlag;

    @Column(name = "PANIT_FLAG", length = 1)
    private String panitFlag;

    @Column(name = "OLD_REQ_NAME", length = 150)
    private String oldReqName;

    /* Add Since 2559 */
    @Column(name = "IS_FEE_WAIVER")
    private Boolean isFeeWaiver;

    /* Add Since 2559 */
    public SistNo09() {
    }

    public SistNo09(Long trNo09Id) {
        this.trNo09Id = trNo09Id;
    }

    @Transient
    public Long getPk() {
        return trNo09Id;
    }

    public Long getTrNo09Id() {
        return this.trNo09Id;
    }

    public void setTrNo09Id(Long trNo09Id) {
        this.trNo09Id = trNo09Id;
    }

    public Date getReqDate() {
        return this.reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public String getReqName() {
        return this.reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public Long getAgenId() {
        return this.agenId;
    }

    public void setAgenId(Long agenId) {
        this.agenId = agenId;
    }

    public Long getTrReqNo() {
        return this.trReqNo;
    }

    public void setTrReqNo(Long trReqNo) {
        this.trReqNo = trReqNo;
    }

    public BigDecimal getChk21Qty() {
        return this.chk21Qty;
    }

    public void setChk21Qty(BigDecimal chk21Qty) {
        this.chk21Qty = chk21Qty;
    }

    public BigDecimal getChk22Qty() {
        return this.chk22Qty;
    }

    public void setChk22Qty(BigDecimal chk22Qty) {
        this.chk22Qty = chk22Qty;
    }

    public BigDecimal getChk23Qty() {
        return this.chk23Qty;
    }

    public void setChk23Qty(BigDecimal chk23Qty) {
        this.chk23Qty = chk23Qty;
    }

    public BigDecimal getChk24Qty() {
        return this.chk24Qty;
    }

    public void setChk24Qty(BigDecimal chk24Qty) {
        this.chk24Qty = chk24Qty;
    }

    public BigDecimal getChk25Qty() {
        return this.chk25Qty;
    }

    public void setChk25Qty(BigDecimal chk25Qty) {
        this.chk25Qty = chk25Qty;
    }

    public BigDecimal getChk26Qty() {
        return this.chk26Qty;
    }

    public void setChk26Qty(BigDecimal chk26Qty) {
        this.chk26Qty = chk26Qty;
    }

    public BigDecimal getChk27Qty() {
        return this.chk27Qty;
    }

    public void setChk27Qty(BigDecimal chk27Qty) {
        this.chk27Qty = chk27Qty;
    }

    public BigDecimal getChk28Qty() {
        return this.chk28Qty;
    }

    public void setChk28Qty(BigDecimal chk28Qty) {
        this.chk28Qty = chk28Qty;
    }

    public BigDecimal getChk29Qty() {
        return this.chk29Qty;
    }

    public void setChk29Qty(BigDecimal chk29Qty) {
        this.chk29Qty = chk29Qty;
    }

    public String getChk29Desc() {
        return this.chk29Desc;
    }

    public void setChk29Desc(String chk29Desc) {
        this.chk29Desc = chk29Desc;
    }

    public BigDecimal getFee21Amount() {
        return this.fee21Amount;
    }

    public void setFee21Amount(BigDecimal fee21Amount) {
        this.fee21Amount = fee21Amount;
    }

    public BigDecimal getFee22Amount() {
        return this.fee22Amount;
    }

    public void setFee22Amount(BigDecimal fee22Amount) {
        this.fee22Amount = fee22Amount;
    }

    public BigDecimal getFee23Amount() {
        return this.fee23Amount;
    }

    public void setFee23Amount(BigDecimal fee23Amount) {
        this.fee23Amount = fee23Amount;
    }

    public BigDecimal getFee24Amount() {
        return this.fee24Amount;
    }

    public void setFee24Amount(BigDecimal fee24Amount) {
        this.fee24Amount = fee24Amount;
    }

    public BigDecimal getFee25Amount() {
        return this.fee25Amount;
    }

    public void setFee25Amount(BigDecimal fee25Amount) {
        this.fee25Amount = fee25Amount;
    }

    public BigDecimal getFee26Amount() {
        return this.fee26Amount;
    }

    public void setFee26Amount(BigDecimal fee26Amount) {
        this.fee26Amount = fee26Amount;
    }

    public BigDecimal getFee27Amount() {
        return this.fee27Amount;
    }

    public void setFee27Amount(BigDecimal fee27Amount) {
        this.fee27Amount = fee27Amount;
    }

    public BigDecimal getFee28Amount() {
        return this.fee28Amount;
    }

    public void setFee28Amount(BigDecimal fee28Amount) {
        this.fee28Amount = fee28Amount;
    }

    public BigDecimal getFee29Amount() {
        return this.fee29Amount;
    }

    public void setFee29Amount(BigDecimal fee29Amount) {
        this.fee29Amount = fee29Amount;
    }

    public CtltNiceClass getCtltNiceClass() {
        return ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public String getNiceClassRelate() {
        return niceClassRelate;
    }

    public void setNiceClassRelate(String niceClassRelate) {
        this.niceClassRelate = niceClassRelate;
    }

    public RpstMark getRpstMark() {
        return rpstMark;
    }

    public void setRpstMark(RpstMark rpstMark) {
        this.rpstMark = rpstMark;
    }

    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getUserQuery() {
        return userQuery;
    }

    public void setUserQuery(String userQuery) {
        this.userQuery = userQuery;
    }

    public Long getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(Long timeAmount) {
        this.timeAmount = timeAmount;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public BigDecimal getChk21Fee() {
        return chk21Fee;
    }

    public void setChk21Fee(BigDecimal chk21Fee) {
        this.chk21Fee = chk21Fee;
    }

    public BigDecimal getChk22Fee() {
        return chk22Fee;
    }

    public void setChk22Fee(BigDecimal chk22Fee) {
        this.chk22Fee = chk22Fee;
    }

    public BigDecimal getChk23Fee() {
        return chk23Fee;
    }

    public void setChk23Fee(BigDecimal chk23Fee) {
        this.chk23Fee = chk23Fee;
    }

    public BigDecimal getChk24Fee() {
        return chk24Fee;
    }

    public void setChk24Fee(BigDecimal chk24Fee) {
        this.chk24Fee = chk24Fee;
    }

    public BigDecimal getChk25Fee() {
        return chk25Fee;
    }

    public void setChk25Fee(BigDecimal chk25Fee) {
        this.chk25Fee = chk25Fee;
    }

    public BigDecimal getChk26Fee() {
        return chk26Fee;
    }

    public void setChk26Fee(BigDecimal chk26Fee) {
        this.chk26Fee = chk26Fee;
    }

    public BigDecimal getChk27Fee() {
        return chk27Fee;
    }

    public void setChk27Fee(BigDecimal chk27Fee) {
        this.chk27Fee = chk27Fee;
    }

    public BigDecimal getChk28Fee() {
        return chk28Fee;
    }

    public void setChk28Fee(BigDecimal chk28Fee) {
        this.chk28Fee = chk28Fee;
    }

    public BigDecimal getChk29Fee() {
        return chk29Fee;
    }

    public void setChk29Fee(BigDecimal chk29Fee) {
        this.chk29Fee = chk29Fee;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
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

    public Long getPayRefNo() {
        return payRefNo;
    }

    public void setPayRefNo(Long payRefNo) {
        this.payRefNo = payRefNo;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public CtstScan getReceiptScanId() {
        return receiptScanId;
    }

    public void setReceiptScanId(CtstScan receiptScanId) {
        this.receiptScanId = receiptScanId;
    }

    public String getEnglishFlag() {
        return englishFlag;
    }

    public void setEnglishFlag(String englishFlag) {
        this.englishFlag = englishFlag;
    }

    public CtltOfficer getSignCtltOfficer() {
        return signCtltOfficer;
    }

    public void setSignCtltOfficer(CtltOfficer signCtltOfficer) {
        this.signCtltOfficer = signCtltOfficer;
    }

    public CtltOfficer getPrintCtltOfficer() {
        return printCtltOfficer;
    }

    public void setPrintCtltOfficer(CtltOfficer printCtltOfficer) {
        this.printCtltOfficer = printCtltOfficer;
    }

    public String getAppointFlag() {
        return appointFlag;
    }

    public void setAppointFlag(String appointFlag) {
        this.appointFlag = appointFlag;
    }

    public String getPanitFlag() {
        return panitFlag;
    }

    public void setPanitFlag(String panitFlag) {
        this.panitFlag = panitFlag;
    }

    public String getOldReqName() {
        return oldReqName;
    }

    public void setOldReqName(String oldReqName) {
        this.oldReqName = oldReqName;
    }

    public Boolean getIsFeeWaiver() {

        if (isFeeWaiver == null) {
            isFeeWaiver = Boolean.FALSE;
        }

        return isFeeWaiver;
    }

    public void setIsFeeWaiver(Boolean isFeeWaiver) {
        this.isFeeWaiver = isFeeWaiver;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.trNo09Id);
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
        final SistNo09 other = (SistNo09) obj;
        if (!Objects.equals(this.trNo09Id, other.trNo09Id)) {
            return false;
        }
        return true;
    }

}
