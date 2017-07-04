package th.co.geniustree.trademark.ocr.service.dto;

import javax.validation.constraints.NotNull;

/**
 * Created by saranrat on 3/7/2560.
 */
public class OppositionRefTrNoDto {

    @NotNull(message = "เลขคำขอต้องไม่เป็นค่าว่าง")
    private Long trNo;

    public Long getTrNo() {
        return trNo;
    }

    public void setTrNo(Long trNo) {
        this.trNo = trNo;
    }
}
