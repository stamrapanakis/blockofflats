/**
 * 
 */
package gr.com.blockofflatsexpenses;

import java.util.List;

/**
 *
 * @author Stamatis
 */
public class BlockOfFlat {
    
    private String address;
    
    private String area;
    
    private Person administrator;
    
    private List<Flat> flats;

    private MonthlyExpense monthlyExpense;
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Person getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Person administrator) {
        this.administrator = administrator;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    public MonthlyExpense getMonthlyExpense() {
        return monthlyExpense;
    }

    public void setMonthlyExpense(MonthlyExpense monthlyExpense) {
        this.monthlyExpense = monthlyExpense;
    }
}
