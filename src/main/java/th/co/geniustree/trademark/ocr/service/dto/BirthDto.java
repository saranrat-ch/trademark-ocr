package th.co.geniustree.trademark.ocr.service.dto;

import th.co.geniustree.trademark.ocr.domain.CtltNiceClass;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by saranrat on 5/6/2560.
 */
public class BirthDto {

    private TrwStat applicantType;//ประเภทผู้ยื่น

    private LocalDate trwDate;//วันที่ยื่นคำขอ

    private TrwType markType;//ประเภทคำขอ

    private BigDecimal feeAmount;//ค่าธรรมเนียม

    private Long trNo;//เลขที่คำขอ

    private Protection colorProtection;//การขอจดทะเบียนเครื่องหมายที่มีลักษณะเป็นกลุ่มสี

    private String colorProtectionDescription;//คำอธิบาย การขอจดทะเบียนเครื่องหมายที่มีลักษณะเป็นกลุ่มสี

    private Protection shapeProtection;//การขอจดทะเบียนเครื่องหมายที่มีลักษณะเป็นรูปร่างหรือรูปทรงของวัตถุ

    private String shapeProtectionDescription;//คำอธิบาย การขอจดทะเบียนเครื่องหมายที่มีลักษณะเป็นรูปร่างหรือรูปทรงของวัตถุ

    private Publish section28;//มาตรา28

    private OtopType otopType;//ประเภทOTOP

    private String otopNo;//เลขทะเบียนOTOP

    private ContactPersonOwnershipType contractType;//สถานที่ติดต่อภายในประเทศไทย

    private String contractName;//ชื่อ สถานที่ติดต่อ

    private String contractAddr;//ที่อยู่ สถานที่ติดต่อ

    private String contractMoo;//หมู่ สถานที่ติดต่อ

    private String contractSoi;//ซอย สถานที่ติดต่อ

    private String contractRoad;//ถนน สถานที่ติดต่อ

    private String contractPostcode;//ไปรษณีย์ สถานที่ติดต่อ

    private String contractEmail;//อีเมล์ สถานที่ติดต่อ

    private String contractPhone;//เบอร์โทร สถานที่ติดต่อ

    private String contractFax;//โทรสาร สถานที่ติดต่อ

    private String aumpCode;//รหัสอำเภอ สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    private String provCode;//รหัสจังหวัด สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    private String tumbonStr;//ชื่อตำบล สถานที่ติดต่อ

    private Flag threeDShapesFlag;//ยื่นรูปทรง 3 มิติ

    private Flag colorGroupsFlag;//ยื่นคุ้มครองกลุ่มสี

    private Flag soundMarkFlag;//ยื่นเครื่องหมายเสียง

    private String ruleDescription;//ข้อบังคับว่าด้วยการใช้เครื่องหมายรับรอง

    private List<BirthOwnerDto> owners;//เจ้าของ เป็นArray

    private List<BirthAgencyDto> agencies;//ตัวแทน เป็นArray

    private List<NiceClassDto> niceClasses;//จำพวกสินค้า เป็นArray


    public TrwStat getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(TrwStat applicantType) {
        this.applicantType = applicantType;
    }

    public LocalDate getTrwDate() {
        return trwDate;
    }

    public void setTrwDate(LocalDate trwDate) {
        this.trwDate = trwDate;
    }

    public TrwType getMarkType() {
        return markType;
    }

    public void setMarkType(TrwType markType) {
        this.markType = markType;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public Protection getColorProtection() {
        return colorProtection;
    }

    public void setColorProtection(Protection colorProtection) {
        this.colorProtection = colorProtection;
    }

    public String getColorProtectionDescription() {
        return colorProtectionDescription;
    }

    public void setColorProtectionDescription(String colorProtectionDescription) {
        this.colorProtectionDescription = colorProtectionDescription;
    }

    public Protection getShapeProtection() {
        return shapeProtection;
    }

    public void setShapeProtection(Protection shapeProtection) {
        this.shapeProtection = shapeProtection;
    }

    public String getShapeProtectionDescription() {
        return shapeProtectionDescription;
    }

    public void setShapeProtectionDescription(String shapeProtectionDescription) {
        this.shapeProtectionDescription = shapeProtectionDescription;
    }

    public Publish getSection28() {
        return section28;
    }

    public void setSection28(Publish section28) {
        this.section28 = section28;
    }

    public OtopType getOtopType() {
        return otopType;
    }

    public void setOtopType(OtopType otopType) {
        this.otopType = otopType;
    }

    public String getOtopNo() {
        return otopNo;
    }

    public void setOtopNo(String otopNo) {
        this.otopNo = otopNo;
    }

    public ContactPersonOwnershipType getContractType() {
        return contractType;
    }

    public void setContractType(ContactPersonOwnershipType contractType) {
        this.contractType = contractType;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractAddr() {
        return contractAddr;
    }

    public void setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr;
    }

    public String getContractMoo() {
        return contractMoo;
    }

    public void setContractMoo(String contractMoo) {
        this.contractMoo = contractMoo;
    }

    public String getContractSoi() {
        return contractSoi;
    }

    public void setContractSoi(String contractSoi) {
        this.contractSoi = contractSoi;
    }

    public String getContractRoad() {
        return contractRoad;
    }

    public void setContractRoad(String contractRoad) {
        this.contractRoad = contractRoad;
    }

    public String getContractPostcode() {
        return contractPostcode;
    }

    public void setContractPostcode(String contractPostcode) {
        this.contractPostcode = contractPostcode;
    }

    public String getContractEmail() {
        return contractEmail;
    }

    public void setContractEmail(String contractEmail) {
        this.contractEmail = contractEmail;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }

    public String getContractFax() {
        return contractFax;
    }

    public void setContractFax(String contractFax) {
        this.contractFax = contractFax;
    }

    public String getAumpCode() {
        return aumpCode;
    }

    public void setAumpCode(String aumpCode) {
        this.aumpCode = aumpCode;
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public String getTumbonStr() {
        return tumbonStr;
    }

    public void setTumbonStr(String tumbonStr) {
        this.tumbonStr = tumbonStr;
    }

    public List<BirthOwnerDto> getOwners() {
        return owners;
    }

    public void setOwners(List<BirthOwnerDto> owners) {
        this.owners = owners;
    }

    public List<BirthAgencyDto> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<BirthAgencyDto> agencies) {
        this.agencies = agencies;
    }

    public List<NiceClassDto> getNiceClasses() {
        return niceClasses;
    }

    public void setNiceClasses(List<NiceClassDto> niceClasses) {
        this.niceClasses = niceClasses;
    }

    public Flag getThreeDShapesFlag() {
        return threeDShapesFlag;
    }

    public void setThreeDShapesFlag(Flag threeDShapesFlag) {
        this.threeDShapesFlag = threeDShapesFlag;
    }

    public Flag getColorGroupsFlag() {
        return colorGroupsFlag;
    }

    public void setColorGroupsFlag(Flag colorGroupsFlag) {
        this.colorGroupsFlag = colorGroupsFlag;
    }

    public Flag getSoundMarkFlag() {
        return soundMarkFlag;
    }

    public void setSoundMarkFlag(Flag soundMarkFlag) {
        this.soundMarkFlag = soundMarkFlag;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    public enum TrwType {
        TRADE_MARK_AND_SERVICE_MARK("5"), CERTIFICATION_MARK("3"), COLLECTIVE_MARK("4");

        String number;

        TrwType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum TrwStat {
        OWNER("1"), AGENCY("2");

        private String number;

        TrwStat(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

    public enum Protection {
        PROTECT, NO_PROTECT
    }

    public enum Publish {
        PUBLISH("1"), NO_PUBLISH("2");

        private String number;

        Publish(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

    public enum Claim {
        SEND("1"), SPARE("2"), NO_CLAIM("3");

        private String number;

        Claim(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

    public enum OtopType{
        NOT_OTOP("0"),SINGLE("1"),GROUP("2"),SME("3");

        private String number;


        OtopType(String number) {
            this.number=number;
        }

        public String getNumber(){
            return number;
        }
    }

    public enum ContactPersonOwnershipType {
        OWNER("1"), AGENCY("2"), SUB_AGENCY("4"), OTHER("3");

        private String number;

        ContactPersonOwnershipType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

    public enum Flag{
        YES("1"), NO("2");

        private String number;

        Flag(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }
}
