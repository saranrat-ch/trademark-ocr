package th.co.geniustree.trademark.ocr.service.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by saranrat on 7/6/2560.
 */
public class OwnerDto {

    @NotNull(message = "ไม่มีข้อมูลประเภทบุคคล เจ้าของ")
    private OwnerType ownerType;

    @NotBlank(message = "ไม่มีข้อมูลชื่อ เจ้าของ")
    private String name;

    @NotBlank(message = "ไม่มีข้อมูลที่อยู่ เจ้าของ")
    private String address;

    @NotBlank(message = "ไม่มีข้อมูลรหัสอำเภอ เจ้าของ")
    private String aumpCode;//รหัสอำเภอ สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลรหัสจังหวัด เจ้าของ")
    private String provCode;//รหัสจังหวัด สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    @NotBlank(message = "ไม่มีข้อมูลชื่อตำบล เจ้าของ")
    private String tumbonStr;//ชื่อตำบล สถานที่ติดต่อ

    @NotBlank(message = "ไม่มีข้อมูลรหัสไปรษณีย์ เจ้าของ")
    private String postcode;

    @NotNull(message = "ไม่มีข้อมูลIDประเทศ เจ้าของ")
    private Long countryId;//ID ประเทศ **ดูจาก table CTLT_COUNTRY

    @NotNull(message = "ไม่มีข้อมูลIDสัญชาติ เจ้าของ")
    private Long natId;//ID สัญชาติ **ดูจาก table CTLT_NATION

    @NotNull(message = "ไม่มีข้อมูลIDอาชีพ เจ้าของ")
    private Long occuId;//ID อาชีพ **ดูจาก table CTLT_OCCUPATION

    @NotBlank(message = "ไม่มีข้อมูลเบอร์โทรศัพท์ เจ้าของ")
    private String phone;

    private String fax;

    private String email;

    @NotBlank(message = "ไม่มีข้อมูลเลขประจำตัวประชาชน เจ้าของ")
    private String cardNo;//เลขประจำตัวประชาชน หรือ เลขนิติบุคคล หรือ เลขประจำตัวผู้เสียภาษี

    @NotNull(message = "ไม่มีข้อมูลประเภทบัตร เจ้าของ")
    private OwnerCardType ownerCardType;

    public OwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerType ownerType) {
        this.ownerType = ownerType;
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

    public OwnerCardType getOwnerCardType() {
        return ownerCardType;
    }

    public void setOwnerCardType(OwnerCardType ownerCardType) {
        this.ownerCardType = ownerCardType;
    }

    public enum OwnerCardType {
        INDIVIDUAL("1"), CORPORATION("2"), PASSPORT("3");

        String number;

        OwnerCardType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }


    public enum OwnerType {
        INDIVIDUAL("1"), CORPORATION("2"),OTHER("3"), FOREIGN("4"), GOVERNMENT("5");

        String number;

        OwnerType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }
}
