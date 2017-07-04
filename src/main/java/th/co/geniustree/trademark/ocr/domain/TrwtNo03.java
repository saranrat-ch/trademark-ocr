package th.co.geniustree.trademark.ocr.domain;


import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO03")
public class TrwtNo03 extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8276721407758692327L;
    @Id
    @SequenceGenerator(name = "TRWT_NO03_SEQ", sequenceName = "TRWT_NO03_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO03_SEQ")
    @Column(name = "TRW_NO03_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trwNo03Id;

    @Column(name = "TRW_DATE", length = 7)
    private LocalDate trwDate;

    @NotNull(message = "คำขอเลขที่ต้องไม่เป็นค่าว่าง")
    @Column(name = "TRW_REQ_NO", precision = 13, scale = 0)
    private Long trwReqNo;

    @Column(name = "TRW_REGIS_NO", length = 50)
    private String trwRegisNo;

    @Column(name = "TRW_LOCATION", length = 1)
    private String trwLocation;

    @Column(name = "TRW_LOCATION_DETAIL")
    private String trwLocationDetail;

    @Column(name = "TRW_SECTION", length = 2)
    private String trwSection;

    @Column(name = "TRW_SECTION_ETC")
    private String trwSectionEtc;

    @Column(name = "TRW_APPEAL_DETAIL")
    private String trwAppealDetail;

    @Column(name = "TRW_APPEAL_DOC", length = 255)
    private String trwAppealDoc;

    @NotBlank(message="กรุณาแนบไฟล์")
    @Column(name = "TRW_COPY_DOC")
    private String trwCopyDoc;

    @Column(name = "TRW_COMPOS_DOC")
    private String trwComposDoc;

    @Column(name = "TRW_AUTH_DOC")
    private String trwAuthDoc;

    @Column(name = "TRW_SPARE_DOC")
    private String trwSpareDoc;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "PAY_FLAG", length = 1)
    private String payFlag;

    @Column(name = "TRW_REF_NO", precision = 15, scale = 0)
    private Long trwRefNo;
    @NotEmpty(message = "ระบุชื่อ")
    @Column(name = "CONT_NAME", length = 150)
    private String contName;


    @Column(name = "CONT_SURNAME", length = 150)
    private String contSurname;
    @NotEmpty(message = "ระบุที่อยู่")
    @Column(name = "CONT_ADDR", length = 150)
    private String contAddr;

    @Column(name = "CONT_MOO", length = 150)
    private String contMoo;

    @Column(name = "CONT_SOI", length = 150)
    private String contSoi;

    @Column(name = "CONT_ROAD", length = 150)
    private String contRoad;

    @NotNull(message = "ระบุชื่อ")
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CONT_LOC_ID")
    private CtltLocation ctltLocation;

    @NotEmpty(message = "ระบุรหัสไปรษณีย์")
    @Column(name = "CONT_POSTCODE", length = 10)
    private String contPostcode;

    @NotEmpty(message = "ระบุเบอร์โทรศัพท์")
    @Column(name = "CONT_PHONE", length = 150)
    private String contPhone;

    @NotEmpty(message = "ระบุหมายเลขแฟกซ์")
    @Column(name = "CONT_FAX", length = 150)
    private String contFax;

    @NotEmpty(message = "ระบุอีเมล")
    @Column(name = "CONT_EMAIL", length = 150)
    private String contEmail;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "FEE_CODE", length = 5)
    private String feeCode;

    @Column(name = "TRW_PDF_DOC", length = 255)
    private String trwPdfDoc;

    @Valid
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "trwtNo03",orphanRemoval = true)
    private List<TrwtNo03Agency> trwtNo03Agencies;

    @Valid
    @NotEmpty(message="กรุณาเพิ่มข้อมูลเจ้าของ")
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "trwtNo03",orphanRemoval = true)
    private List<TrwtNo03Owner> trwtNo03Owners;

    public TrwtNo03() {
    }

    public TrwtNo03(Long trwNo03Id) {
        this.trwNo03Id = trwNo03Id;
    }

    public Long getTrwNo03Id() {
        return this.trwNo03Id;
    }

    public void setTrwNo03Id(Long trwNo03Id) {
        this.trwNo03Id = trwNo03Id;
    }

    public LocalDate getTrwDate() {
        return this.trwDate;
    }

    public void setTrwDate(LocalDate trwDate) {
        this.trwDate = trwDate;
    }

    public Long getTrwReqNo() {
        return this.trwReqNo;
    }

    public void setTrwReqNo(Long trwReqNo) {
        this.trwReqNo = trwReqNo;
    }

    public String getTrwRegisNo() {
        return this.trwRegisNo;
    }

    public void setTrwRegisNo(String trwRegisNo) {
        this.trwRegisNo = trwRegisNo;
    }

    public String getTrwLocation() {
        return this.trwLocation;
    }

    public void setTrwLocation(String trwLocation) {
        this.trwLocation = trwLocation;
    }

    public String getTrwLocationDetail() {
        return this.trwLocationDetail;
    }

    public void setTrwLocationDetail(String trwLocationDetail) {
        this.trwLocationDetail = trwLocationDetail;
    }

    public String getTrwSection() {
        return this.trwSection;
    }

    public void setTrwSection(String trwSection) {
        this.trwSection = trwSection;
    }

    public String getTrwSectionEtc() {
        return this.trwSectionEtc;
    }

    public void setTrwSectionEtc(String trwSectionEtc) {
        this.trwSectionEtc = trwSectionEtc;
    }

    public String getTrwAppealDetail() {
        return this.trwAppealDetail;
    }

    public void setTrwAppealDetail(String trwAppealDetail) {
        this.trwAppealDetail = trwAppealDetail;
    }

    public String getTrwAppealDoc() {
        return this.trwAppealDoc;
    }

    public void setTrwAppealDoc(String trwAppealDoc) {
        this.trwAppealDoc = trwAppealDoc;
    }

    public String getTrwCopyDoc() {
        return this.trwCopyDoc;
    }

    public void setTrwCopyDoc(String trwCopyDoc) {
        this.trwCopyDoc = trwCopyDoc;
    }

    public String getTrwComposDoc() {
        return this.trwComposDoc;
    }

    public void setTrwComposDoc(String trwComposDoc) {
        this.trwComposDoc = trwComposDoc;
    }

    public String getTrwAuthDoc() {
        return this.trwAuthDoc;
    }

    public void setTrwAuthDoc(String trwAuthDoc) {
        this.trwAuthDoc = trwAuthDoc;
    }

    public String getTrwSpareDoc() {
        return this.trwSpareDoc;
    }

    public void setTrwSpareDoc(String trwSpareDoc) {
        this.trwSpareDoc = trwSpareDoc;
    }

    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getPayFlag() {
        return this.payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public Long getTrwRefNo() {
        return this.trwRefNo;
    }

    public void setTrwRefNo(Long trwRefNo) {
        this.trwRefNo = trwRefNo;
    }


    public String getContName() {
        return this.contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    public String getContSurname() {
        return this.contSurname;
    }

    public void setContSurname(String contSurname) {
        this.contSurname = contSurname;
    }

    public String getContAddr() {
        return this.contAddr;
    }

    public void setContAddr(String contAddr) {
        this.contAddr = contAddr;
    }

    public String getContMoo() {
        return this.contMoo;
    }

    public void setContMoo(String contMoo) {
        this.contMoo = contMoo;
    }

    public String getContSoi() {
        return this.contSoi;
    }

    public void setContSoi(String contSoi) {
        this.contSoi = contSoi;
    }

    public String getContRoad() {
        return this.contRoad;
    }

    public void setContRoad(String contRoad) {
        this.contRoad = contRoad;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
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

    public RpstTrademark getRpstTrademark() {
        return this.rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getTrwPdfDoc() {
        return trwPdfDoc;
    }

    public void setTrwPdfDoc(String trwPdfDoc) {
        this.trwPdfDoc = trwPdfDoc;
    }

    public List<TrwtNo03Agency> getTrwtNo03Agencies() {
        return trwtNo03Agencies;
    }

    public void setTrwtNo03Agencies(List<TrwtNo03Agency> trwtNo03Agencies) {
        this.trwtNo03Agencies = trwtNo03Agencies;
    }

    public List<TrwtNo03Owner> getTrwtNo03Owners() {
        return trwtNo03Owners;
    }

    public void setTrwtNo03Owners(List<TrwtNo03Owner> trwtNo03Owners) {
        this.trwtNo03Owners = trwtNo03Owners;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.trwNo03Id);
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
        final TrwtNo03 other = (TrwtNo03) obj;
        if (!Objects.equals(this.trwNo03Id, other.trwNo03Id)) {
            return false;
        }
        return true;
    }
}
