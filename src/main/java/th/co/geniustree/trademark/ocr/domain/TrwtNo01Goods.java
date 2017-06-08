package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO01_GOODS")
public class TrwtNo01Goods extends BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "TRWT_NO01_GOODS_SEQ", sequenceName = "TRWT_NO01_GOODS_SEQ" ,allocationSize = 1)
    @GeneratedValue(generator = "TRWT_NO01_GOODS_SEQ" , strategy = GenerationType.SEQUENCE)
    @Column(name = "TRW_GOODS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long trwGoodsId;

    @ManyToOne
    @JoinColumn(name = "TRW_NICE_CLASS_ID", nullable = false)
    private TrwtNo01Nice trwtNo01Nice;

    @ManyToOne
    @JoinColumn(name = "NICE_CLASS_ID", nullable = false)
    private CtltNiceClass ctltNiceClass;

    @Column(name = "NICE_CLASS_CODE", length = 2)
    private String niceClassCode;

    @Column(name = "GOODS_SERVICES", length = 500)
    private String goodsServices;

    public Long getTrwGoodsId() {
        return trwGoodsId;
    }

    public void setTrwGoodsId(Long trwGoodsId) {
        this.trwGoodsId = trwGoodsId;
    }

    public TrwtNo01Nice getTrwtNo01Nice() {
        return trwtNo01Nice;
    }

    public void setTrwtNo01Nice(TrwtNo01Nice trwtNo01Nice) {
        this.trwtNo01Nice = trwtNo01Nice;
    }

    public CtltNiceClass getCtltNiceClass() {
        return ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public String getNiceClassCode() {
        return niceClassCode;
    }

    public void setNiceClassCode(String niceClassCode) {
        this.niceClassCode = niceClassCode;
    }

    public String getGoodsServices() {
        return goodsServices;
    }

    public void setGoodsServices(String goodsServices) {
        this.goodsServices = goodsServices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtNo01Goods that = (TrwtNo01Goods) o;
        return Objects.equals(trwGoodsId, that.trwGoodsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trwGoodsId);
    }
}
