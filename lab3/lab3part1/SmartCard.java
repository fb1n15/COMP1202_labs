/**
 * SmartCard Class implementation
 * @author Wojciech Rozowski (wk1u18)
 */

public class SmartCard{
    private String ownerName;
    private Boolean isStaff;
    
    //constructor method setting ownerName to a given string
    public SmartCard(String initialName) {
        ownerName = initialName;
        isStaff = false;
    }
    
    //accessor method for ownerName field
    public String getOwner() {
        return ownerName;
    }
    
    //acessor method for isStaff field
    public Boolean isStaff() {
        return isStaff;
    }
    
    //mutator method for isStaff field
    public void setStaff(Boolean newState) {
        isStaff = newState;
    }
    
}
