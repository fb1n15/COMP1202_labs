
/**
 * Implementation of CardLock class for part2 of lab3
 *
 * @author Wojciech Rozowski (wkr1u18)
 */
public class CardLock {
    private SmartCard lastSeen = null;
    private Boolean isStudentAccessible = false;
    
    //Mutator method for lastSeen instance variable
    public void swipeCard (SmartCard recentCard) {
        lastSeen = recentCard;
    }
    
    //Mutator method for isStudentAccessible instance variable
    public void toggleStudentAccess() {
        isStudentAccessible = !isStudentAccessible; //Toggle the state by assigning variable its logical negation
    }
    
    //accessor method to lastSeen instance variable
    public SmartCard getLastCardSeen() {
        return lastSeen;
    }
    
    //This method returns true, if recently swiped card was staff's card or this CardLock is student accessible and last seen card was student's card
    public Boolean isUnlocked() {
        if ((!lastSeen.isStaff()&&isStudentAccessible)||(lastSeen.isStaff())) {
		return true;
	}
	else
	{
		return false; //If last card was student's card and the door lock is not student accessible or someone tried to check the state before first card swipe
	}
    }

}
