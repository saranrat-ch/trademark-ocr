package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO01")
public class TrwtNo01 extends BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "TRWT_NO01_SEQ", sequenceName = "TRWT_NO01_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "TRWT_NO01_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "TRW_NO01_ID", precision = 22)
    private Long trwNo01Id;

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    @Column(name = "TRW_DATE")
    private LocalDate trwDate;

    @Column(name = "TRW_TYPE", length = 1)
    private String trwType;

    @Column(name = "TRW_NAME", length = 50)
    private String trwName;

    @Column(name = "TRW_SURNAME", length = 50)
    private String trwSurname;

    @Column(name = "TRW_STAT", length = 1)
    private String trwStat;

    @Column(name = "TRW_LOCATION", length = 1)
    private String trwLocation;

    @Column(name = "TRW_LOCATION_DETAIL")
    private String trwLocationDetail;

    @Column(name = "TRW_SECTION28", length = 1)
    private String trwSection28;

    @Column(name = "TRW_SECTION28_BIS", length = 1)
    private String trwSection28Bis;

    @Column(name = "TRW_LICENSE", length = 1)
    private String trwLicense;

    @Column(name = "TRW_EXPLAIN")
    private String trwExplain;

    @Column(name = "TRW_PIC_DETAIL")
    private String trwPicDetail;

    @Column(name = "TRW_PIC_DOC")
    private String trwPicDoc;

    @Column(name = "TRW_PIC_WORD")
    private String trwPicWord;

    @Column(name = "TRW_LIST", precision = 22)
    private Long trwList;

    @Column(name = "FEE_AMOUNT", precision = 10)
    private BigDecimal feeAmount;

    @Column(name = "PAY_FLAG", length = 1)
    private String payFlag;

    @Column(name = "TRW_REF_NO", precision = 15, scale = 0)
    private Long trwRefNo;

    @Column(name = "TRW_COPY_DOC")
    private String trwCopyDoc;

    @Column(name = "TRW_AUTH_DOC")
    private String trwAuthDoc;

    @Column(name = "TRW_GROUP_DOC")
    private String trwGroupDoc;

    @Column(name = "TRW_REJECT_DOC")
    private String trwRejectDoc;

    @Column(name = "TRW_RELATION_DOC")
    private String trwRelationDoc;

    @Column(name = "TRW_RULE_DOC")
    private String trwRuleDoc;

    @Column(name = "TRW_SPEC_DOC")
    private String trwSpecDoc;

    @Column(name = "TRW_FOREIN_DOC")
    private String trwForeinDoc;

    @Column(name = "TRW_SPARE_DOC")
    private String trwSpareDoc;

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

    @Column(name = "CONT_PHONE", length = 50)
    private String contPhone;

    @Column(name = "CONT_EMAIL", length = 150)
    private String contEmail;

    @Column(name = "CONT_FAX", length = 50)
    private String contFax;

    @Column(name = "TR_NO", precision = 13)
    private Long trNo;

    @Column(name = "TR_DATE")
    private LocalDate trDate;

    @Column(name = "FEE_CODE", length = 5)
    private String feeCode;

    @Column(name = "TRW_PIC_BIG")
    private String trwPicBig;

    @Column(name = "TRW_PIC_31")
    private String trwPic31;

    @Column(name = "TRW_PIC_32")
    private String trwPic32;

    @Column(name = "TRW_PIC_33")
    private String trwPic33;

    @Column(name = "TRW_PIC_34")
    private String trwPic34;

    @Column(name = "TRW_PIC_35")
    private String trwPic35;

    @Column(name = "TRW_PIC_36")
    private String trwPic36;

    @Column(name = "TRW_PDF_DOC")
    private String trwPdfDoc;

    @Column(name = "TRW_READ", length = 150)
    private String trwRead;

    @Column(name = "TRW_LANG", length = 2)
    private String trwLang;

    @Column(name = "TRW_LANG_DESC", length = 150)
    private String trwLangDesc;

    @Column(name = "TRW_SOUND_DOC")
    private String trwSoundDoc;

    @Column(name = "TRW_TRANSFER_DOC")
    private String trwTransferDoc;

    @Column(name = "TRW_ALLOW_DOC")
    private String trwAllowDoc;

    @Column(name = "TRW_SPARE1_DOC")
    private String trwSpare1Doc;

    @Column(name = "TRW_SPARE2_DOC")
    private String trwSpare2Doc;

    @Column(name = "TRW_SPARE3_DOC")
    private String trwSpare3Doc;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "TRW_NO01_FILING")
    private TrwtNo01Filing trwtNo01Filing;

    @Column(name = "FINE_IMAGE")
    private BigDecimal fineImage;


    @PrePersist
    protected void perSist() {
        this.feeCode = "010";
    }

    public Long getTrwNo01Id() {
        return trwNo01Id;
    }

    public void setTrwNo01Id(Long trwNo01Id) {
        this.trwNo01Id = trwNo01Id;
    }

    public CtltTitle getCtltTitle() {
        return ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public LocalDate getTrwDate() {
        return trwDate;
    }

    public void setTrwDate(LocalDate trwDate) {
        this.trwDate = trwDate;
    }

    public String getTrwType() {
        return trwType;
    }

    public void setTrwType(String trwType) {
        this.trwType = trwType;
    }

    public String getTrwName() {
        return trwName;
    }

    public void setTrwName(String trwName) {
        this.trwName = trwName;
    }

    public String getTrwSurname() {
        return trwSurname;
    }

    public void setTrwSurname(String trwSurname) {
        this.trwSurname = trwSurname;
    }

    public String getTrwStat() {
        return trwStat;
    }

    public void setTrwStat(String trwStat) {
        this.trwStat = trwStat;
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

    public String getTrwSection28() {
        return trwSection28;
    }

    public void setTrwSection28(String trwSection28) {
        this.trwSection28 = trwSection28;
    }

    public String getTrwSection28Bis() {
        return trwSection28Bis;
    }

    public void setTrwSection28Bis(String trwSection28Bis) {
        this.trwSection28Bis = trwSection28Bis;
    }

    public String getTrwLicense() {
        return trwLicense;
    }

    public void setTrwLicense(String trwLicense) {
        this.trwLicense = trwLicense;
    }

    public String getTrwExplain() {
        return trwExplain;
    }

    public void setTrwExplain(String trwExplain) {
        this.trwExplain = trwExplain;
    }

    public String getTrwPicDetail() {
        return trwPicDetail;
    }

    public void setTrwPicDetail(String trwPicDetail) {
        this.trwPicDetail = trwPicDetail;
    }

    public String getTrwPicDoc() {
        return trwPicDoc;
    }

    public void setTrwPicDoc(String trwPicDoc) {
        this.trwPicDoc = trwPicDoc;
    }

    public String getTrwPicWord() {
        return trwPicWord;
    }

    public void setTrwPicWord(String trwPicWord) {
        this.trwPicWord = trwPicWord;
    }

    public Long getTrwList() {
        return trwList;
    }

    public void setTrwList(Long trwList) {
        this.trwList = trwList;
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

    public String getTrwCopyDoc() {
        return trwCopyDoc;
    }

    public void setTrwCopyDoc(String trwCopyDoc) {
        this.trwCopyDoc = trwCopyDoc;
    }

    public String getTrwAuthDoc() {
        return trwAuthDoc;
    }

    public void setTrwAuthDoc(String trwAuthDoc) {
        this.trwAuthDoc = trwAuthDoc;
    }

    public String getTrwGroupDoc() {
        return trwGroupDoc;
    }

    public void setTrwGroupDoc(String trwGroupDoc) {
        this.trwGroupDoc = trwGroupDoc;
    }

    public String getTrwRejectDoc() {
        return trwRejectDoc;
    }

    public void setTrwRejectDoc(String trwRejectDoc) {
        this.trwRejectDoc = trwRejectDoc;
    }

    public String getTrwRelationDoc() {
        return trwRelationDoc;
    }

    public void setTrwRelationDoc(String trwRelationDoc) {
        this.trwRelationDoc = trwRelationDoc;
    }

    public String getTrwRuleDoc() {
        return trwRuleDoc;
    }

    public void setTrwRuleDoc(String trwRuleDoc) {
        this.trwRuleDoc = trwRuleDoc;
    }

    public String getTrwSpecDoc() {
        return trwSpecDoc;
    }

    public void setTrwSpecDoc(String trwSpecDoc) {
        this.trwSpecDoc = trwSpecDoc;
    }

    public String getTrwForeinDoc() {
        return trwForeinDoc;
    }

    public void setTrwForeinDoc(String trwForeinDoc) {
        this.trwForeinDoc = trwForeinDoc;
    }

    public String getTrwSpareDoc() {
        return trwSpareDoc;
    }

    public void setTrwSpareDoc(String trwSpareDoc) {
        this.trwSpareDoc = trwSpareDoc;
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

    public String getContEmail() {
        return contEmail;
    }

    public void setContEmail(String contEmail) {
        this.contEmail = contEmail;
    }

    public String getContFax() {
        return contFax;
    }

    public void setContFax(String contFax) {
        this.contFax = contFax;
    }

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public LocalDate getTrDate() {
        return trDate;
    }

    public void setTrDate(LocalDate trDate) {
        this.trDate = trDate;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getTrwPicBig() {
        return trwPicBig;
    }

    public void setTrwPicBig(String trwPicBig) {
        this.trwPicBig = trwPicBig;
    }

    public String getTrwPic31() {
        return trwPic31;
    }

    public void setTrwPic31(String trwPic31) {
        this.trwPic31 = trwPic31;
    }

    public String getTrwPic32() {
        return trwPic32;
    }

    public void setTrwPic32(String trwPic32) {
        this.trwPic32 = trwPic32;
    }

    public String getTrwPic33() {
        return trwPic33;
    }

    public void setTrwPic33(String trwPic33) {
        this.trwPic33 = trwPic33;
    }

    public String getTrwPic34() {
        return trwPic34;
    }

    public void setTrwPic34(String trwPic34) {
        this.trwPic34 = trwPic34;
    }

    public String getTrwPic35() {
        return trwPic35;
    }

    public void setTrwPic35(String trwPic35) {
        this.trwPic35 = trwPic35;
    }

    public String getTrwPic36() {
        return trwPic36;
    }

    public void setTrwPic36(String trwPic36) {
        this.trwPic36 = trwPic36;
    }

    public String getTrwPdfDoc() {
        return trwPdfDoc;
    }

    public void setTrwPdfDoc(String trwPdfDoc) {
        this.trwPdfDoc = trwPdfDoc;
    }

    public String getTrwRead() {
        return trwRead;
    }

    public void setTrwRead(String trwRead) {
        this.trwRead = trwRead;
    }

    public String getTrwLang() {
        return trwLang;
    }

    public void setTrwLang(String trwLang) {
        this.trwLang = trwLang;
    }

    public String getTrwLangDesc() {
        return trwLangDesc;
    }

    public void setTrwLangDesc(String trwLangDesc) {
        this.trwLangDesc = trwLangDesc;
    }

    public String getTrwSoundDoc() {
        return trwSoundDoc;
    }

    public void setTrwSoundDoc(String trwSoundDoc) {
        this.trwSoundDoc = trwSoundDoc;
    }

    public String getTrwTransferDoc() {
        return trwTransferDoc;
    }

    public void setTrwTransferDoc(String trwTransferDoc) {
        this.trwTransferDoc = trwTransferDoc;
    }

    public String getTrwAllowDoc() {
        return trwAllowDoc;
    }

    public void setTrwAllowDoc(String trwAllowDoc) {
        this.trwAllowDoc = trwAllowDoc;
    }

    public String getTrwSpare1Doc() {
        return trwSpare1Doc;
    }

    public void setTrwSpare1Doc(String trwSpare1Doc) {
        this.trwSpare1Doc = trwSpare1Doc;
    }

    public String getTrwSpare2Doc() {
        return trwSpare2Doc;
    }

    public void setTrwSpare2Doc(String trwSpare2Doc) {
        this.trwSpare2Doc = trwSpare2Doc;
    }

    public String getTrwSpare3Doc() {
        return trwSpare3Doc;
    }

    public void setTrwSpare3Doc(String trwSpare3Doc) {
        this.trwSpare3Doc = trwSpare3Doc;
    }

    public TrwtNo01Filing getTrwtNo01Filing() {
        return trwtNo01Filing;
    }

    public void setTrwtNo01Filing(TrwtNo01Filing trwtNo01Filing) {
        this.trwtNo01Filing = trwtNo01Filing;
    }

    public BigDecimal getFineImage() {
        return fineImage;
    }

    public void setFineImage(BigDecimal fineImage) {
        this.fineImage = fineImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtNo01 trwtNo01 = (TrwtNo01) o;
        return Objects.equals(trwNo01Id, trwtNo01.trwNo01Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trwNo01Id);
    }
}
