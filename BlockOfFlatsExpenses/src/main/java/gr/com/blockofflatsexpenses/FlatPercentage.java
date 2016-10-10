/**
 * 
 */
package gr.com.blockofflatsexpenses;

/**
 *
 * @author Stamatis
 */
public class FlatPercentage {
    
    private double sharedPercentage;
    
    private double elevatorPercentage;
    
    private double heatingPercentage;

    /**
     * 
     * @param sharedPercentage
     * @param elevatorPercentage
     * @param heatingPercentage 
     */
    public FlatPercentage(double sharedPercentage, double elevatorPercentage, double heatingPercentage) {
        this.sharedPercentage = sharedPercentage;
        this.elevatorPercentage = elevatorPercentage;
        this.heatingPercentage = heatingPercentage;
    }   

    public double getSharedPercentage() {
        return sharedPercentage;
    }

    public void setSharedPercentage(double sharedPercentage) {
        this.sharedPercentage = sharedPercentage;
    }

    public double getElevatorPercentage() {
        return elevatorPercentage;
    }

    public void setElevatorPercentage(double elevatorPercentage) {
        this.elevatorPercentage = elevatorPercentage;
    }

    public double getHeatingPercentage() {
        return heatingPercentage;
    }

    public void setHeatingPercentage(double heatingPercentage) {
        this.heatingPercentage = heatingPercentage;
    }
    
}
