package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CTLT_NICE_GOODS")
public class CtltNiceGoods extends BaseEntity implements Serializable {

    @Id
    @Column(name = "NICE_GOODS_ID")
    private Long niceGoodsId;

    @Column(name = "NICE_CLASS_ID")
    private Long niceClassId;

    @Column(name = "NICE_CLASS_CODE", length = 2)
    private String niceClassCode;

    @Column(name = "NICE_GOODS_TNAME", length = 1000)
    private String niceGoodsTname;

    @Column(name = "USE_FLAG", length = 1)
    private String useFlag;

    public Long getNiceGoodsId() {
        return niceGoodsId;
    }

    public Long getNiceClassId() {
        return niceClassId;
    }

    public String getNiceClassCode() {
        return niceClassCode;
    }

    public String getNiceGoodsTname() {
        return niceGoodsTname;
    }

    public String getUseFlag() {
        return useFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CtltNiceGoods that = (CtltNiceGoods) o;
        return Objects.equals(niceGoodsId, that.niceGoodsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(niceGoodsId);
    }
}
