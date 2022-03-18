package lab2b.ownPest;

/** 
 * This class implements the behavior of virtual pests that annoy their
 * owner.

 * @author (Quan)
 * @version (PUT DATE HERE)
 */

public class OwnVirtualPest {

    private String name; // pest name
    private int state; // current state of the pest

    /** 
     * initialize Virtual Pest name and state
     * @param initName the name of the pest
     * @param initState the initial state of the Pest
     */
    public OwnVirtualPest(String initName, int initState) {
        name = initName;
        state = initState;
    }
  
    /** 
     * get the name of the Pest
     * @return the name of the Pest
     */
    public String getName() {
        return name;
    }
  
    /** 
     * get the state of the Pest (as an int)
     * @return the state of the Pest
     */
    public int getIntState() {
        return state;
    }
    
    /** 
     * returns the file name for the Pest image.  The file must be located  
     * in the DemoPest project directory.
     * @return the file name for the Pest image
     */
    public String getFile() {
        return "src/lab2b/ownPest/myImg.jpg";
    }
    
    /** 
     * returns the number of actions that the Pest responds to (NOT including
     * the random action)
     * @return the number of actions
     */
    public int getNumActions() {
        return 3;
    }
    
    /** 
     * return the current state of the Pest (as a String)
     * if the current state is invalid, this method returns "error"
     * @return the current state of the Pest
     */
    public String getState() {
    	//complete this method with your own code
    	String stateString = "";
    	if (state == 1)
    	{
    		stateString = "energetic";
    	}
    	else if (state == 2)
    	{
    		stateString = "tired";
    	}
    	else if (state == 3)
    	{
    		stateString = "hydrated";
    	}
    	else if (state == 4)
    	{
    		stateString = "dehydrated";
    	}
    	else
    	{
    		stateString = "error";
    	}
        
        return stateString;
    }
    
    /** 
     * returns the actionNumth action that can be applied to the Pest 
     * (not including random)
     * if actionNum does not correspond to a valid action, this method returns
     * the empty string ""
     * @param actionNum the number of the requested action
     * @return the name of the actionNumth action
     */
    public String getAction(int actionNum) {
    	//complete this method with your own code
    	String action = "";
    	if (actionNum == 1)
    	{
    		action = "walk";
    	}
    	else if (actionNum == 2)
    	{
    		action = "give water";
    	}
    	else if (actionNum == 3)
    	{
    		action = "give nap";
    	}
        
        return action;
    }
  
    /**
     * return the sound that the pest makes in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest sound in the current state
     */
    public String getPestSound() {
        // replace with your own code
    	String sound = "";
    	if (state == 1)
    	{
    		sound = "WOOF!";
    	}
    	else if (state == 2)
    	{
    		sound = "woof...";
    	}
    	else if (state == 3)		
    	{
    		sound = "slurp";
    	}
    	else if (state == 4)
    	{
    		sound = "hah hah";
    	}
        return sound;
    }
  
    /** 
     * return how the Pest acts in its current state
     * if the state is invalid, this method returns the empty string ""
     * @return the pest action in the current state
     */  
    public String getPestAction() {
        // replace with your own code
    	String action = "";
    	if (state == 1)
    	{
    		action = "running around";
    	}
    	else if (state == 2)
    	{
    		action = "dropping ears";
    	}
    	else if (state == 3)
    	{
    		action = "wagging tail";
    	}
    	else if (state == 4)
    	{
    		action = "panting";
    	}
        return action;
    }

   
   /** 
    * change the state of the Pest in response to the specified owner action 
    * (and also the random action).  If the action is not valid, the state
    * of the pet does not change
    * @param action the action that the Pest responds to 
    */
    public void doAction(int action) {
        // replace with your own code
    	if (state == 1 && action == 1)
    	{
    		state = 4;
    	}
    	else if (state == 1 && action == 0)
    	{
    		state = 2;
    	}
    	else if (state == 2 && action == 3)
    	{
    		state = 1;
    	}
    	else if (state == 3 && action == 1)
    	{
    		state = 2;
    	}
    	else if (state == 3 && action == 3)
    	{
    		state = 1;
    	}
    	else if (state == 3 && action == 0)
    	{
    		state = 4;
    	}
    	else if (state == 4 && action == 2)
    	{
    		state = 3;
    	}
    }

}
