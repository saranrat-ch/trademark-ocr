package th.co.geniustree.trademark.ocr.service.dto;

/**
 * Created by saranrat on 7/6/2560.
 */
public class BirthAgencyDto {

    private AgencyType agencyType;

    private AgencyKind agencyKind;

    private String name;

    private String address;

    private String moo;

    private String soi;

    private String road;

    private String aumpCode;//รหัสอำเภอ สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    private String provCode;//รหัสจังหวัด สถานที่ติดต่อ **ดูจาก table CTLT_LOCATION

    private String tumbonStr;//ชื่อตำบล สถานที่ติดต่อ

    private String postcode;

    private Long countryId;//ID ประเทศ **ดูจาก table CTLT_COUNTRY

    private Long natId;//ID สัญชาติ **ดูจาก table CTLT_NATION

    private Long occuId;//ID อาชีพ **ดูจาก table CTLT_OCCUPATION

    private String phone;

    private String fax;

    private String email;

    private String cardNo;//เลขประจำตัวประชาชน หรือ เลขนิติบุคคล หรือ เลขประจำตัวผู้เสียภาษี

    private AndOrType andOrType;

    private AgencyCardType agencyCardType;

    public AgencyType getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(AgencyType agencyType) {
        this.agencyType = agencyType;
    }

    public AgencyKind getAgencyKind() {
        return agencyKind;
    }

    public void setAgencyKind(AgencyKind agencyKind) {
        this.agencyKind = agencyKind;
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

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getSoi() {
        return soi;
    }

    public void setSoi(String soi) {
        this.soi = soi;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
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

    public AndOrType getAndOrType() {
        return andOrType;
    }

    public void setAndOrType(AndOrType andOrType) {
        this.andOrType = andOrType;
    }

    public AgencyCardType getAgencyCardType() {
        return agencyCardType;
    }

    public void setAgencyCardType(AgencyCardType agencyCardType) {
        this.agencyCardType = agencyCardType;
    }

    public enum AgencyType {
        INDIVIDUAL("1"),CORPORATION("2"), OTHER("3"),GOVERNMENT("5");

        String number;

        AgencyType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum AgencyKind{
        AGENT("1"),SUBAGENT("2");

        String number;

        AgencyKind(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum AndOrType{
        AND("1"),OR("2"),AND_OR("3");

        String number;

        AndOrType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    public enum AgencyCardType {
        INDIVIDUAL("1"), CORPORATION("2"), PASSPORT("3");

        String number;

        AgencyCardType(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

}
