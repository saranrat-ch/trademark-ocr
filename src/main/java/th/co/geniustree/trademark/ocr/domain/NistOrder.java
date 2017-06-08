package th.co.geniustree.trademark.ocr.domain;

// Generated Oct 22, 2014 10:32:09 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "NIST_ORDER")
public class NistOrder extends BaseEntity implements java.io.Serializable {


    private static final long serialVersionUID = -3033248023555033441L;

    @Id
    @SequenceGenerator(name = "NIST_ORDER_SEQ", sequenceName = "NIST_ORDER_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NIST_ORDER_SEQ")
    @Column(name = "ORDER_ID", unique = true, nullable = false, precision = 22, scale = 0)
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEM_ID")
    private NistMember nistMember;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE", length = 7)
    private Date orderDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "PAY_DATE", length = 7)
    private Date payDate;

    @Column(name = "RECEIPT_NO", length = 10)
    private String receiptNo;

    @Column(name = "RECEIPT_BOOK", length = 10)
    private String receiptBook;

    @Column(name = "RECV_TYPE", length = 1)
    private String recvType;

    @Column(name = "TOTAL", precision = 14)
    private BigDecimal total;

    @Column(name = "UPDATE_BY_PRG", length = 20)
    private String updateByPrg;

    @Column(name = "ORDER_NO", nullable = false, precision = 22, scale = 0)
    private Long orderNo;

    public NistOrder() {
    }

    public NistOrder(Long orderId, Long orderNo) {
        this.orderId = orderId;
        this.orderNo = orderNo;
    }

    @Transient
    public Long getPk() {
        return orderId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public NistMember getNistMember() {
        return nistMember;
    }

    public void setNistMember(NistMember nistMember) {
        this.nistMember = nistMember;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getPayDate() {
        return this.payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getReceiptNo() {
        return this.receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getReceiptBook() {
        return this.receiptBook;
    }

    public void setReceiptBook(String receiptBook) {
        this.receiptBook = receiptBook;
    }

    public String getRecvType() {
        return this.recvType;
    }

    public void setRecvType(String recvType) {
        this.recvType = recvType;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getUpdateByPrg() {
        return this.updateByPrg;
    }

    public void setUpdateByPrg(String updateByPrg) {
        this.updateByPrg = updateByPrg;
    }

    public Long getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.orderId);
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
        final NistOrder other = (NistOrder) obj;
        if (!Objects.equals(this.orderId, other.orderId)) {
            return false;
        }
        return true;
    }
}
