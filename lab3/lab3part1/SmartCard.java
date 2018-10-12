/**
 * SmartCard Class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

public class SmartCard{
    private String ownerName;
    private Boolean isStaff;
    
    //Constructor method setting ownerName to a given string
    public SmartCard(String initialName) {
        ownerName = initialName;
        isStaff = false;
    }
    
    //Accessor method for ownerName field
    public String getOwner() {
        return ownerName;
    }
    
    //Acessor method for isStaff field
    public Boolean isStaff() {
        return isStaff;
    }
    
    //Mutator method for isStaff field
    public void setStaff(Boolean newState) {
        isStaff = newState;
    }
    
}
