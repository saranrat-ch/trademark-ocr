package th.co.geniustree.trademark.ocr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TRWT_NO01_LANG")
public class TrwtNo01Lang extends BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "TRWT_NO01_LANG_SEQ", sequenceName = "TRWT_NO01_LANG_SEQ")
    @GeneratedValue(generator = "TRWT_NO01_LANG_SEQ")
    @Column(name = "TRW_LANG_ID", unique = true, nullable = false, precision = 22)
    private Long trwLangId;

    @ManyToOne
    @JoinColumn(name = "TRW_NO01_ID")
    private TrwtNo01 trwtNo01;

    @Column(name = "TRW_READ", length = 150)
    private String trwRead;

    @Column(name = "TRW_LANG", length = 2)
    private String trwLang;

    @Column(name = "TRW_LANG_DESC", length = 150)
    private String trwLangDesc;

    @Column(name = "TRW_PIC_WORD", length = 150)
    private String trwPicWord;

    public Long getTrwLangId() {
        return trwLangId;
    }

    public void setTrwLangId(Long trwLangId) {
        this.trwLangId = trwLangId;
    }

    public TrwtNo01 getTrwtNo01() {
        return trwtNo01;
    }

    public void setTrwtNo01(TrwtNo01 trwtNo01) {
        this.trwtNo01 = trwtNo01;
    }

    public String getTrwRead() {
        return trwRead;
    }

    public void setTrwRead(String trwRead) {
        this.trwRead = trwRead;
    }

    public String getTrwLang() {
        return trwLang;
    }

    public void setTrwLang(String trwLang) {
        this.trwLang = trwLang;
    }

    public String getTrwLangDesc() {
        return trwLangDesc;
    }

    public void setTrwLangDesc(String trwLangDesc) {
        this.trwLangDesc = trwLangDesc;
    }

    public String getTrwPicWord() {
        return trwPicWord;
    }

    public void setTrwPicWord(String trwPicWord) {
        this.trwPicWord = trwPicWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrwtNo01Lang that = (TrwtNo01Lang) o;
        return Objects.equals(trwLangId, that.trwLangId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trwLangId);
    }
}
