package th.co.geniustree.trademark.ocr.domain;

// Generated Oct 6, 2014 10:09:26 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "NIST_MEMBER")
public class NistMember extends BaseEntity implements java.io.Serializable {
    private static final long serialVersionUID = -7666549270078104847L;

    @Id
    @SequenceGenerator(name = "NIST_MEMBER_SEQ", sequenceName = "NIST_MEMBER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NIST_MEMBER_SEQ")
    @Column(name = "MEM_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long memId;

    @Column(name = "MEM_CODE", precision = 22, scale = 0)
    private Long memCode;

    @Column(name = "MEM_TYPE", length = 2)
    private String memType;

    @Column(name = "MEM_NAME", length = 500)
    private String memName;

    @Column(name = "MEM_CARD", length = 40)
    private String memCard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOCATION_ID")
    private CtltLocation ctltLocation;

    @Column(name = "POSTCODE", length = 5)
    private String postCode;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PHONE", length = 100)
    private String phone;

    @Column(name = "FAX", length = 15)
    private String fax;

    @Column(name = "MEM_ADDS", length = 1000)
    private String memAdds;

    @Temporal(TemporalType.DATE)
    @Column(name = "MEM_DATE", length = 7)
    private Date memDate;

    @Column(name = "PRG_CODE", length = 20)
    private String prgCode;

    @Column(name = "LOC_REP_NAME")
    private String locRepName;

    public NistMember() {
    }

    public NistMember(Long memId) {
        this.memId = memId;
    }

    @Transient
    public Long getPk() {
        return memId;
    }

    public Long getMemId() {
        return this.memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public Long getMemCode() {
        return this.memCode;
    }

    public void setMemCode(Long memCode) {
        this.memCode = memCode;
    }

    public String getMemType() {
        return this.memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public String getMemName() {
        return this.memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemCard() {
        return this.memCard;
    }

    public void setMemCard(String memCard) {
        this.memCard = memCard;
    }

    public CtltLocation getCtltLocation() {
        return this.ctltLocation;
    }

    public void setCtltLocation(CtltLocation ctltLocation) {
        this.ctltLocation = ctltLocation;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMemAdds() {
        return this.memAdds;
    }

    public void setMemAdds(String memAdds) {
        this.memAdds = memAdds;
    }

    public Date getMemDate() {
        return this.memDate;
    }

    public void setMemDate(Date memDate) {
        this.memDate = memDate;
    }

    public String getPrgCode() {
        return this.prgCode;
    }

    public void setPrgCode(String prgCode) {
        this.prgCode = prgCode;
    }

    public String getLocRepName() {
        return this.locRepName;
    }

    public void setLocRepName(String locRepName) {
        this.locRepName = locRepName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.memId);
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
        final NistMember other = (NistMember) obj;
        if (!Objects.equals(this.memId, other.memId)) {
            return false;
        }
        return true;
    }


}
