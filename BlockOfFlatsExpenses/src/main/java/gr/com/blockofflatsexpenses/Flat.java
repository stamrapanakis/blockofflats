/**
 * 
 */
package gr.com.blockofflatsexpenses;

/**
 *
 * @author Stamatis
 */
public class Flat {
    
    private String code;
    
    private Person owner;
    
    private Person tenant;
    
    private double size;
    
    private boolean isClosed = false;
    
    private FlatPercentage expensesPercentage;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isIsClosed() {
        return isClosed;
    }

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public FlatPercentage getExpensesPercentage() {
        return expensesPercentage;
    }

    public void setExpensesPercentage(FlatPercentage expensesPercentage) {
        this.expensesPercentage = expensesPercentage;
    }
}
