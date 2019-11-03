
package cctair;

/**
 *
 * @author 
 */
public class CCTAir 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        //Make a object type Setup
        SetUp su = new SetUp();
   
        //It is called the method flights in order to get arraylist flights
        su.flights();
        
        //It is called the method airCraft in order to get arraylist airCraft
        su.airCraft();
        //It is called the method Pilots in order to get arraylist Pilots
        su.pilots();
        
       //Make a object type Menu
        Menu myMenu = new Menu(su);
        //It is called the method mainMenu in order to visualize the menu
        myMenu.mainMenu();
        
        
        //b. a method in your Menu class should allow code from your Logic
        //   class to create User Flights (will also use the values from the SetUp Arrays)
        //c / d. access a Flight object and update its field using overloaded methods
        //   that are part of the Flight class (you may decide to allow a user to do this)
        // e. print the list of Flights you have created (use less info about the Flight than the menu option to display Flights)
        
          // e.g.
                /* Flight :  Dublin to London     : departure time : 12:00
                   Flight :  Dublin to Austrialia : departure time : 12:15
                   Flight :  Dublin to Cork       : departure time : 14:00
                   Flight :  NewYork to Dublin    : Arrival   time : 15:30
                 */
    }
    
}
