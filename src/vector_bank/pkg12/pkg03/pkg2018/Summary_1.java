package vector_bank.pkg12.pkg03.pkg2018;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "summary", catalog = "vector_bank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Summary_1.findAll", query = "SELECT s FROM Summary_1 s")
    , @NamedQuery(name = "Summary_1.findByTransactionDetails", query = "SELECT s FROM Summary_1 s WHERE s.transactionDetails = :transactionDetails")
    , @NamedQuery(name = "Summary_1.findByAmount", query = "SELECT s FROM Summary_1 s WHERE s.amount = :amount")
    , @NamedQuery(name = "Summary_1.findById", query = "SELECT s FROM Summary_1 s WHERE s.id = :id")})
public class Summary_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Transaction_Details")
    private String transactionDetails;
    @Basic(optional = false)
    @Column(name = "Amount")
    private long amount;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public Summary_1() {
    }

    public Summary_1(Integer id) {
        this.id = id;
    }

    public Summary_1(Integer id, String transactionDetails, long amount) {
        this.id = id;
        this.transactionDetails = transactionDetails;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        String oldTransactionDetails = this.transactionDetails;
        this.transactionDetails = transactionDetails;
        changeSupport.firePropertyChange("transactionDetails", oldTransactionDetails, transactionDetails);
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        long oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Summary_1)) {
            return false;
        }
        Summary_1 other = (Summary_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vector_bank.pkg12.pkg03.pkg2018.Summary_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
