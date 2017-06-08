package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by apple on 3/22/17.
 */
@Entity
@Table(name = "TRWT_NO01_COMBINE_FILING")
public class TrwtNo01CombineFiling extends BaseEntity implements Serializable {
    @Id
    @SequenceGenerator(sequenceName = "TRWT_NO01_COMBINE_FILING_SEQ", name = "TRWT_NO01_COMBINE_FILING", allocationSize = 1)
    @GeneratedValue(generator = "TRWT_NO01_COMBINE_FILING", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "CARD_TYPE")
    private String cardType;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "ADDR")
    private String addr;

    @Column(name = "POSTCODE")
    private String postcode;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SEQ")
    private Long seq;

    @Column(name = "MOO", length = 64)
    private String moo;

    @Column(name = "SOI", length = 64)
    private String soi;

    @Column(name = "ROAD", length = 64)
    private String road;

    @Column(name = "LOC_CODE")
    private String locCode;

    @ManyToOne
    @JoinColumn(name = "TRWT_NO01_ID")
    private TrwtNo01 trwtNo01;

    @OneToOne
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @OneToOne
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @OneToOne
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @OneToOne
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @OneToOne
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getLocCode() {
        return locCode;
    }

    public void setLocCode(String locCode) {
        this.locCode = locCode;
    }

    public TrwtNo01 getTrwtNo01() {
        return trwtNo01;
    }

    public void setTrwtNo01(TrwtNo01 trwtNo01) {
        this.trwtNo01 = trwtNo01;
    }

    public CtltNation getCtltNation() {
        return ctltNation;
    }

    public void setCtltNation(CtltNation ctltNation) {
        this.ctltNation = ctltNation;
    }

    public CtltOccupation getCtltOccupation() {
        return ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
    }

    public CtltLocation getCtltLocation() {
        return ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public CtltCountry getCtltCountry() {
        return ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public CtltTitle getCtltTitle() {
        return ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public String getMoo() {
        return moo;
    }

    public String getSoi() {
        return soi;
    }

    public String getRoad() {
        return road;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TrwtNo01CombineFiling that = (TrwtNo01CombineFiling) o;

        return Id != null ? Id.equals(that.Id) : that.Id == null;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }
}
