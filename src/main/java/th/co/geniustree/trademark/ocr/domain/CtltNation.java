package th.co.geniustree.trademark.ocr.domain;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CTLT_NATION")
public class CtltNation extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 8565714364951238050L;

    @Id
    @SequenceGenerator(name = "CTLT_NATION_SEQ", sequenceName = "CTLT_NATION_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_NATION_SEQ")
    @Column(name = "NAT_ID", unique = true, nullable = false, precision = 15, scale = 0)
	private Long natId;

    @Column(name = "NAT_NAME", nullable = false, length = 150)
	private String natName;

    @Column(name = "NAT_CODE", length = 50)
	private String natCode;

    @Column(name = "ASEAN_FLAG", length = 1)
	private String aseanFlag;

    @Column(name = "USE_FLAG", length = 1)
	private String useFlag;

	public CtltNation() {
	}

	public CtltNation(Long natId) {
		this.natId = natId;
	}

	public Long getNatId() {
		return this.natId;
	}

	public void setNatId(Long natId) {
		this.natId = natId;
	}


	public String getNatName() {
		return this.natName;
	}

	public void setNatName(String natName) {
		this.natName = natName;
	}


	public String getNatCode() {
		return this.natCode;
	}

	public void setNatCode(String natCode) {
		this.natCode = natCode;
	}


	public String getAseanFlag() {
		return this.aseanFlag;
	}

	public void setAseanFlag(String aseanFlag) {
		this.aseanFlag = aseanFlag;
	}


	public String getUseFlag() {
		return this.useFlag;
	}

	public void setUseFlag(String useFlag) {
		this.useFlag = useFlag;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.natId);
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
        final CtltNation other = (CtltNation) obj;
        if (!Objects.equals(this.natId, other.natId)) {
            return false;
        }
        return true;
    }

}
