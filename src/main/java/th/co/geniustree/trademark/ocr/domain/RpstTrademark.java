package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "RPST_TRADEMARK", uniqueConstraints = @UniqueConstraint(columnNames = "TR_NO"))
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "RpstTrademark.pupd_status",
        procedureName = "rps.pupd_status",
        parameters = {
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "tr_no_p", type = Long.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "status_code_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "status_date_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "step_code_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "step_date_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "reason_code_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "reason_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "create_by_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN, name = "update_by_prg_p", type = String.class),
            @StoredProcedureParameter(mode = ParameterMode.OUT, name = "status_p", type = String.class)
        }
    )
})
public class RpstTrademark extends BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "RPST_TRADEMARK_SEQ", sequenceName = "RPST_TRADEMARK_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RPST_TRADEMARK_SEQ")
    @Column(name = "TR_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trId;

    @Column(name = "TR_NO", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trNo;

    @Column(name = "TR_DATE", length = 7)
    private LocalDate trDate;

    @Column(name = "TR_TYPE", length = 1)
    private String trType;

    @Column(name = "TR_METHOD", length = 1)
    private String trMethod;

    @Column(name = "ORG_CODE", length = 18)
    private String orgCode;

    @Column(name = "CON_FLAG", length = 1)
    private String conFlag;

    @Column(name = "CON_SEQ", precision = 22, scale = 0)
    private Long conSeq;

    @Column(name = "CON_TYPE", length = 1)
    private String conType;

    @Column(name = "CARD_TYPE", length = 1)
    private String cardType;

    @Column(name = "CARD_NO", length = 50)
    private String cardNo;

    @Column(name = "CON_NAME", length = 500)
    private String conName;

    @Column(name = "CON_GENDER", length = 1)
    private String conGender;

    @Column(name = "CON_ADDR", length = 500)
    private String conAddr;

    @Column(name = "CON_LOC_ID")
    private Long ctltLocation;

    @Column(name = "CON_LOC_CODE", length = 8)
    private String conLocCode;

    @Column(name = "CON_POSTCODE", length = 10)
    private String conPostcode;

    @Column(name = "CON_COUNTRY_ID")
    private Long ctltCountry;

    @Column(name = "CON_COUNTRY_CODE", length = 50)
    private String conCountryCode;

    @Column(name = "CON_PHONE", length = 50)
    private String conPhone;

    @Column(name = "CON_FAX", length = 50)
    private String conFax;

    @Column(name = "CON_EMAIL", length = 200)
    private String conEmail;

    @Column(name = "GAZ_NO", length = 6)
    private String gazNo;

    @Column(name = "GAZ_PAGE", length = 6)
    private String gazPage;

    @Column(name = "GAZ_DATE", length = 7)
    private LocalDate gazDate;

    @Column(name = "REG_NO", length = 20)
    private String regNo;

    @Column(name = "REG_DATE", length = 7)
    private LocalDate regDate;

    @Column(name = "MATRA28_DATE", length = 7)
    private LocalDate matra28Date;

    @Column(name = "STATUS_CODE", length = 1)
    private String statusCode;

    @Column(name = "STATUS_DATE", length = 7)
    private LocalDate statusDate;

    @Column(name = "STEP_CODE", length = 3)
    private String stepCode;

    @Column(name = "STEP_DATE", length = 7)
    private LocalDate stepDate;

    @Column(name = "STEP_CODE_SHOW", length = 3)
    private String stepCodeShow;

    @Column(name = "THREE_D_FLAG", length = 1)
    private String threeDFlag;

    @Column(name = "COLORGRP_FLAG", length = 1)
    private String colorgrpFlag;

    @Column(name = "OTOP_FLAG", length = 1)
    private String otopFlag;

    @Column(name = "SOUND_FLAG", length = 1)
    private String soundFlag;

    @Column(name = "SCENT_FLAG", length = 1)
    private String scentFlag;

    @Column(name = "SOUND_DESC", length = 500)
    private String soundDesc;

    @Column(name = "SCENT_DESC", length = 500)
    private String scentDesc;

    @Column(name = "REASON", length = 500)
    private String reason;

    @Column(name = "TRANSLATOR", length = 500)
    private String translator;

    @Column(name = "NO_PERMIT", length = 500)
    private String noPermit;

    @Column(name = "EXPIRE_DATE", length = 7)
    private LocalDate expireDate;

    @Column(name = "REF_TR_NO", length = 500)
    private String refTrNo;

    @Column(name = "SCAN_ID")
    private Long ctstScan;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Column(name = "REASON_CODE", length = 3)
    private String reasonCode;

    @Column(name = "OTOP_TYPE", length = 1)
    private String otopType;

    @Column(name = "OTOP_NO", length = 20)
    private String otopNo;

    @Column(name = "OLD_STATUS1", length = 2)
    private String oldStatus1;

    @Column(name = "OLD_STATUS2", length = 2)
    private String oldStatus2;

    @Column(name = "EVIDENCE_PLACE", length = 150)
    private String evidencePlace;

    /* Add since 2559 */
    @Column(name = "FROM_TR_ID", precision = 22, scale = 0)
    private Long fromTrId;

    @Column(name = "FROM_TR_NO", precision = 22, scale = 0)
    private Long fromTrNo;

    @Column(name = "FROM_REG_NO", length = 20)
    private String fromRegNo;

    /* Add for Madrid*/
    @Column(name = "IRN_NO", length = 10)
    private String irnNo;

    @Column(name = "IRN_NO_REF", length = 10)
    private String irnNoRef;

    @Enumerated(EnumType.STRING)
    @Column(name = "REQ_CONVERSION_STATUS")
    private State reqConversionStatus;

    @Column(name = "CONV_DATE")
    private LocalDate convDate;

    @Column(name = "IS_LIMITATION")
    private boolean isLimitation;

    @Column(name = "PRIORITY_DATE")
    private LocalDate priorityDate;

    @Column(name = "DOC_ID", length = 20)
    private String docId;

    @OneToMany(mappedBy = "rpstTrademark")
    private Set<RpstTrOwner> rpstTrOwners;

    @OneToMany(mappedBy = "rpstTrademark")
    private List<RpstTrAgency> rpstTrAgencies;

    @OneToMany(mappedBy = "rpstTrademark")
    private Set<RpstTrClass> rpstTrClasses;

    @OneToMany(mappedBy = "rpstTrademark")
    private Set<RpstTrGoods> rpstTrGoodList;

    public RpstTrademark() {

    }


    public RpstTrademark(Long trId) {
        super();

        this.trId = trId;
    }

    public RpstTrademark(Long trId, Long trNo) {
        this.trId = trId;
        this.trNo = trNo;
    }

    public Long getTrId() {
        return this.trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
    }

    public Long getTrNo() {
        return this.trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public String getTrType() {
        return this.trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }

    public String getTrMethod() {
        return this.trMethod;
    }

    public void setTrMethod(String trMethod) {
        this.trMethod = trMethod;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getConFlag() {
        return this.conFlag;
    }

    public void setConFlag(String conFlag) {
        this.conFlag = conFlag;
    }

    public Long getConSeq() {
        return this.conSeq;
    }

    public void setConSeq(Long conSeq) {
        this.conSeq = conSeq;
    }

    public String getConType() {
        return this.conType;
    }

    public void setConType(String conType) {
        this.conType = conType;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getConName() {
        return this.conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public String getConGender() {
        return this.conGender;
    }

    public void setConGender(String conGender) {
        this.conGender = conGender;
    }

    public String getConAddr() {
        return this.conAddr;
    }

    public void setConAddr(String conAddr) {
        this.conAddr = conAddr;
    }

    public String getConLocCode() {
        return this.conLocCode;
    }

    public void setConLocCode(String conLocCode) {
        this.conLocCode = conLocCode;
    }

    public String getConPostcode() {
        return this.conPostcode;
    }

    public void setConPostcode(String conPostcode) {
        this.conPostcode = conPostcode;
    }

    public String getConCountryCode() {
        return this.conCountryCode;
    }

    public void setConCountryCode(String conCountryCode) {
        this.conCountryCode = conCountryCode;
    }

    public String getConPhone() {
        return this.conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone;
    }

    public String getConFax() {
        return this.conFax;
    }

    public void setConFax(String conFax) {
        this.conFax = conFax;
    }

    public String getConEmail() {
        return this.conEmail;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    public String getGazNo() {
        return this.gazNo;
    }

    public void setGazNo(String gazNo) {
        this.gazNo = gazNo;
    }

    public String getGazPage() {
        return this.gazPage;
    }

    public void setGazPage(String gazPage) {
        this.gazPage = gazPage;
    }

    public String getRegNo() {
        return this.regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStepCode() {
        return this.stepCode;
    }

    public void setStepCode(String stepCode) {
        this.stepCode = stepCode;
    }

    public String getStepCodeShow() {
        return this.stepCodeShow;
    }

    public void setStepCodeShow(String stepCodeShow) {
        this.stepCodeShow = stepCodeShow;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getThreeDFlag() {
        return this.threeDFlag;
    }

    public void setThreeDFlag(String threeDFlag) {
        this.threeDFlag = threeDFlag;
    }

    public String getColorgrpFlag() {
        return this.colorgrpFlag;
    }

    public void setColorgrpFlag(String colorgrpFlag) {
        this.colorgrpFlag = colorgrpFlag;
    }

    public String getOtopFlag() {
        return this.otopFlag;
    }

    public void setOtopFlag(String otopFlag) {
        this.otopFlag = otopFlag;
    }

    public String getSoundFlag() {
        return this.soundFlag;
    }

    public void setSoundFlag(String soundFlag) {
        this.soundFlag = soundFlag;
    }

    public String getScentFlag() {
        return this.scentFlag;
    }

    public void setScentFlag(String scentFlag) {
        this.scentFlag = scentFlag;
    }

    public String getSoundDesc() {
        return this.soundDesc;
    }

    public void setSoundDesc(String soundDesc) {
        this.soundDesc = soundDesc;
    }

    public String getScentDesc() {
        return this.scentDesc;
    }

    public void setScentDesc(String scentDesc) {
        this.scentDesc = scentDesc;
    }

    public String getTranslator() {
        return this.translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getNoPermit() {
        return this.noPermit;
    }

    public void setNoPermit(String noPermit) {
        this.noPermit = noPermit;
    }

    public String getRefTrNo() {
        return this.refTrNo;
    }

    public void setRefTrNo(String refTrNo) {
        this.refTrNo = refTrNo;
    }

    public String getUpdateByPrg() {
        return this.updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getOtopType() {
        return this.otopType;
    }

    public void setOtopType(String otopType) {
        this.otopType = otopType;
    }

    public String getOtopNo() {
        return this.otopNo;
    }

    public void setOtopNo(String otopNo) {
        this.otopNo = otopNo;
    }

    public String getOldStatus1() {
        return oldStatus1;
    }

    public void setOldStatus1(String oldStatus1) {
        this.oldStatus1 = oldStatus1;
    }

    public String getOldStatus2() {
        return oldStatus2;
    }

    public void setOldStatus2(String oldStatus2) {
        this.oldStatus2 = oldStatus2;
    }

    public String getEvidencePlace() {
        return evidencePlace;
    }

    public void setEvidencePlace(String evidencePlace) {
        this.evidencePlace = evidencePlace;
    }

    public Long getFromTrNo() {
        return fromTrNo;
    }

    public void setFromTrNo(Long fromTrNo) {
        this.fromTrNo = fromTrNo;
    }

    public String getFromRegNo() {
        return fromRegNo;
    }

    public void setFromRegNo(String fromRegNo) {
        this.fromRegNo = fromRegNo;
    }

    public Long getFromTrId() {
        return fromTrId;
    }

    public void setFromTrId(Long fromTrId) {
        this.fromTrId = fromTrId;
    }

    public String getIrnNo() {
        return irnNo;
    }

    public void setIrnNo(String irnNo) {
        this.irnNo = irnNo;
    }

    public String getIrnNoRef() {
        return irnNoRef;
    }

    public void setIrnNoRef(String irnNoRef) {
        this.irnNoRef = irnNoRef;
    }

    public State getReqConversionStatus() {
        return reqConversionStatus;
    }

    public void setReqConversionStatus(State reqConversionStatus) {
        this.reqConversionStatus = reqConversionStatus;
    }

    public boolean isLimitation() {
        return isLimitation;
    }

    public void setLimitation(boolean limitation) {
        isLimitation = limitation;
    }

    public LocalDate getTrDate() {
        return trDate;
    }

    public void setTrDate(LocalDate trDate) {
        this.trDate = trDate;
    }

    public Long getCtltLocation() {
        return ctltLocation;
    }

    public void setCtltLocation(Long ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public Long getCtltCountry() {
        return ctltCountry;
    }

    public void setCtltCountry(Long ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public LocalDate getGazDate() {
        return gazDate;
    }

    public void setGazDate(LocalDate gazDate) {
        this.gazDate = gazDate;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public LocalDate getMatra28Date() {
        return matra28Date;
    }

    public void setMatra28Date(LocalDate matra28Date) {
        this.matra28Date = matra28Date;
    }

    public LocalDate getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(LocalDate statusDate) {
        this.statusDate = statusDate;
    }

    public LocalDate getStepDate() {
        return stepDate;
    }

    public void setStepDate(LocalDate stepDate) {
        this.stepDate = stepDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public Long getCtstScan() {
        return ctstScan;
    }

    public void setCtstScan(Long ctstScan) {
        this.ctstScan = ctstScan;
    }

    public LocalDate getConvDate() {
        return convDate;
    }

    public void setConvDate(LocalDate convDate) {
        this.convDate = convDate;
    }

    public LocalDate getPriorityDate() {
        return priorityDate;
    }

    public void setPriorityDate(LocalDate priorityDate) {
        this.priorityDate = priorityDate;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }


    public Set<RpstTrOwner> getRpstTrOwners() {
        return rpstTrOwners;
    }

    public void setRpstTrOwners(Set<RpstTrOwner> rpstTrOwners) {
        this.rpstTrOwners = rpstTrOwners;
    }

    public List<RpstTrAgency> getRpstTrAgencies() {
        return rpstTrAgencies;
    }

    public void setRpstTrAgencies(List<RpstTrAgency> rpstTrAgencies) {
        this.rpstTrAgencies = rpstTrAgencies;
    }

    public Set<RpstTrClass> getRpstTrClasses() {
        return rpstTrClasses;
    }

    public void setRpstTrClasses(Set<RpstTrClass> rpstTrClasses) {
        this.rpstTrClasses = rpstTrClasses;
    }

    public Set<RpstTrGoods> getRpstTrGoodList() {
        return rpstTrGoodList;
    }

    public void setRpstTrGoodList(Set<RpstTrGoods> rpstTrGoodList) {
        this.rpstTrGoodList = rpstTrGoodList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.trId);
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
        final RpstTrademark other = (RpstTrademark) obj;
        return Objects.equals(this.trId, other.trId);
    }

    public enum State {
        REQUEST("ยื่นรอพิจารณา"),
        APPROVE("อนุญาต"),
        REJECT("ปฏิเสธ");

        private String message;

        State(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
