package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_PAYMENT_DET")
public class SistPaymentDet extends BaseEntity implements Serializable{
    private static final long serialVersionUID = 8645788418840790977L;

    @Id
    @SequenceGenerator(name = "SIST_PAYMENT_DET_SEQ", sequenceName = "SIST_PAYMENT_DET_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_PAYMENT_DET_SEQ")
    @Column(name = "PAY_DET_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long payDetId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PAY_ID")
    private SistPayment sistPayment;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RECV_ID")
    private SistRecvTm sistRecvTm;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SCAN_ID")
    private CtstScan ctstScan;

    @Column(name = "FILE_NAME", length = 150)
    private String fileName;

    @Temporal(TemporalType.DATE)
    @Column(name = "TR_DATE", length = 7)
    private Date trDate;

    @Column(name = "FEE_CODE", length = 3)
    private String feeCode;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIPT_DATE", length = 7)
    private Date receiptDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FEE_ID")
    private CtltFee ctltFee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_NO09_ID")
    private SistNo09 sistNo09;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REFNO_ID")
    private TrwtControlRefno trwtControlRefno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIST_PAY_ID")
    private SistListPayment sistListPayment;

    @Temporal(TemporalType.DATE)
    @Column(name = "CANCEL_DATE", length = 7)
    private Date cancelDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANCEL_PERSON_ID")
    private CtltOfficer cancelCtltOfficer;

    @Column(name = "CANCEL_DESC", length = 255)
    private String cancelDesc;

    @Column(name = "OLD_RECV_ID", precision = 15, scale = 0)
    private Long oldRecvId;

    @Column(name = "RECEIPT_BOOK", length = 10)
    private String receiptBook;

    @Column(name = "RETURN_FLAG", length = 1)
    private String returnFlag;

    @Column(name = "RETURN_DESC", length = 500)
    private String returnDesc;

    @Temporal(TemporalType.DATE)
    @Column(name = "RETURN_DATE", length = 7)
    private Date returnDate;

    @Column(name = "RETURN_PERSON_ID", precision = 15, scale = 0)
    private Long returnPersonId;

    /* Add Since 2559 */
    @Column(name = "FINE_COST", precision = 10, scale = 2)
    private BigDecimal fineCost;

    @Column(name = "IS_FEE_WAIVER")
    private Boolean isFeeWaiver;

    /* Add Since 2559 */
    public SistPaymentDet() {
    }

    public SistPaymentDet(Long payDetId) {
        this.payDetId = payDetId;
    }

    @Transient
    public Long getPk() {
        return payDetId;
    }

    public Long getPayDetId() {
        return this.payDetId;
    }

    public void setPayDetId(Long payDetId) {
        this.payDetId = payDetId;
    }

    public SistPayment getSistPayment() {
        return sistPayment;
    }

    public void setSistPayment(SistPayment sistPayment) {
        this.sistPayment = sistPayment;
    }

    public SistRecvTm getSistRecvTm() {
        return sistRecvTm;
    }

    public void setSistRecvTm(SistRecvTm sistRecvTm) {
        this.sistRecvTm = sistRecvTm;
    }

    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public CtstScan getCtstScan() {
        return ctstScan;
    }

    public void setCtstScan(CtstScan ctstScan) {
        this.ctstScan = ctstScan;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getTrDate() {
        return trDate;
    }

    public void setTrDate(Date trDate) {
        this.trDate = trDate;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getReceiptNo() {
        return this.receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Date getReceiptDate() {
        return this.receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public CtltFee getCtltFee() {
        return ctltFee;
    }

    public void setCtltFee(CtltFee ctltFee) {
        this.ctltFee = ctltFee;
    }

    public SistNo09 getSistNo09() {
        return sistNo09;
    }

    public void setSistNo09(SistNo09 sistNo09) {
        this.sistNo09 = sistNo09;
    }

    public TrwtControlRefno getTrwtControlRefno() {
        return trwtControlRefno;
    }

    public void setTrwtControlRefno(TrwtControlRefno trwtControlRefno) {
        this.trwtControlRefno = trwtControlRefno;
    }

    public SistListPayment getSistListPayment() {
        return sistListPayment;
    }

    public void setSistListPayment(SistListPayment sistListPayment) {
        this.sistListPayment = sistListPayment;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public CtltOfficer getCancelCtltOfficer() {
        return cancelCtltOfficer;
    }

    public void setCancelCtltOfficer(CtltOfficer cancelCtltOfficer) {
        this.cancelCtltOfficer = cancelCtltOfficer;
    }

    public String getCancelDesc() {
        return cancelDesc;
    }

    public void setCancelDesc(String cancelDesc) {
        this.cancelDesc = cancelDesc;
    }

    public Long getOldRecvId() {
        return oldRecvId;
    }

    public void setOldRecvId(Long oldRecvId) {
        this.oldRecvId = oldRecvId;
    }

    public String getReceiptBook() {
        return receiptBook;
    }

    public void setReceiptBook(String receiptBook) {
        this.receiptBook = receiptBook;
    }

    public String getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(String returnFlag) {
        this.returnFlag = returnFlag;
    }

    public String getReturnDesc() {
        return returnDesc;
    }

    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Long getReturnPersonId() {
        return returnPersonId;
    }

    public void setReturnPersonId(Long returnPersonId) {
        this.returnPersonId = returnPersonId;
    }

    public BigDecimal getFineCost() {

        if (fineCost == null) {
            fineCost = BigDecimal.ZERO;
        }

        return fineCost;
    }

    public void setFineCost(BigDecimal fineCost) {
        this.fineCost = fineCost;
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
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.payDetId);
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
        final SistPaymentDet other = (SistPaymentDet) obj;
        if (!Objects.equals(this.payDetId, other.payDetId)) {
            return false;
        }
        return true;
    }

}
