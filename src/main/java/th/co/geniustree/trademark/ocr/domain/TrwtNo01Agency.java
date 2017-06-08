package th.co.geniustree.trademark.ocr.domain;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO01_AGENCY")
public class TrwtNo01Agency extends BaseEntity implements Serializable  {

    @Id
    @SequenceGenerator(name = "TRWT_NO01_AGENCY_SEQ", sequenceName = "TRWT_NO01_AGENCY_SEQ" , allocationSize = 1)
    @GeneratedValue(generator = "TRWT_NO01_AGENCY_SEQ" , strategy = GenerationType.SEQUENCE)
    @Column(name = "AGENCY_ID", precision = 15)
    private Long agencyId;

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    private CtltTitle ctltTitle;

    @ManyToOne
    @JoinColumn(name = "LOC_ID")
    private CtltLocation ctltLocation;

    @ManyToOne
    @JoinColumn(name = "OCCU_ID")
    private CtltOccupation ctltOccupation;

    @ManyToOne
    @JoinColumn(name = "TRW_NO01_ID")
    private TrwtNo01 trwtNo01;

    @ManyToOne
    @JoinColumn(name = "NAT_ID")
    private CtltNation ctltNation;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private CtltCountry ctltCountry;

    @Column(name = "AGENCY_TYPE", length = 1)
    private String agencyType;

    @Column(name = "AGENCY_NAME", length = 150)
    private String agencyName;

    @Column(name = "AGENCY_SURNAME", length = 150)
    private String agencySurname;

    @Column(name = "AGENCY_CARDID", length = 50)
    private String agencyCardid;

    @Column(name = "AGENCY_ADDR", length = 150)
    private String agencyAddr;

    @Column(name = "AGENCY_SOI", length = 150)
    private String agencySoi;

    @Column(name = "AGENCY_ROAD", length = 150)
    private String agencyRoad;

    @Column(name = "AGENCY_POSTCODE", length = 10)
    private String agencyPostcode;

    @Column(name = "AGENCY_PHONE", length = 50)
    private String agencyPhone;

    @Column(name = "AGENCY_FAX", length = 50)
    private String agencyFax;

    @Column(name = "AGENCY_EMAIL", length = 150)
    private String agencyEmail;

    @Column(name = "USE_STATUS", length = 1)
    private String useStatus;

    @Column(name = "AGENCY_MOO", length = 150)
    private String agencyMoo;

    @Column(name = "AND_OR_TYPE", length = 1)
    private String andOrType;

    @Column(name = "AGEN_KIND", length = 1)
    private String agenKind;

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public CtltTitle getCtltTitle() {
        return ctltTitle;
    }

    public void setCtltTitle(CtltTitle ctltTitle) {
        this.ctltTitle = ctltTitle;
    }

    public CtltLocation getCtltLocation() {
        return ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public CtltOccupation getCtltOccupation() {
        return ctltOccupation;
    }

    public void setCtltOccupation(CtltOccupation ctltOccupation) {
        this.ctltOccupation = ctltOccupation;
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

    public CtltCountry getCtltCountry() {
        return ctltCountry;
    }

    public void setCtltCountry(CtltCountry ctltCountry) {
        this.ctltCountry = ctltCountry;
    }

    public String getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(String agencyType) {
        this.agencyType = agencyType;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencySurname() {
        return agencySurname;
    }

    public void setAgencySurname(String agencySurname) {
        this.agencySurname = agencySurname;
    }

    public String getAgencyCardid() {
        return agencyCardid;
    }

    public void setAgencyCardid(String agencyCardid) {
        this.agencyCardid = agencyCardid;
    }

    public String getAgencyAddr() {
        return agencyAddr;
    }

    public void setAgencyAddr(String agencyAddr) {
        this.agencyAddr = agencyAddr;
    }

    public String getAgencySoi() {
        return agencySoi;
    }

    public void setAgencySoi(String agencySoi) {
        this.agencySoi = agencySoi;
    }

    public String getAgencyRoad() {
        return agencyRoad;
    }

    public void setAgencyRoad(String agencyRoad) {
        this.agencyRoad = agencyRoad;
    }

    public String getAgencyPostcode() {
        return agencyPostcode;
    }

    public void setAgencyPostcode(String agencyPostcode) {
        this.agencyPostcode = agencyPostcode;
    }

    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    public String getAgencyFax() {
        return agencyFax;
    }

    public void setAgencyFax(String agencyFax) {
        this.agencyFax = agencyFax;
    }

    public String getAgencyEmail() {
        return agencyEmail;
    }

    public void setAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public String getAgencyMoo() {
        return agencyMoo;
    }

    public void setAgencyMoo(String agencyMoo) {
        this.agencyMoo = agencyMoo;
    }

    public String getAndOrType() {
        return andOrType;
    }

    public void setAndOrType(String andOrType) {
        this.andOrType = andOrType;
    }

    public String getAgenKind() {
        return agenKind;
    }

    public void setAgenKind(String agenKind) {
        this.agenKind = agenKind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtNo01Agency that = (TrwtNo01Agency) o;
        return Objects.equals(agencyId, that.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId);
    }
}
