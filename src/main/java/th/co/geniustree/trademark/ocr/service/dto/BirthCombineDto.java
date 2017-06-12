package th.co.geniustree.trademark.ocr.service.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by saranrat on 12/6/2560.
 */
public class BirthCombineDto {

    @NotNull(message = "ไม่มีข้อมูลประเภทบุคคล ผู้ร่วมใช้")
    private CombineType combineType;

    @NotBlank(message = "ไม่มีข้อมูลชื่อ ผู้ร่วมใช้")
    private String name;

    @NotBlank(message = "ไม่มีข้อมูลที่อยู่ ผู้ร่วมใช้")
    private String address;

    @NotBlank(message = "ไม่มีข้อมูลรหัสอำเภอ ผู้ร่วมใช้")
    private String aumpCode;//รหัสอำเภอ สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลรหัสจังหวัด ผู้ร่วมใช้")
    private String provCode;//รหัสจังหวัด สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลชื่อตำบล ผู้ร่วมใช้")
    private String tumbonStr;//ชื่อตำบล สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลรหัสไปรษณีย์ ผู้ร่วมใช้")
    private String postcode;

    @NotNull(message = "ไม่มีข้อมูลIDสัญชาติ ผู้ร่วมใช้")
    private Long countryId;//ID ประเทศ **ดูจาก table CTLT_COUNTRY

    @NotNull(message = "ไม่มีข้อมูลIDสัญชาติ ผู้ร่วมใช้")
    private Long natId;//ID สัญชาติ **ดูจาก table CTLT_NATION

    @NotNull(message = "ไม่มีข้อมูลIDอาชีพ ผู้ร่วมใช้")
    private Long occuId;//ID อาชีพ **ดูจาก table CTLT_OCCUPATION

    @NotBlank(message = "ไม่มีข้อมูลเบอโทรศัพท์ ผู้ร่วมใช้")
    private String phone;

    private String fax;

    private String email;

    @NotBlank(message = "ไม่มีข้อมูลเลขประจำตัวประชาชน ผู้ร่วมใช้")
    private String cardNo;//เลขประจำตัวประชาชน หรือ เลขนิติบุคคล หรือ เลขประจำตัวผู้เสียภาษี

    @NotNull(message = "ไม่มีข้อมูลประเภทบัตร ผู้ร่วมใช้")
    private CombineCardType combineCardType;

    public CombineType getCombineType() {
        return combineType;
    }

    public void setCombineType(CombineType combineType) {
        this.combineType = combineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getNatId() {
        return natId;
    }

    public void setNatId(Long natId) {
        this.natId = natId;
    }

    public Long getOccuId() {
        return occuId;
    }

    public void setOccuId(Long occuId) {
        this.occuId = occuId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CombineCardType getCombineCardType() {
        return combineCardType;
    }

    public void setCombineCardType(CombineCardType combineCardType) {
        this.combineCardType = combineCardType;
    }

    public enum CombineType {
        INDIVIDUAL("1"), CORPORATION("2"), OTHER("3"),FOREIGN("4"), GOVERNMENT("5");

        String number;

        CombineType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum CombineCardType {
        INDIVIDUAL("1"), CORPORATION("2"), PASSPORT("3");

        String number;

        CombineCardType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

}
