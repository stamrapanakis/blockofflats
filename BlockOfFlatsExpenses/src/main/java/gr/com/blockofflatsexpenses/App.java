/**
 * 
 */
package gr.com.blockofflatsexpenses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stamatis
 */
public class App {
    
    private static BlockOfFlat init() {
        
        BlockOfFlat marathwnos29 = new BlockOfFlat();
        
        // Set the address
        marathwnos29.setAddress("Μαραθώνος 8, Αγία Παρασκευή, Τ.Κ. 15343");
        marathwnos29.setArea("Κοντόπευκο");
        
        // Set the administrator
        Person administrator = new Person("Σ Ρ");
        administrator.setEmail("person@gmail.com");
        administrator.setPhone("8888888888");
        marathwnos29.setAdministrator(administrator);
        
        // Initialize each flat
        Flat a1 = new Flat();
        a1.setCode("Α1");
        a1.setOwner(new Person("Α Χ"));
        a1.setTenant(new Person("Χ Τ"));
        a1.setSize(99.6);
        a1.setExpensesPercentage(new FlatPercentage(0.137, 0.085, 0.137));
        
        Flat a2 = new Flat();
        a2.setCode("Α2");
        a2.setOwner(new Person("Σ Ρ"));
        a2.setSize(104.4);
        a2.setExpensesPercentage(new FlatPercentage(0.151, 0.085, 0.151));
        
        Flat b1 = new Flat();
        b1.setCode("Β1");
        b1.setOwner(new Person("Δ Ε"));
        b1.setSize(99.6);
        b1.setExpensesPercentage(new FlatPercentage(0.137, 0.125, 0.137));
        
        Flat b2 = new Flat();
        b2.setCode("Β2");
        b2.setOwner(new Person("Μ Ι"));
        b2.setSize(104.4);
        b2.setExpensesPercentage(new FlatPercentage(0.147, 0.125, 0.147));

        Flat c1 = new Flat();
        c1.setCode("Γ1");
        c1.setOwner(new Person("Β Κ"));
        c1.setSize(99.6);
        c1.setExpensesPercentage(new FlatPercentage(0.137, 0.180, 0.137));
        
        Flat c2 = new Flat();
        c2.setCode("Γ2");
        c2.setOwner(new Person("Δ Ζ"));
        c2.setTenant(new Person("Σ Π"));
        c2.setSize(104.4);
        c2.setExpensesPercentage(new FlatPercentage(0.147, 0.180, 0.147));
        c2.setIsClosed(true);
        
        Flat d = new Flat();
        d.setCode("Δ");
        d.setOwner(new Person("Κ Σ"));
        d.setSize(107.68);
        d.setExpensesPercentage(new FlatPercentage(0.144, 0.220, 0.148));
        d.setIsClosed(true);
        
        List<Flat> flats = new ArrayList();
        flats.add(a1);
        flats.add(a2);
        flats.add(b1);
        flats.add(b2);
        flats.add(c1);
        flats.add(c2);
        flats.add(d);
        
        marathwnos29.setFlats(flats);
        
        return marathwnos29;
    }
    
    /**
     * 
     * @param blockOfFlat 
     * @param fileName 
     */
    public static void generateJsonFile(BlockOfFlat blockOfFlat, String fileName) {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(blockOfFlat);
        
        Path jsonFile = Paths.get(fileName);
        List<String> lines = new ArrayList();
        lines.add(json);
        try {
            Files.write(jsonFile, lines, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main (String [] args) {
        
        // Set the monthly expenses
        Expense cleaning = new Expense("ΚΑΘΑΡΙΟΤΗΤΑ", 85);
        Expense gardener = new Expense("ΚΗΠΟΥΡΟΣ", 60);
        Expense drains = new Expense("ΑΠΟΧΕΤΕΥΣΗ", 35);
        
        List<Expense> sharedExpenses = new ArrayList();
        sharedExpenses.add(cleaning);
        sharedExpenses.add(gardener);
        sharedExpenses.add(drains);
        
        Category shared = new Category(sharedExpenses, "ΚΟΙΝΟΧΡΗΣΤΑ");
        
        Expense maintenance = new Expense("ΣΥΝΤΗΡΗΣΗ", 55);
        List<Expense> elevatorExpenses = new ArrayList();
        elevatorExpenses.add(maintenance);
        
        Category elevator = new Category(elevatorExpenses, "ΚΟΙΝΟΧΡΗΣΤΑ");
        
        Expense service = new Expense("ΣΥΝΤΗΡΗΣΗ ΚΑΥΣΤΗΡΑ", 100);
        List<Expense> heatingExpenses = new ArrayList();
        heatingExpenses.add(service);
        
        Category heating = new Category(heatingExpenses, "ΘΕΡΜΑΝΣΗ");        
        
        Expense fireExtinguishers = new Expense("ΠΥΡΟΣΒΕΣΤΗΡΕΣ", 78);
        List<Expense> ownersExpenses = new ArrayList();
        ownersExpenses.add(fireExtinguishers);
        
        Category owners = new Category(ownersExpenses, "ΙΔΙΟΚΤΗΤΩΝ");
        
        MonthlyExpense october2016 = new MonthlyExpense(shared, elevator, heating, owners);
        
        // Initialize the block of flats values
        BlockOfFlat marathwnos29 = init();
        marathwnos29.setMonthlyExpense(october2016);
        
        generateJsonFile(marathwnos29, "october2016.json");
    }
    
}
