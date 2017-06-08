package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CTST_SCAN")
public class CtstScan extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7421901915689766789L;

    @Id
    @SequenceGenerator(name = "CTST_SCAN_SEQ", sequenceName = "CTST_SCAN_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTST_SCAN_SEQ")
    @Column(name = "SCAN_ID", nullable = false, precision = 22, scale = 0)
    private Long scanId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECV_ID")
    private SistRecvTm sistRecvTm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAY_ID")
    private SistPayment sistPayment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAY_DET_ID")
    private SistPaymentDet sistPaymentDet;

    @Column(name = "BOOK_ID", precision = 22, scale = 0)
    private Long bookId;

    @Column(name = "RECV_POST_ID", precision = 22, scale = 0)
    private Long recvPostId;

    @Column(name = "CERT_ID", precision = 22, scale = 0)
    private Long certId;

    @Column(name = "DICESION_ID", precision = 22, scale = 0)
    private Long dicesionId;

    @Column(name = "CASE_ID", precision = 22, scale = 0)
    private Long caseId;

    @Column(name = "OTHER_ID", precision = 22, scale = 0)
    private Long otherId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_ID")
    private RpstTrademark rpstTrademark;

    @Column(name = "TR_NO", precision = 15, scale = 0)
    private Long trNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "TR_DATE", length = 7)
    private Date trDate;

    @Column(name = "FEE_CODE", length = 3)
    private String feeCode;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Column(name = "RECEIPT_BOOK", length = 10)
    private String receiptBook;

    @Column(name = "BOOK_ADMIN", length = 15)
    private String bookAdmin;

    @Column(name = "BOOK_RUNNING", precision = 22, scale = 0)
    private Long bookRunning;

    @Temporal(TemporalType.DATE)
    @Column(name = "BOOK_DATE", length = 7)
    private Date bookDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "RECV_DATE", length = 7)
    private Date recvDate;

    @Column(name = "TK_CODE", precision = 22, scale = 0)
    private Long tkCode;

    @Column(name = "TK_NO", precision = 22, scale = 0)
    private Long tkNo;

    @Column(name = "REG_NO", length = 20)
    private String regNo;

    @Column(name = "ORDER_NO", length = 30)
    private String orderNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", length = 7)
    private Date orderDate;

    @Column(name = "SCAN_TYPE", length = 10)
    private String scanType;

    @Column(name = "FILE_PATH", length = 150)
    private String filePath;

    @Column(name = "FILE_NAME", length = 150)
    private String fileName;

    @Column(name = "FILE_TYPE", length = 10)
    private String fileType;

    @Column(name = "PAGE_TOTAL", precision = 22, scale = 0)
    private Long pageTotal;

    @Column(name = "SCAN_SEQ", precision = 3, scale = 0)
    private Long scanSeq;

    @Column(name = "FILE_MAX", precision = 22, scale = 0)
    private Long fileMax;

    @Column(name = "SCAN_DESP", length = 1000)
    private String scanDesp;

    @Column(name = "ORDER_YEAR", length = 4)
    private String orderYear;

    @Column(name = "ORDER_SUBJECT", length = 500)
    private String orderSubject;

    @Column(name = "BLACK_CASE", length = 10)
    private String blackCase;

    @Column(name = "BLACK_YEAR", length = 4)
    private String blackYear;

    @Column(name = "RED_CASE", length = 10)
    private String redCase;

    @Column(name = "RED_YEAR", length = 4)
    private String redYear;

    @Column(name = "SPEC_NO", length = 20)
    private String specNo;

    @Column(name = "BOOK_YEAR", length = 4)
    private String bookYear;

    @Column(name = "SCOURT_NO", length = 20)
    private String scourtNo;

    @Column(name = "SCOURT_YEAR", length = 4)
    private String scourtYear;

    @Column(name = "COURT_NAME", length = 100)
    private String courtName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEE_ID")
    private CtltFee ctltFee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LIST_PAY_ID")
    private SistListPayment sistListPayment;

    @Temporal(TemporalType.DATE)
    @Column(name = "STK_DATE", length = 7)
    private Date stkDate;

    @Column(name = "POST_SCAN_ID", precision = 22, scale = 0)
    private Long postScanId;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Column(name = "CANCEL_FLAG", length = 1)
    private String cancelFlag;

    /**/
    @Column(name = "FILE_PATH_SOUND", length = 150)
    private String filePathSound;

    @Column(name = "FILE_NAME_SOUND", length = 150)
    private String fileNameSound;

    @Column(name = "FILE_TYPE_SOUND", length = 10)
    private String fileTypeSound;

    @Column(name = "SCAN_DESP_SOUND", length = 1000)
    private String scanDespSound;

    @Column(name = "SIST_RECV_AUDIO_ID", length = 32)
    private String sistRecvAudioId;

    @Column(name = "AUDIO_TYPE_ID", precision = 22)
    private Long audioTypeId;

    /**/
    public CtstScan() {
    }

    public CtstScan(Long scanId) {
        this.scanId = scanId;
    }


    @Transient
    public Long getPk() {
        return scanId;
    }

    public Long getScanId() {
        return this.scanId;
    }

    public void setScanId(Long scanId) {
        this.scanId = scanId;
    }

    public SistRecvTm getSistRecvTm() {
        return sistRecvTm;
    }

    public void setSistRecvTm(SistRecvTm sistRecvTm) {
        this.sistRecvTm = sistRecvTm;
    }

    public SistPaymentDet getSistPaymentDet() {
        return sistPaymentDet;
    }

    public void setSistPaymentDet(SistPaymentDet sistPaymentDet) {
        this.sistPaymentDet = sistPaymentDet;
    }

    public SistPayment getSistPayment() {
        return sistPayment;
    }

    public void setSistPayment(SistPayment sistPayment) {
        this.sistPayment = sistPayment;
    }

    public Long getBookId() {
        return this.bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getRecvPostId() {
        return this.recvPostId;
    }

    public void setRecvPostId(Long recvPostId) {
        this.recvPostId = recvPostId;
    }

    public Long getCertId() {
        return this.certId;
    }

    public void setCertId(Long certId) {
        this.certId = certId;
    }

    public Long getDicesionId() {
        return this.dicesionId;
    }

    public void setDicesionId(Long dicesionId) {
        this.dicesionId = dicesionId;
    }

    public Long getCaseId() {
        return this.caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getOtherId() {
        return this.otherId;
    }

    public void setOtherId(Long otherId) {
        this.otherId = otherId;
    }

    public RpstTrademark getRpstTrademark() {
        return rpstTrademark;
    }

    public void setRpstTrademark(RpstTrademark rpstTrademark) {
        this.rpstTrademark = rpstTrademark;
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

    public String getFeeCode() {
        return this.feeCode;
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

    public String getReceiptBook() {
        return this.receiptBook;
    }

    public void setReceiptBook(String receiptBook) {
        this.receiptBook = receiptBook;
    }

    public String getBookAdmin() {
        return this.bookAdmin;
    }

    public void setBookAdmin(String bookAdmin) {
        this.bookAdmin = bookAdmin;
    }

    public Long getBookRunning() {
        return this.bookRunning;
    }

    public void setBookRunning(Long bookRunning) {
        this.bookRunning = bookRunning;
    }

    public Date getBookDate() {
        return this.bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Date getRecvDate() {
        return this.recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public Long getTkCode() {
        return this.tkCode;
    }

    public void setTkCode(Long tkCode) {
        this.tkCode = tkCode;
    }

    public Long getTkNo() {
        return this.tkNo;
    }

    public void setTkNo(Long tkNo) {
        this.tkNo = tkNo;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getScanType() {
        return this.scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getPageTotal() {
        return this.pageTotal;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Long getScanSeq() {
        return this.scanSeq;
    }

    public void setScanSeq(Long scanSeq) {
        this.scanSeq = scanSeq;
    }

    public Long getFileMax() {
        return this.fileMax;
    }

    public void setFileMax(Long fileMax) {
        this.fileMax = fileMax;
    }

    public String getScanDesp() {
        return this.scanDesp;
    }

    public void setScanDesp(String scanDesp) {
        this.scanDesp = scanDesp;
    }

    public String getOrderYear() {
        return this.orderYear;
    }

    public void setOrderYear(String orderYear) {
        this.orderYear = orderYear;
    }

    public String getOrderSubject() {
        return this.orderSubject;
    }

    public void setOrderSubject(String orderSubject) {
        this.orderSubject = orderSubject;
    }

    public String getBlackCase() {
        return this.blackCase;
    }

    public void setBlackCase(String blackCase) {
        this.blackCase = blackCase;
    }

    public String getBlackYear() {
        return this.blackYear;
    }

    public void setBlackYear(String blackYear) {
        this.blackYear = blackYear;
    }

    public String getRedCase() {
        return this.redCase;
    }

    public void setRedCase(String redCase) {
        this.redCase = redCase;
    }

    public String getRedYear() {
        return this.redYear;
    }

    public void setRedYear(String redYear) {
        this.redYear = redYear;
    }

    public String getSpecNo() {
        return this.specNo;
    }

    public void setSpecNo(String specNo) {
        this.specNo = specNo;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public String getScourtNo() {
        return scourtNo;
    }

    public void setScourtNo(String scourtNo) {
        this.scourtNo = scourtNo;
    }

    public String getScourtYear() {
        return scourtYear;
    }

    public void setScourtYear(String scourtYear) {
        this.scourtYear = scourtYear;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public CtltFee getCtltFee() {
        return ctltFee;
    }

    public void setCtltFee(CtltFee ctltFee) {
        this.ctltFee = ctltFee;
    }

    public SistListPayment getSistListPayment() {
        return sistListPayment;
    }

    public void setSistListPayment(SistListPayment sistListPayment) {
        this.sistListPayment = sistListPayment;
    }

    public Date getStkDate() {
        return stkDate;
    }

    public void setStkDate(Date stkDate) {
        this.stkDate = stkDate;
    }

    public Long getPostScanId() {
        return postScanId;
    }

    public void setPostScanId(Long postScanId) {
        this.postScanId = postScanId;
    }

    public String getUpdateByPrg() {
        return this.updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.scanId);
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
        final CtstScan other = (CtstScan) obj;
        if (!Objects.equals(this.scanId, other.scanId)) {
            return false;
        }
        return true;
    }

    /**/

    public String getFilePathSound() {
        return this.filePathSound;
    }

    public void setFilePathSound(String filePathSound) {
        this.filePathSound = filePathSound;
    }

    public String getFileNameSound() {
        return this.fileNameSound;
    }

    public void setFileNameSound(String fileNameSound) {
        this.fileNameSound = fileNameSound;
    }

    public String getFileTypeSound() {
        return this.fileTypeSound;
    }

    public void setFileTypeSound(String fileTypeSound) {
        this.fileTypeSound = fileTypeSound;
    }

    public String getScanDespSound() {
        return this.scanDespSound;
    }

    public void setScanDespSound(String scanDespSound) {
        this.scanDespSound = scanDespSound;
    }

    public String getSistRecvAudioId() {
        return sistRecvAudioId;
    }

    public void setSistRecvAudioId(String sistRecvAudioId) {
        this.sistRecvAudioId = sistRecvAudioId;
    }

    public Long getAudioTypeId() {
        return audioTypeId;
    }

    public void setAudioTypeId(Long audioTypeId) {
        this.audioTypeId = audioTypeId;
    }
    /**/
}
