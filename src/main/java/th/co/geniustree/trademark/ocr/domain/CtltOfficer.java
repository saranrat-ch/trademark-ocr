package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CTLT_OFFICER")
public class CtltOfficer extends BaseEntity implements java.io.Serializable {

    private static final long serialVersionUID = -3113882581208994389L;

    @Id
    @SequenceGenerator(name = "CTLT_OFFICER_SEQ", sequenceName = "CTLT_OFFICER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_OFFICER_SEQ")
    @Column(name = "PERSON_ID", unique = true, nullable = false, precision = 15, scale = 0)
    private Long personId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ORG_ID", nullable = false)
    private CtltOrganize ctltOrganize;

    @Column(name = "PERSON_NAME", nullable = false, length = 150)
    private String personName;

    @Column(name = "POSITON_NAME")
    private String positonName;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    @Column(name = "PERSON_CODE", length = 10)
    private String personCode;

    @Column(name = "PERSON_TYPE", length = 1)
    private String personType;

    @Column(name = "SIGN_FILE", length = 150)
    private String signFile;

    @Column(name = "PERSON_ENG", length = 150)
    private String personEng;

    @Column(name = "POSITION_ENG", length = 255)
    private String positionEng;

    @Column(name = "ORG_ENG", length = 255)
    private String orgEng;

    @Column(name = "DOC_FLAG", length = 1)
    private String docFlag;

    public CtltOfficer() {
    }

    public CtltOfficer(Long personId) {
        this.personId = personId;
    }

    @Transient
    public Long getPk() {
        return personId;
    }

    public Long getPersonId() {
        return this.personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public CtltOrganize getCtltOrganize() {
        return this.ctltOrganize;
    }

    public void setCtltOrganize(CtltOrganize ctltOrganize) {
        this.ctltOrganize = ctltOrganize;
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPositonName() {
        return this.positonName;
    }

    public void setPositonName(String positonName) {
        this.positonName = positonName;
    }

    public String getUseFlag() {
        return this.useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getPersonCode() {
        return this.personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getSignFile() {
        return signFile;
    }

    public void setSignFile(String signFile) {
        this.signFile = signFile;
    }

    public String getPersonEng() {
        return personEng;
    }

    public void setPersonEng(String personEng) {
        this.personEng = personEng;
    }

    public String getPositionEng() {
        return positionEng;
    }

    public void setPositionEng(String positionEng) {
        this.positionEng = positionEng;
    }

    public String getOrgEng() {
        return orgEng;
    }

    public void setOrgEng(String orgEng) {
        this.orgEng = orgEng;
    }

    public String getDocFlag() {
        return docFlag;
    }

    public void setDocFlag(String docFlag) {
        this.docFlag = docFlag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.personId);
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
        final CtltOfficer other = (CtltOfficer) obj;
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        return true;
    }

}
