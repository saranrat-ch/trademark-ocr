package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_NO02R")
public class SistNo02r extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = -2704010183374642837L;

    @Id
    @SequenceGenerator(name = "SIST_NO02R_SEQ", sequenceName = "SIST_NO02R_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO02R_SEQ")
    @Column(name = "TR_NO02R_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long trNo02rId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COM_ORG_ID")
    private CtltOrganize ctltOrganize;

    @Temporal(TemporalType.DATE)
    @Column(name = "TR_NO02R_DATE", length = 7)
    private Date trNo02rDate;

    @Column(name = "TR_NO02R_SEQ", precision = 22, scale = 0)
    private Long trNo02rSeq;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "TR_DATE", length = 7)
    private Date trDate;

    @Column(name = "PAY_FLAG", length = 1)
    private String payFlag;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "REMARK", length = 1000)
    private String remark;

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
    @JoinColumn(name = "TRW_NO02_ID")
    private TrwtNo02 trwtNo02;

    public SistNo02r() {
    }

    public SistNo02r(Long trNo02rId) {
        this.trNo02rId = trNo02rId;
    }

    @Transient
    public Long getPk() {
        return trNo02rId;
    }

    public Long getTrNo02rId() {
        return this.trNo02rId;
    }

    public void setTrNo02rId(Long trNo02rId) {
        this.trNo02rId = trNo02rId;
    }

    public RpstTrademark getRpstTrademark() {
        return this.rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public CtltOrganize getCtltOrganize() {
        return this.ctltOrganize;
    }

    public void setCtltOrganize(CtltOrganize ctltOrganize) {
        this.ctltOrganize = ctltOrganize;
    }

    public Date getTrNo02rDate() {
        return this.trNo02rDate;
    }

    public void setTrNo02rDate(Date trNo02rDate) {
        this.trNo02rDate = trNo02rDate;
    }

    public Long getTrNo02rSeq() {
        return this.trNo02rSeq;
    }

    public void setTrNo02rSeq(Long trNo02rSeq) {
        this.trNo02rSeq = trNo02rSeq;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Date getTrDate() {
        return this.trDate;
    }

    public void setTrDate(Date trDate) {
        this.trDate = trDate;
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

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public TrwtNo02 getTrwtNo02() {
        return trwtNo02;
    }

    public void setTrwtNo02(TrwtNo02 trwtNo02) {
        this.trwtNo02 = trwtNo02;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.trNo02rId);
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
        final SistNo02r other = (SistNo02r) obj;
        if (!Objects.equals(this.trNo02rId, other.trNo02rId)) {
            return false;
        }
        return true;
    }

}
