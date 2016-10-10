/**
 * 
 */
package gr.com.blockofflatsexpenses;

/**
 *
 * @author Stamatis
 */
public class MonthlyExpense {
    
    private Category sharedExpenses;
    
    private Category elevatorExpenses;
    
    private Category heatingExpenses;
    
    private Category ownersExpenses;

    public MonthlyExpense(Category sharedExpenses, Category elevatorExpenses, Category heatingExpenses, Category ownersExpenses) {
        this.sharedExpenses = sharedExpenses;
        this.elevatorExpenses = elevatorExpenses;
        this.heatingExpenses = heatingExpenses;
        this.ownersExpenses = ownersExpenses;
    }

    public Category getSharedExpenses() {
        return sharedExpenses;
    }

    public void setSharedExpenses(Category sharedExpenses) {
        this.sharedExpenses = sharedExpenses;
    }

    public Category getElevatorExpenses() {
        return elevatorExpenses;
    }

    public void setElevatorExpenses(Category elevatorExpenses) {
        this.elevatorExpenses = elevatorExpenses;
    }

    public Category getHeatingExpenses() {
        return heatingExpenses;
    }

    public void setHeatingExpenses(Category heatingExpenses) {
        this.heatingExpenses = heatingExpenses;
    }

    public Category getOwnersExpenses() {
        return ownersExpenses;
    }

    public void setOwnersExpenses(Category ownersExpenses) {
        this.ownersExpenses = ownersExpenses;
    }
}
