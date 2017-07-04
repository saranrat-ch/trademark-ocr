package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;



@Entity
@Table(name = "TRWT_NO02")
public class TrwtNo02 extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1336721390914576028L;

    @Id
    @SequenceGenerator(name = "TRWT_NO02_SEQ", sequenceName = "TRWT_NO02_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO02_SEQ")
    @Column(name = "TRW_NO02_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trwNo02Id;

    @Column(name = "TRW_DATE", length = 7)
    private LocalDate trwDate;

    @NotNull(message = "คำขอเลขที่ต้องไม่เป็นค่าว่าง")
    @Column(name = "TRW_REQ_NO", precision = 13)
    private Long trwReqNo;

    @Column(name = "TRW_REGIS_NO", length = 50)
    private String trwRegisNo;

    @Column(name = "TRW_LOCATION", length = 1)
    private String trwLocation;

    @Column(name = "TRW_LOCATION_DETAIL")
    private String trwLocationDetail;

    @Column(name = "TRW_PROTEST_DETAIL")
    private String trwProtestDetail;

    @Column(name = "TRW_PROTEST_DOC")
    private String trwProtestDoc;

    @Column(name = "TRW_PROTEST_ISSUE", length = 7)
    private LocalDate trwProtestIssue;

    @Column(name = "TRW_PROTEST_BOOK")
    private String trwProtestBook;

    @Column(name = "TRW_PROTEST_PAGE")
    private String trwProtestPage;

    @Column(name = "TRW_COPY_DOC")
    private String trwCopyDoc;

    @Column(name = "TRW_OWNER_PIC")
    private String trwOwnerPic;

    @Column(name = "TRW_AUTH_DOC")
    private String trwAuthDoc;

    @Column(name = "TRW_AGEN_PIC")
    private String trwAgenPic;

    @Column(name = "TRW_PHASE_PIC")
    private String trwPhasePic;

    @Column(name = "TRW_CANCEL_DOC")
    private String trwCancelDoc;

    @Column(name = "TRW_PREPARE_DOC")
    private String trwPrepareDoc;

    @Column(name = "TRW_EXPLAIN_DOC")
    private String trwExplainDoc;

    @Column(name = "TRW_SPARE_DOC")
    private String trwSpareDoc;

    @Column(name = "TRW_NOTARY_DOC")
    private String trwNotaryDoc;

    @Column(name = "TRW_CORP_DOC")
    private String trwCorpDoc;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "PAY_FLAG", length = 1)
    private String payFlag;

    @Column(name = "TRW_REF_NO", precision = 15)
    private Long trwRefNo;

    @Column(name = "CONT_NAME", length = 150)
    private String contName;

    @Column(name = "CONT_SURNAME", length = 150)
    private String contSurname;

    @Column(name = "CONT_ADDR", length = 150)
    private String contAddr;

    @Column(name = "CONT_MOO", length = 150)
    private String contMoo;

    @Column(name = "CONT_SOI", length = 150)
    private String contSoi;

    @Column(name = "CONT_ROAD", length = 150)
    private String contRoad;

    @ManyToOne
    @JoinColumn(name = "CONT_LOC_ID")
    private CtltLocation ctltLocation;

    @Column(name = "CONT_POSTCODE", length = 10)
    private String contPostcode;

    @Column(name = "CONT_PHONE", length = 150)
    private String contPhone;

    @Column(name = "CONT_FAX", length = 150)
    private String contFax;

    @Column(name = "CONT_EMAIL", length = 150)
    private String contEmail;

    @ManyToOne
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "TRW_TYPE", length = 1)
    private String trwType;

    @Column(name = "FEE_CODE", length = 5)
    private String feeCode;

    @Column(name = "RECV_DATE", length = 7)
    private LocalDate recvDate;

    @Column(name = "TRW_PDF_DOC")
    private String trwPdfDoc;

    @Valid
    @OneToMany(mappedBy = "trwtNo02", cascade = {CascadeType.ALL, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<TrwtNo02Owner> trwtNo02Owners;

    @Valid
    @OneToMany(mappedBy = "trwtNo02", cascade = {CascadeType.ALL, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<TrwtNo02Agency> trwtNo02Agencies;

    @Valid
    @OneToMany(mappedBy = "trwtNo02", cascade = {CascadeType.ALL, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<TrwtNo02Rowner> trwtNo02Rowners;

    @Valid
    @OneToMany(mappedBy = "trwtNo02", cascade = {CascadeType.ALL, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<TrwtNo02Ragency> trwtNo02Ragencies;

    public Long getTrwNo02Id() {
        return trwNo02Id;
    }

    public void setTrwNo02Id(Long trwNo02Id) {
        this.trwNo02Id = trwNo02Id;
    }

    public LocalDate getTrwDate() {
        return trwDate;
    }

    public void setTrwDate(LocalDate trwDate) {
        this.trwDate = trwDate;
    }

    public Long getTrwReqNo() {
        return trwReqNo;
    }

    public void setTrwReqNo(Long trwReqNo) {
        this.trwReqNo = trwReqNo;
    }

    public String getTrwRegisNo() {
        return trwRegisNo;
    }

    public void setTrwRegisNo(String trwRegisNo) {
        this.trwRegisNo = trwRegisNo;
    }

    public String getTrwLocation() {
        return trwLocation;
    }

    public void setTrwLocation(String trwLocation) {
        this.trwLocation = trwLocation;
    }

    public String getTrwLocationDetail() {
        return trwLocationDetail;
    }

    public void setTrwLocationDetail(String trwLocationDetail) {
        this.trwLocationDetail = trwLocationDetail;
    }

    public String getTrwProtestDetail() {
        return trwProtestDetail;
    }

    public void setTrwProtestDetail(String trwProtestDetail) {
        this.trwProtestDetail = trwProtestDetail;
    }

    public String getTrwProtestDoc() {
        return trwProtestDoc;
    }

    public void setTrwProtestDoc(String trwProtestDoc) {
        this.trwProtestDoc = trwProtestDoc;
    }

    public LocalDate getTrwProtestIssue() {
        return trwProtestIssue;
    }

    public void setTrwProtestIssue(LocalDate trwProtestIssue) {
        this.trwProtestIssue = trwProtestIssue;
    }

    public String getTrwProtestBook() {
        return trwProtestBook;
    }

    public void setTrwProtestBook(String trwProtestBook) {
        this.trwProtestBook = trwProtestBook;
    }

    public String getTrwProtestPage() {
        return trwProtestPage;
    }

    public void setTrwProtestPage(String trwProtestPage) {
        this.trwProtestPage = trwProtestPage;
    }

    public String getTrwCopyDoc() {
        return trwCopyDoc;
    }

    public void setTrwCopyDoc(String trwCopyDoc) {
        this.trwCopyDoc = trwCopyDoc;
    }

    public String getTrwOwnerPic() {
        return trwOwnerPic;
    }

    public void setTrwOwnerPic(String trwOwnerPic) {
        this.trwOwnerPic = trwOwnerPic;
    }

    public String getTrwAuthDoc() {
        return trwAuthDoc;
    }

    public void setTrwAuthDoc(String trwAuthDoc) {
        this.trwAuthDoc = trwAuthDoc;
    }

    public String getTrwAgenPic() {
        return trwAgenPic;
    }

    public void setTrwAgenPic(String trwAgenPic) {
        this.trwAgenPic = trwAgenPic;
    }

    public String getTrwPhasePic() {
        return trwPhasePic;
    }

    public void setTrwPhasePic(String trwPhasePic) {
        this.trwPhasePic = trwPhasePic;
    }

    public String getTrwCancelDoc() {
        return trwCancelDoc;
    }

    public void setTrwCancelDoc(String trwCancelDoc) {
        this.trwCancelDoc = trwCancelDoc;
    }

    public String getTrwPrepareDoc() {
        return trwPrepareDoc;
    }

    public void setTrwPrepareDoc(String trwPrepareDoc) {
        this.trwPrepareDoc = trwPrepareDoc;
    }

    public String getTrwExplainDoc() {
        return trwExplainDoc;
    }

    public void setTrwExplainDoc(String trwExplainDoc) {
        this.trwExplainDoc = trwExplainDoc;
    }

    public String getTrwSpareDoc() {
        return trwSpareDoc;
    }

    public void setTrwSpareDoc(String trwSpareDoc) {
        this.trwSpareDoc = trwSpareDoc;
    }

    public String getTrwNotaryDoc() {
        return trwNotaryDoc;
    }

    public void setTrwNotaryDoc(String trwNotaryDoc) {
        this.trwNotaryDoc = trwNotaryDoc;
    }

    public String getTrwCorpDoc() {
        return trwCorpDoc;
    }

    public void setTrwCorpDoc(String trwCorpDoc) {
        this.trwCorpDoc = trwCorpDoc;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public Long getTrwRefNo() {
        return trwRefNo;
    }

    public void setTrwRefNo(Long trwRefNo) {
        this.trwRefNo = trwRefNo;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContSurname() {
        return contSurname;
    }

    public void setContSurname(String contSurname) {
        this.contSurname = contSurname;
    }

    public String getContAddr() {
        return contAddr;
    }

    public void setContAddr(String contAddr) {
        this.contAddr = contAddr;
    }

    public String getContMoo() {
        return contMoo;
    }

    public void setContMoo(String contMoo) {
        this.contMoo = contMoo;
    }

    public String getContSoi() {
        return contSoi;
    }

    public void setContSoi(String contSoi) {
        this.contSoi = contSoi;
    }

    public String getContRoad() {
        return contRoad;
    }

    public void setContRoad(String contRoad) {
        this.contRoad = contRoad;
    }

    public CtltLocation getCtltLocation() {
        return ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public String getContPostcode() {
        return contPostcode;
    }

    public void setContPostcode(String contPostcode) {
        this.contPostcode = contPostcode;
    }

    public String getContPhone() {
        return contPhone;
    }

    public void setContPhone(String contPhone) {
        this.contPhone = contPhone;
    }

    public String getContFax() {
        return contFax;
    }

    public void setContFax(String contFax) {
        this.contFax = contFax;
    }

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public String getTrwType() {
        return trwType;
    }

    public void setTrwType(String trwType) {
        this.trwType = trwType;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public LocalDate getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(LocalDate recvDate) {
        this.recvDate = recvDate;
    }

    public List<TrwtNo02Owner> getTrwtNo02Owners() {
        return trwtNo02Owners;
    }

    public void setTrwtNo02Owners(List<TrwtNo02Owner> trwtNo02Owners) {
        this.trwtNo02Owners = trwtNo02Owners;
    }

    public List<TrwtNo02Agency> getTrwtNo02Agencies() {
        return trwtNo02Agencies;
    }

    public void setTrwtNo02Agencies(List<TrwtNo02Agency> trwtNo02Agencies) {
        this.trwtNo02Agencies = trwtNo02Agencies;
    }

    public String getTrwPdfDoc() {
        return trwPdfDoc;
    }

    public void setTrwPdfDoc(String trwPdfDoc) {
        this.trwPdfDoc = trwPdfDoc;
    }

    public List<TrwtNo02Rowner> getTrwtNo02Rowners() {
        return trwtNo02Rowners;
    }

    public void setTrwtNo02Rowners(List<TrwtNo02Rowner> trwtNo02Rowners) {
        this.trwtNo02Rowners = trwtNo02Rowners;
    }

    public List<TrwtNo02Ragency> getTrwtNo02Ragencies() {
        return trwtNo02Ragencies;
    }

    public void setTrwtNo02Ragencies(List<TrwtNo02Ragency> trwtNo02Ragencies) {
        this.trwtNo02Ragencies = trwtNo02Ragencies;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.trwNo02Id);
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
        final TrwtNo02 other = (TrwtNo02) obj;
        if (!Objects.equals(this.trwNo02Id, other.trwNo02Id)) {
            return false;
        }
        return true;
    }

}
