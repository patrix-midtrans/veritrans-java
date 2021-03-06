package id.co.veritrans.mdk.v1.sample.db.model;

import javax.persistence.*;

/**
 * Created by gde on 5/18/15.
 */
@Entity
@Table(name = "transaction_item")
public class TransactionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "price_each_idr", nullable = false)
    private Long priceEachIdr;

    @Column(name = "total_price_idr", nullable = false)
    private Long totalPriceIdr;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(final Transaction transaction) {
        this.transaction = transaction;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(final Integer amount) {
        this.amount = amount;
    }

    public Long getPriceEachIdr() {
        return priceEachIdr;
    }

    public void setPriceEachIdr(final Long priceEachIdr) {
        this.priceEachIdr = priceEachIdr;
    }

    public Long getTotalPriceIdr() {
        return totalPriceIdr;
    }

    public void setTotalPriceIdr(final Long totalPriceIdr) {
        this.totalPriceIdr = totalPriceIdr;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TransactionItem that = (TransactionItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
