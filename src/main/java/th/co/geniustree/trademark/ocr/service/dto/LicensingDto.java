package th.co.geniustree.trademark.ocr.service.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class LicensingDto {

    @NotNull(message = "ไม่มีข้อมูลวันที่ยื่นคำขอ")
    private LocalDate trwDate;//วันที่ยื่นคำขอ

    @NotNull(message = "ไม่มีค่าธรรมเนียม")
    private BigDecimal feeAmount;//ค่าธรรมเนียม

    @NotNull(message = "ไม่มีเลขที่คำขอ")
    private Long trNo;//เลขที่คำขอ

    @NotNull(message = " เลขอ้างอิงการชำระเงินต้องไม่เป็นค่าว่าง")
    private Long payRefNo;

    private Boolean regPermit;

    private Boolean regRenew;

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

    private Type type;

    private ContactPersonOwnershipType contractType;

    @Valid
    private List<AgencyDto> agencies;//ตัวแทน เป็นArray

    @Valid
    private List<OwnerDto> permits;//ตัวแทน เป็นArray

    private List<NiceClassDto> niceClasses;

    public LocalDate getTrwDate() {
        return trwDate;
    }

    public void setTrwDate(LocalDate trwDate) {
        this.trwDate = trwDate;
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

    public Long getPayRefNo() {
        return payRefNo;
    }

    public void setPayRefNo(Long payRefNo) {
        this.payRefNo = payRefNo;
    }

    public Boolean getRegPermit() {
        return regPermit;
    }

    public void setRegPermit(Boolean regPermit) {
        this.regPermit = regPermit;
    }

    public Boolean getRegRenew() {
        return regRenew;
    }

    public void setRegRenew(Boolean regRenew) {
        this.regRenew = regRenew;
    }

    public String getContractCardNo() {
        return contractCardNo;
    }

    public void setContractCardNo(String contractCardNo) {
        this.contractCardNo = contractCardNo;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ContactPersonOwnershipType getContractType() {
        return contractType;
    }

    public void setContractType(ContactPersonOwnershipType contractType) {
        this.contractType = contractType;
    }

    public List<AgencyDto> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<AgencyDto> agencies) {
        this.agencies = agencies;
    }

    public List<OwnerDto> getPermits() {
        return permits;
    }

    public void setPermits(List<OwnerDto> permits) {
        this.permits = permits;
    }

    public List<NiceClassDto> getNiceClasses() {
        return niceClasses;
    }

    public void setNiceClasses(List<NiceClassDto> niceClasses) {
        this.niceClasses = niceClasses;
    }


    public enum Type{
        TRADE_MARK_AND_SERVICE_MARK("5"), CERTIFICATION_MARK("3"), COLLECTIVE_MARK("4");

        String number;

        Type(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
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
}
