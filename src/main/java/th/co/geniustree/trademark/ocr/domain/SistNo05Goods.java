package th.co.geniustree.trademark.ocr.domain;

// default package
// Generated Jul 19, 2014 2:08:18 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SIST_NO05_GOODS")
public class SistNo05Goods extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8486440680575412734L;

    @Id
    @SequenceGenerator(name = "SIST_NO05_GOODS_SEQ", sequenceName = "SIST_NO05_GOODS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIST_NO05_GOODS_SEQ")
    @Column(name = "GOODS_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long goodsId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NICE_ID", nullable = false)
    private SistNo05Class sistNo05Class;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NICE_CLASS_ID")
    private CtltNiceClass ctltNiceClass;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TR_GOODS_ID")
    private RpstTrGoods rpstTrGoods;

    @Column(name = "GOODS_SERVICES", length = 4000)
    private String goodsServices;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRW_GOODS_ID")
    private TrwtNo05Goods trwtNo05Goods;

    public SistNo05Goods() {
    }

    public SistNo05Goods(Long goodsId, SistNo05Class sistNo05Class) {
        this.goodsId = goodsId;
        this.sistNo05Class = sistNo05Class;
    }

    @Transient
    public Long getPk() {
        return goodsId;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public SistNo05Class getSistNo05Class() {
        return this.sistNo05Class;
    }

    public void setSistNo05Class(SistNo05Class sistNo05Class) {
        this.sistNo05Class = sistNo05Class;
    }

    public CtltNiceClass getCtltNiceClass() {
        return this.ctltNiceClass;
    }

    public void setCtltNiceClass(CtltNiceClass ctltNiceClass) {
        this.ctltNiceClass = ctltNiceClass;
    }

    public RpstTrGoods getRpstTrGoods() {
        return this.rpstTrGoods;
    }

    public void setRpstTrGoods(RpstTrGoods rpstTrGoods) {
        this.rpstTrGoods = rpstTrGoods;
    }

    public String getGoodsServices() {
        return this.goodsServices;
    }

    public void setGoodsServices(String goodsServices) {
        this.goodsServices = goodsServices;
    }

    public TrwtNo05Goods getTrwtNo05Goods() {
        return trwtNo05Goods;
    }

    public void setTrwtNo05Goods(TrwtNo05Goods trwtNo05Goods) {
        this.trwtNo05Goods = trwtNo05Goods;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.goodsId);
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
        final SistNo05Goods other = (SistNo05Goods) obj;
        if (!Objects.equals(this.goodsId, other.goodsId)) {
            return false;
        }
        return true;
    }

}
