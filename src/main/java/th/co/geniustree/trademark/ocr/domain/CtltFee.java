package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CTLT_FEE")
@Cacheable
public class CtltFee extends BaseEntity implements java.io.Serializable{

    private static final long serialVersionUID = -3007224392088779821L;

    @Id
    @SequenceGenerator(name = "CTLT_FEE_SEQ", sequenceName = "CTLT_FEE_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTLT_FEE_SEQ")
    @Column(name = "FEE_ID", nullable = false, precision = 15, scale = 0)
    private Long feeId;

    @Column(name = "FEE_CODE", length = 3)
    private String feeCode;

    @Column(name = "FEE_NAME", length = 150)
    private String feeName;

    private BigDecimal feeCost;

    @Column(name = "CALREC_FLAG", length = 1)
    private String calrecFlag;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    @Column(name = "FEE_REMARK")
    private String feeRemark;

    @Column(name = "OLD_FEE_CODE", length = 2)
    private String oldFeeCode;

    @Column(name = "FEE_TYPE", length = 1)
    private String feeType;

    @Column(name = "FORM_TYPE", length = 5)
    private String formType;

    @Column(name = "REGIS_TYPE", length = 1)
    private String regisType;

    @Column(name = "INC", length = 4)
    private String inc;

    /* Add Since 2559 */

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "fee")
    private List<CtltFeeCost> costs;

    /* Add Since 2559 */
    public CtltFee() {
    }

    public CtltFee(Long feeId) {
        this.feeId = feeId;
    }

    public CtltFee(Long feeId, String feeCode) {
        super();
        this.feeId = feeId;
        this.feeCode = feeCode;
    }


    @Transient
    public Long getPk() {
        return feeId;
    }

    public Long getFeeId() {
        return this.feeId;
    }

    public void setFeeId(Long feeId) {
        this.feeId = feeId;
    }

    public String getFeeCode() {
        return this.feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeName() {
        return this.feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    //@Column(name = "FEE_COST", precision = 10)
    @Transient
    public BigDecimal getFeeCost() {
        return this.feeCost;
    }

    public void setFeeCost(BigDecimal feeCost) {
        this.feeCost = feeCost;
    }


    public String getCalrecFlag() {
        return this.calrecFlag;
    }

    public void setCalrecFlag(String calrecFlag) {
        this.calrecFlag = calrecFlag;
    }

    public String getUseFlag() {
        return this.useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getFeeRemark() {
        return this.feeRemark;
    }

    public void setFeeRemark(String feeRemark) {
        this.feeRemark = feeRemark;
    }

    public String getOldFeeCode() {
        return this.oldFeeCode;
    }

    public void setOldFeeCode(String oldFeeCode) {
        this.oldFeeCode = oldFeeCode;
    }

    public String getFeeType() {
        return this.feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getRegisType() {
        return regisType;
    }

    public void setRegisType(String regisType) {
        this.regisType = regisType;
    }

    public String getInc() {
        return inc;
    }

    public void setInc(String inc) {
        this.inc = inc;
    }

    public List<CtltFeeCost> getCosts() {

        if (costs == null) {
            costs = new ArrayList<>();
        }

        return costs;
    }

    public void setCosts(List<CtltFeeCost> costs) {
        this.costs = costs;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.feeId);
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
        final CtltFee other = (CtltFee) obj;
        if (!Objects.equals(this.feeId, other.feeId)) {
            return false;
        }
        return true;
    }
}
