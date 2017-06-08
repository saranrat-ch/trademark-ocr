package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CTLT_TITLE", uniqueConstraints = {@UniqueConstraint(columnNames = "TITLE_NAME")})
public class CtltTitle extends BaseEntity implements Serializable {

    @Id
    @Column(name = "TITLE_ID")
    private Long titleId;

    @Column(name = "TITLE_NAME")
    private String titleName;

    @Column(name = "TITLE_ABBR")
    private String titleAbbr;

    @Column(name = "USE_FLAG")
    private String useFlag;

    public Long getTitleId() {
        return titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getTitleAbbr() {
        return titleAbbr;
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
        CtltTitle ctltTitle = (CtltTitle) o;
        return Objects.equals(titleId, ctltTitle.titleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleId);
    }
}
