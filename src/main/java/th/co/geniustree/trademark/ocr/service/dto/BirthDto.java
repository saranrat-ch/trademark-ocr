package th.co.geniustree.trademark.ocr.service.dto;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by saranrat on 5/6/2560.
 */
public class BirthDto {


    @NotNull(message = "ไม่มีข้อมูลวันที่ยื่นคำขอ")
    private LocalDate trwDate;//วันที่ยื่นคำขอ

    @NotNull(message = "ไม่มีข้อมูลประเภทคำขอ")
    private TrwType markType;//ประเภทคำขอ

    @NotNull(message = "ไม่มีค่าธรรมเนียม")
    private BigDecimal feeAmount;//ค่าธรรมเนียม

    @NotNull(message = "ไม่มีเลขที่คำขอ")
    private Long trNo;//เลขที่คำขอ

    private OtopType otopType;//ประเภทOTOP

    private String otopNo;//เลขทะเบียนOTOP

    @NotNull(message = "ไม่มีประเภทสถานที่ติดต่อในประเทศไทย")
    private ContactPersonOwnershipType contractType;//สถานที่ติดต่อภายในประเทศไทย

    @NotBlank(message = "ไม่มีข้อมูลเลขประจำตัวประชาชน สถานที่ติดต่อในประเทศไทย")
    private String contractCardNo;//เลขประจำตัวประชาชน สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลชื่อผู้ติดต่อ สถานที่ติดต่อในประเทศไทย")
    private String contractName;//ชื่อ สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลที่อยู่ สถานที่ติดต่อในประเทศไทย")
    private String contractAddr;//ที่อยู่ สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลหมายเลขไปรษณีย์  สถานที่ติดต่อในประเทศไทย")
    private String contractPostcode;//ไปรษณีย์ สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลอีเมล์  สถานที่ติดต่อในประเทศไทย")
    private String contractEmail;//อีเมล์ สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลเบอร์โทร สถานที่ติดต่อในประเทศไทย")
    private String contractPhone;//เบอร์โทร สถานที่ติดต่อ

    private String contractFax;//โทรสาร สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลรหัสอำเภอ สถานที่ติดต่อในประเทศไทย")
    private String aumpCode;//รหัสอำเภอ สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลรหัสจังหวัด สถานที่ติดต่อในประเทศไทย")
    private String provCode;//รหัสจังหวัด สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลชื่อตำบล สถานที่ติดต่อในประเทศไทย")
    private String tumbonStr;//ชื่อตำบล สถานที่ติดต่อ

    private Flag threeDShapesFlag;//ยื่นรูปทรง 3 มิติ

    private Flag colorGroupsFlag;//ยื่นคุ้มครองกลุ่มสี

    private Flag soundMarkFlag;//ยื่นเครื่องหมายเสียง

    private String ruleDescription;//ข้อบังคับว่าด้วยการใช้เครื่องหมายรับรอง

    @NotEmpty(message = "ไม่มีข้อมูลเจ้าของ")
    private List<BirthOwnerDto> owners;//เจ้าของ เป็นArray

    private List<BirthAgencyDto> agencies;//ตัวแทน เป็นArray

    @NotEmpty(message = "ไม่มีข้อมูลรายการสินค้า")
    private List<NiceClassDto> niceClasses;//จำพวกสินค้า เป็นArray


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

    public String getContractCardNo() {
        return contractCardNo;
    }

    public void setContractCardNo(String contractCardNo) {
        this.contractCardNo = contractCardNo;
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
        YES("1"), NO("0");

        private String number;

        Flag(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }
}
