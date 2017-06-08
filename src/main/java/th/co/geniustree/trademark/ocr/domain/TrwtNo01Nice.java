package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO01_NICE")
public class TrwtNo01Nice extends BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "TRWT_NO01_NICE_SEQ", sequenceName = "TRWT_NO01_NICE_SEQ",allocationSize = 1)
    @GeneratedValue(generator = "TRWT_NO01_NICE_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "TRW_NICE_CLASS_ID", unique = true, nullable = false, precision = 22)
    private Long trwNiceClassId;

    @ManyToOne
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @ManyToOne
    @JoinColumn(name = "TRW_NO01_ID", nullable = false)
    private TrwtNo01 trwtNo01;

    @Column(name = "TRW_NO01_TYPE")
    private String trwNo01Type;

    @Column(name = "USE_STATUS", length = 1)
    private String useStatus;

    @Column(name = "TRW_LIST", precision = 22)
    private Long trwList;

    public Long getTrwNiceClassId() {
        return trwNiceClassId;
    }

    public void setTrwNiceClassId(Long trwNiceClassId) {
        this.trwNiceClassId = trwNiceClassId;
    }

    public CtltNiceClass getCtltNiceClass() {
        return ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public TrwtNo01 getTrwtNo01() {
        return trwtNo01;
    }

    public void setTrwtNo01(TrwtNo01 trwtNo01) {
        this.trwtNo01 = trwtNo01;
    }

    public String getTrwNo01Type() {
        return trwNo01Type;
    }

    public void setTrwNo01Type(String trwNo01Type) {
        this.trwNo01Type = trwNo01Type;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }

    public Long getTrwList() {
        return trwList;
    }

    public void setTrwList(Long trwList) {
        this.trwList = trwList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtNo01Nice that = (TrwtNo01Nice) o;
        return Objects.equals(trwNiceClassId, that.trwNiceClassId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trwNiceClassId);
    }
}
