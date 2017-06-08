package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_PAYMENT")
public class SistPayment extends BaseEntity implements Serializable{
    private static final long serialVersionUID = 8558169460164217604L;

    @Id
    @SequenceGenerator(name = "SIST_PAYMENT_SEQ", sequenceName = "SIST_PAYMENT_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_PAYMENT_SEQ")
    @Column(name = "PAY_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long payId;

    @Column(name = "PAY_REF_NO", precision = 15, scale = 0)
    private Long payRefNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECV_DATE", length = 7)
    private Date recvDate;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIPT_DATE", length = 7)
    private Date receiptDate;

    @Column(name = "RECEIPT_BOOK", length = 10)
    private String receiptBook;

    @Column(name = "TR_NO", precision = 22, scale = 0)
    private Long trNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "REQ_DATE", length = 7)
    private Date reqDate;

    @Column(name = "CARD_FLAG", length = 1)
    private String cardFlag;

    @Column(name = "CARD_NO", length = 20)
    private String cardNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AGEN_ID")
    private CtltAgency ctltAgency;

    @Column(name = "FILE_NAME", length = 150)
    private String fileName;

    @Column(name = "FEE_TOTAL", precision = 10)
    private BigDecimal feeTotal;

    @Column(name = "REQ_NAME", length = 500)
    private String reqName;

    @Column(name = "BUDG_YEAR", length = 4)
    private String budgYear;

    @Column(name = "CANCEL_FLAG", length = 1)
    private String cancelFlag;

    @Column(name = "FEE_CODE", length = 3)
    private String feeCode;

    @Column(name = "PAYMENT_STATUS", length = 1)
    private String paymentStatus;

    @Column(name = "PAYMENT_TYPE", length = 1)
    private String paymentType;

    @Temporal(TemporalType.DATE)
    @Column(name = "CANCEL_DATE", length = 7)
    private Date cancelDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CANCEL_PERSON_ID")
    private CtltOfficer cancelCtltOfficer;

    @Column(name = "CANCEL_DESC", length = 255)
    private String cancelDesc;

    @Column(name = "NEW_PAY_REF_NO", precision = 15, scale = 0)
    private Long newPayRefNo;

    public SistPayment() {
    }

    public SistPayment(Long payId) {
        this.payId = payId;
    }

    @Transient
    public Long getPk() {
        return payId;
    }

    public Long getPayId() {
        return this.payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public Long getPayRefNo() {
        return this.payRefNo;
    }

    public void setPayRefNo(Long payRefNo) {
        this.payRefNo = payRefNo;
    }

    public Date getRecvDate() {
        return this.recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
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

    public String getReceiptBook() {
        return this.receiptBook;
    }

    public void setReceiptBook(String receiptBook) {
        this.receiptBook = receiptBook;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Date getReqDate() {
        return this.reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public String getCardFlag() {
        return this.cardFlag;
    }

    public void setCardFlag(String cardFlag) {
        this.cardFlag = cardFlag;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CtltAgency getCtltAgency() {
        return ctltAgency;
    }

    public void setCtltAgency(CtltAgency ctltAgency) {
        this.ctltAgency = ctltAgency;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BigDecimal getFeeTotal() {
        return this.feeTotal;
    }

    public void setFeeTotal(BigDecimal feeTotal) {
        this.feeTotal = feeTotal;
    }

    public String getReqName() {
        return this.reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getBudgYear() {
        return this.budgYear;
    }

    public void setBudgYear(String budgYear) {
        this.budgYear = budgYear;
    }

    public String getCancelFlag() {
        return this.cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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

    public Long getNewPayRefNo() {
        return newPayRefNo;
    }

    public void setNewPayRefNo(Long newPayRefNo) {
        this.newPayRefNo = newPayRefNo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.payId);
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
        final SistPayment other = (SistPayment) obj;
        if (!Objects.equals(this.payId, other.payId)) {
            return false;
        }
        return true;
    }

}
