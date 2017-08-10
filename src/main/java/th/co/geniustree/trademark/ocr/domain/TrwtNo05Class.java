package th.co.geniustree.trademark.ocr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO05_CLASS")
public class TrwtNo05Class extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -3748395942743720565L;

    @Id
    @SequenceGenerator(name = "TRWT_NO05_CLASS_SEQ", sequenceName = "TRWT_NO05_CLASS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRWT_NO05_CLASS_SEQ")
    @Column(name = "TRW_CLASS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trwClassId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TR_CLASS_ID")
    private RpstTrClass rpstTrClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_NO05_ID", nullable = false)
    private TrwtNo05 trwtNo05;

    @Column(name = "SEQ_NO", precision = 22, scale = 0)
    private Long seqNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @Column(name = "NICE_CLASS_CODE", length = 2)
    private String niceClassCode;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "trwtNo05Class",orphanRemoval = true)
    private List<TrwtNo05Goods> trwtNo05Goodses;

    public Long getTrwClassId() {
        return this.trwClassId;
    }

    public void setTrwClassId(Long trwClassId) {
        this.trwClassId = trwClassId;
    }

    public RpstTrClass getRpstTrClass() {
        return this.rpstTrClass;
    }

    public void setRpstTrClass(RpstTrClass rpstTrClass) {
        this.rpstTrClass = rpstTrClass;
    }

    public TrwtNo05 getTrwtNo05() {
        return this.trwtNo05;
    }

    public void setTrwtNo05(TrwtNo05 trwtNo05) {
        this.trwtNo05 = trwtNo05;
    }

    public Long getSeqNo() {
        return this.seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public CtltNiceClass getCtltNiceClass() {
        return this.ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public String getNiceClassCode() {
        return this.niceClassCode;
    }

    public void setNiceClassCode(String niceClassCode) {
        this.niceClassCode = niceClassCode;
    }


    public List<TrwtNo05Goods> getTrwtNo05Goodses() {
        return trwtNo05Goodses;
    }

    public void setTrwtNo05Goodses(List<TrwtNo05Goods> trwtNo05Goodses) {
        this.trwtNo05Goodses = trwtNo05Goodses;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.trwClassId);
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
        final TrwtNo05Class other = (TrwtNo05Class) obj;
        if (!Objects.equals(this.trwClassId, other.trwClassId)) {
            return false;
        }
        return true;
    }

}
