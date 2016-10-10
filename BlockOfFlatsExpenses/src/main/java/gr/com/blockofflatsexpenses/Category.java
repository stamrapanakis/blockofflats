/**
 * 
 */
package gr.com.blockofflatsexpenses;

import java.util.List;

/**
 *
 * @author Stamatis
 */
public class Category {
    
    private List<Expense> expenses;
    
    private String description;

    /**
     * 
     * @param expenses
     * @param description 
     */
    public Category(List<Expense> expenses, String description) {
        this.expenses = expenses;
        this.description = description;
    }
    
    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
