package th.co.geniustree.trademark.ocr.service.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by saranrat on 7/6/2560.
 */
public class NiceClassDto {

    @NotNull(message = "ไม่มีข้อมูลจำพวกสินค้า")
    private Long niceClassId;

    @NotBlank(message = "ไม่มีข้อมูลรายการสินค้า")
    private String niceDetail;

    public Long getNiceClassId() {
        return niceClassId;
    }

    public void setNiceClassId(Long niceClassId) {
        this.niceClassId = niceClassId;
    }

    public String getNiceDetail() {
        return niceDetail;
    }

    public void setNiceDetail(String niceDetail) {
        this.niceDetail = niceDetail;
    }
}
