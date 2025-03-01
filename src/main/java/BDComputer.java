import java.util.ArrayList;
import java.util.List;

public class BDComputer {
     // index used to 
    public static int editIndex;
    
    // Creates computers list
    public static List<Computer> computers = new ArrayList<>();   
    
   // Creates new singleton class 'BDComputerl'
    private static BDComputer bdInstance;
    public BDComputer() {}
    public static BDComputer bdInstance() {
        if (bdInstance == null){
            bdInstance = new BDComputer();
        }
        return bdInstance;
    }
}
