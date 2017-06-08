package th.co.geniustree.trademark.ocr.domain;



import th.co.geniustree.trademark.ocr.util.DipFormatter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TRWT_CONTROL_REFNO")
public class TrwtControlRefno extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TRWT_CONTROL_REFNO_SEQ", sequenceName = "TRWT_CONTROL_REFNO_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_CONTROL_REFNO_SEQ")
    @Column(name = "REFNO_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long refnoId;

    @Temporal(TemporalType.DATE)
    @Column(name = "REFNO_DATE", length = 7)
    private Date refnoDate;

    @Column(name = "PAYMENT_TYPE", length = 2)
    private String paymentType;

    @Column(name = "TABLE_NAME", length = 50)
    private String tableName;

    @Column(name = "TRW_REF_NO", precision = 15, scale = 0)
    private Long trwRefNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "PAYMENT_DATE", length = 7)
    private Date paymentDate;

    @Column(name = "PAYMENT_NAME")
    private String paymentName;

    @Column(name = "NUMBER_DIP")
    private String numberDip;

    @Column(name = "RECVPAY_CODE", length = 10)
    private String recvpayCode;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "PROGRAM_ID", length = 20)
    private String programId;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECV_DATE", length = 7)
    private Date recvDate;

    @Column(name = "PAYMENT_NO", precision = 13)
    private Long paymentNo;

    @Transient
    private Date trDate;

    @Transient
    private String trDateString;

    @Transient
    private String feeAmountThai;

    @Transient
    private Long trwtMasterId;

    @Column(name = "FEE_CODE", length = 5)
    private String feeCode;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRW_CREATE_DATE")
    private Date trwCreateDate;

    public Long getRefnoId() {
        return refnoId;
    }

    public void setRefnoId(Long refnoId) {
        this.refnoId = refnoId;
    }

    public Date getRefnoDate() {
        return refnoDate;
    }

    public void setRefnoDate(Date refnoDate) {
        this.refnoDate = refnoDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getTrwRefNo() {
        return trwRefNo;
    }

    public void setTrwRefNo(Long trwRefNo) {
        this.trwRefNo = trwRefNo;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getNumberDip() {
        return numberDip;
    }

    public void setNumberDip(String numberDip) {
        this.numberDip = numberDip;
    }

    public String getRecvpayCode() {
        return recvpayCode;
    }

    public void setRecvpayCode(String recvpayCode) {
        this.recvpayCode = recvpayCode;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public Date getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public Long getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(Long paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Date getTrDate() {
        return trDate;
    }

    public void setTrDate(Date trDate) {
        this.trDate = trDate;
    }

    public String getTrDateString() {
        if (trDate != null) {
            return DipFormatter.convertDateToStringDDMMYYYYThaiFormat(trDate);
        }
        return trDateString;
    }

    public void setTrDateString(String trDateString) {
        this.trDateString = trDateString;
    }

    public String getFeeAmountThai() {
        return feeAmountThai;
    }

    public void setFeeAmountThai(String feeAmountThai) {
        this.feeAmountThai = feeAmountThai;
    }

    public Long getTrwtMasterId() {
        return trwtMasterId;
    }

    public void setTrwtMasterId(Long trwtMasterId) {
        this.trwtMasterId = trwtMasterId;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public Date getTrwCreateDate() {
        return trwCreateDate;
    }

    public void setTrwCreateDate(Date trwCreateDate) {
        this.trwCreateDate = trwCreateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtControlRefno that = (TrwtControlRefno) o;
        return Objects.equals(refnoId, that.refnoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refnoId);
    }
}
