package th.co.geniustree.trademark.ocr.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@EntityListeners({AuditingEntityListener.class})
@MappedSuperclass
public abstract class BaseEntity {

    private static final Logger log = LoggerFactory.getLogger(BaseEntity.class);

    @Version
    @Column(name = "VERSION", precision = 8, scale = 0)
    private Long version = 1L;

    @Column(name = "CREATE_DATE")
    private LocalDate createDate;

    @Column(name = "CREATE_BY", length = 20)
    private String createBy;

    @Column(name = "UPDATE_DATE")
    private LocalDate updateDate;

    @Column(name = "UPDATE_BY", length = 20)
    private String updateBy;

    protected BaseEntity() {

    }

    @PrePersist
    protected void prePersist() {
        if (createDate == null && createBy == null) {
            createDate = LocalDate.now();
            createBy = "Trademark-Ocr";
        }
        updateDate = LocalDate.now();
        updateBy = "Trademark-Ocr";
    }


    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
