package th.co.geniustree.trademark.ocr.service.dto;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by saranrat on 3/7/2560.
 */
public class OppositionDto {

    @NotNull(message = "ไม่มีข้อมูลวันที่ยื่นคำขอ")
    private LocalDate trwDate;//วันที่ยื่นคำขอ

//    @NotNull(message = "ไม่มีข้อมูลประเภทคำขอ")
    private TrwType markType;//ประเภทคำขอ

    @NotNull(message = "ไม่มีค่าธรรมเนียม")
    private BigDecimal feeAmount;//ค่าธรรมเนียม

    @NotNull(message = "ไม่มีข้อมูลเลขคำขอ")
    private Long trNo;

    @NotNull(message = " เลขอ้างอิงการชำระเงินต้องไม่เป็นค่าว่าง")
    private Long payRefNo;

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

    @Valid
    @NotEmpty(message = "ไม่มีข้อมูลผู้คัดค้าน")
    private List<OwnerDto> applicants;//เจ้าของ เป็นArray

    @Valid
    private List<AgencyDto> agencies;//ตัวแทน เป็นArray

    @Valid
    private List<OppositionRefTrNoDto>  refTrNoList;//เลขที่คำขอผู้คัดค้าน เป็นArray

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

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Long getPayRefNo() {
        return payRefNo;
    }

    public void setPayRefNo(Long payRefNo) {
        this.payRefNo = payRefNo;
    }

    public ContactPersonOwnershipType getContractType() {
        return contractType;
    }

    public void setContractType(ContactPersonOwnershipType contractType) {
        this.contractType = contractType;
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

    public List<OwnerDto> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<OwnerDto> applicants) {
        this.applicants = applicants;
    }

    public List<AgencyDto> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<AgencyDto> agencies) {
        this.agencies = agencies;
    }

    public List<OppositionRefTrNoDto> getRefTrNoList() {
        return refTrNoList;
    }

    public void setRefTrNoList(List<OppositionRefTrNoDto> refTrNoList) {
        this.refTrNoList = refTrNoList;
    }

    public enum TrwType {
        OPPOSITION("1"), DEBATE("2");

        String number;

        TrwType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum ContactPersonOwnershipType {
        APPLICANT("1"), AGENCY("2"), SUB_AGENCY("4"), OTHER("3");

        private String number;

        ContactPersonOwnershipType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }
}
