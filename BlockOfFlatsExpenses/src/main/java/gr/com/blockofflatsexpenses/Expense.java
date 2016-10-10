/**
 * 
 */
package gr.com.blockofflatsexpenses;

/**
 *
 * @author Stamatis
 */
public class Expense {

    private String description;
    
    private double cost;

    public Expense(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }   
    
}
