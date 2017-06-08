package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "SIST_RECV_TM")
public class SistRecvTm extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = -9147396727225788614L;

    @Id
    @SequenceGenerator(name = "SIST_RECV_TM_SEQ", sequenceName = "SIST_RECV_TM_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_RECV_TM_SEQ")
    @Column(name = "RECV_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long recvId;

    @Temporal(TemporalType.DATE)
    @Column(name = "REQ_DATE", length = 7)
    private Date reqDate;

    @Column(name = "REQ_NAME", length = 500)
    private String reqName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AGEN_ID")
    private CtltAgency ctltAgency;

    @Column(name = "TR_REF_NO", precision = 15, scale = 0)
    private Long trRefNo;

    @Column(name = "BOOK_SEQ", precision = 15, scale = 0)
    private Long bookSeq;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FEE_ID")
    private CtltFee ctltFee;

    @Column(name = "FEE_CODE", length = 3)
    private String feeCode;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @Column(name = "GOODS_QTY", precision = 5, scale = 0)
    private Long goodsQty;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Column(name = "RECEIPT_BOOK", length = 10)
    private String receiptBook;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECEIPT_DATE", length = 7)
    private Date receiptDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "COM_ORG_ID")
    private CtltOrganize ctltOrganize;

    @Column(name = "PICTURE_CM", precision = 2, scale = 0)
    private Long pictureCm;

    @Column(name = "PAY_REF_NO", precision = 15, scale = 0)
    private Long payRefNo;

    @Column(name = "RECV_TYPE", length = 1)
    private String recvType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SCAN_ID")
    private CtstScan ctstScan;

    @Column(name = "FORM_TYPE", length = 2)
    private String formType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "RECEIPT_SCAN_ID")
    private CtstScan receiptScanId;

    @Column(name = "REF_SEQ", precision = 15, scale = 0)
    private Long refSeq;

    @Column(name = "EVIDENCE_FLAG", length = 1)
    private String evidenceFlag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "FROM_TYPE", length = 1)
    private String fromType;

    @Column(name = "TR_TYPE", length = 1)
    private String trType;

    @Temporal(TemporalType.DATE)
    @Column(name = "TR_DATE", length = 7)
    private Date trDate;

    @Column(name = "OTOP_FLAG", length = 1)
    private String otopFlag;

    @Column(name = "CANCEL_FLAG", length = 1)
    private String cancelFlag;

    @Column(name = "CANCEL_DESC", length = 150)
    private String cancelDesc;

    @Column(name = "NEW_TR_NO", precision = 15, scale = 0)
    private Long newTrNo;

    @Column(name = "SEQ_NO", precision = 15, scale = 0)
    private Long seqNo;

    @Column(name = "PROGRAM_ID", length = 10)
    private String programId;

    @Column(name = "SIST_PK", precision = 15, scale = 0)
    private Long sistPk;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IMP_ID")
    private SistBankImport sistBankImport;

    @Column(name = "BOOK_NO", precision = 15, scale = 0)
    private Long bookNo;

    @Column(name = "FORM10_FLAG", length = 1)
    private String form10Flag;

    @Column(name = "FORM12_FLAG", length = 1)
    private String form12Flag;

    @Column(name = "FORM13_FLAG", length = 1)
    private String form13Flag;

    @Column(name = "FORM18_FLAG", length = 1)
    private String form18Flag;

    @Column(name = "FORM19_FLAG", length = 1)
    private String form19Flag;

    @Column(name = "FORM20_FLAG", length = 1)
    private String form20Flag;

    @Column(name = "EVIDENCE_PLACE", length = 150)
    private String evidencePlace;

    @Column(name = "CREATE_PRG_ID", length = 10)
    private String createPrgId;

    @Column(name = "DOC_FLAG", length = 1)
    private String docFlag;

    @Column(name = "PANIT_FLAG", length = 1)
    private String panitFlag;

    @Column(name = "OLD_PAY_REF_NO", precision = 15, scale = 0)
    private Long oldPayRefNo;

    @Transient
    private Long refTrNo; // อ้างอิงเลขที่คำขอต้นทางกรณีแตกต่ออายุ

    /*Add since 2559 */
    @Column(name = "NICE_CLASS_QTY", precision = 5, scale = 0)
    private Long niceClassQty;

    @Column(name = "FINE_COST", precision = 10)
    private BigDecimal fineCost;

    @Column(name = "IS_FEE_WAIVER")
    private Boolean isFeeWaiver;

    /*Add since 2559 */

    @Column(name = "BIRTH_ID", length = 10)
    private Long birthId;

    @Column(name = "IRN_NO", length = 9)
    private String irnNo;

    public SistRecvTm() {
    }

    public SistRecvTm(Long recvId) {
        this.recvId = recvId;
    }


    @Transient
    public Long getPk() {
        return recvId;
    }

    public Long getRecvId() {
        return this.recvId;
    }

    public void setRecvId(Long recvId) {
        this.recvId = recvId;
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


    public CtltAgency getCtltAgency() {
        return ctltAgency;
    }

    public void setCtltAgency(CtltAgency ctltAgency) {
        this.ctltAgency = ctltAgency;
    }

    public Long getTrRefNo() {
        return trRefNo;
    }

    public void setTrRefNo(Long trRefNo) {
        this.trRefNo = trRefNo;
    }

    public Long getBookSeq() {
        return bookSeq;
    }

    public void setBookSeq(Long bookSeq) {
        this.bookSeq = bookSeq;
    }

    public CtltFee getCtltFee() {
        return ctltFee;
    }

    public void setCtltFee(CtltFee ctltFee) {
        this.ctltFee = ctltFee;
    }

    public String getFeeCode() {
        return this.feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Long getGoodsQty() {
        return this.goodsQty;
    }

    public void setGoodsQty(Long goodsQty) {
        this.goodsQty = goodsQty;
    }

    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getReceiptNo() {
        return this.receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getReceiptBook() {
        return this.receiptBook;
    }

    public void setReceiptBook(String receiptBook) {
        this.receiptBook = receiptBook;
    }

    public Date getReceiptDate() {
        return this.receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public CtltOrganize getCtltOrganize() {
        return this.ctltOrganize;
    }

    public void setCtltOrganize(CtltOrganize ctltOrganize) {
        this.ctltOrganize = ctltOrganize;
    }

    public Long getPictureCm() {
        return this.pictureCm;
    }

    public void setPictureCm(Long pictureCm) {
        this.pictureCm = pictureCm;
    }

    public Long getPayRefNo() {
        return this.payRefNo;
    }

    public void setPayRefNo(Long payRefNo) {
        this.payRefNo = payRefNo;
    }

    public String getRecvType() {
        return recvType;
    }

    public void setRecvType(String recvType) {
        this.recvType = recvType;
    }

    public CtstScan getCtstScan() {
        return ctstScan;
    }

    public void setCtstScan(CtstScan ctstScan) {
        this.ctstScan = ctstScan;
    }

    public String getFormType() {
        return this.formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public CtstScan getReceiptScanId() {
        return receiptScanId;
    }

    public void setReceiptScanId(CtstScan receiptScanId) {
        this.receiptScanId = receiptScanId;
    }

    public Long getRefSeq() {
        return this.refSeq;
    }

    public void setRefSeq(Long refSeq) {
        this.refSeq = refSeq;
    }

    public String getEvidenceFlag() {
        return evidenceFlag;
    }

    public void setEvidenceFlag(String evidenceFlag) {
        this.evidenceFlag = evidenceFlag;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public Date getTrDate() {
        return trDate;
    }

    public void setTrDate(Date trDate) {
        this.trDate = trDate;
    }

    public String getOtopFlag() {
        return otopFlag;
    }

    public void setOtopFlag(String otopFlag) {
        this.otopFlag = otopFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public String getCancelDesc() {
        return cancelDesc;
    }

    public void setCancelDesc(String cancelDesc) {
        this.cancelDesc = cancelDesc;
    }

    public Long getNewTrNo() {
        return newTrNo;
    }

    public void setNewTrNo(Long newTrNo) {
        this.newTrNo = newTrNo;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public Long getSistPk() {
        return sistPk;
    }

    public void setSistPk(Long sistPk) {
        this.sistPk = sistPk;
    }

    public SistBankImport getSistBankImport() {
        return sistBankImport;
    }

    public void setSistBankImport(SistBankImport sistBankImport) {
        this.sistBankImport = sistBankImport;
    }


    public Long getRefTrNo() {
        return refTrNo;
    }

    public void setRefTrNo(Long refTrNo) {
        this.refTrNo = refTrNo;
    }

    public Long getBookNo() {
        return bookNo;
    }

    public void setBookNo(Long bookNo) {
        this.bookNo = bookNo;
    }

    public String getForm10Flag() {
        return form10Flag;
    }

    public void setForm10Flag(String form10Flag) {
        this.form10Flag = form10Flag;
    }

    public String getForm12Flag() {
        return form12Flag;
    }

    public void setForm12Flag(String form12Flag) {
        this.form12Flag = form12Flag;
    }

    public String getForm13Flag() {
        return form13Flag;
    }

    public void setForm13Flag(String form13Flag) {
        this.form13Flag = form13Flag;
    }

    public String getForm18Flag() {
        return form18Flag;
    }

    public void setForm18Flag(String form18Flag) {
        this.form18Flag = form18Flag;
    }

    public String getForm19Flag() {
        return form19Flag;
    }

    public void setForm19Flag(String form19Flag) {
        this.form19Flag = form19Flag;
    }

    public String getForm20Flag() {
        return form20Flag;
    }

    public void setForm20Flag(String form20Flag) {
        this.form20Flag = form20Flag;
    }

    public String getEvidencePlace() {
        return evidencePlace;
    }

    public void setEvidencePlace(String evidencePlace) {
        this.evidencePlace = evidencePlace;
    }

    public String getCreatePrgId() {
        return createPrgId;
    }

    public void setCreatePrgId(String createPrgId) {
        this.createPrgId = createPrgId;
    }

    public String getDocFlag() {
        return docFlag;
    }

    public void setDocFlag(String docFlag) {
        this.docFlag = docFlag;
    }

    public String getPanitFlag() {
        return panitFlag;
    }

    public void setPanitFlag(String panitFlag) {
        this.panitFlag = panitFlag;
    }

    public Long getOldPayRefNo() {
        return oldPayRefNo;
    }

    public void setOldPayRefNo(Long oldPayRefNo) {
        this.oldPayRefNo = oldPayRefNo;
    }

    /* Add since 2559 ------------------------------------------------------- */

    public Long getNiceClassQty() {
        return niceClassQty;
    }

    public void setNiceClassQty(Long niceClassQty) {
        this.niceClassQty = niceClassQty;
    }

    public BigDecimal getFineCost() {
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

    /* Add since 2559 ------------------------------------------------------- */

    public Long getBirthId() {
        return birthId;
    }

    public void setBirthId(Long birthId) {
        this.birthId = birthId;
    }

    public String getIrnNo() {
        return irnNo;
    }

    public void setIrnNo(String irnNo) {
        this.irnNo = irnNo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.recvId);
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
        final SistRecvTm other = (SistRecvTm) obj;
        if (!Objects.equals(this.recvId, other.recvId)) {
            return false;
        }
        return true;
    }
}
