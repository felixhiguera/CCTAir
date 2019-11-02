/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;


import java.util.Scanner;

/**
 *
 * @author 
 */
public class Menu 
{
    private SetUp setup;
    // suggestions 

    /**
     *
     * @param su
     */
    //Constructor to bring the value from su 
    public Menu(SetUp su){
        this.setup = su;
    }
    
    /**
     *
     */
    //method to entry the menu and giving the options from 1 to 8 
    public void mainMenu()
    {   
        int choiceentry = 0;
    
        while(choiceentry!=8){
            if(choiceentry!=0){
                System.out.println("Press enter to continue");
                Scanner s = new Scanner(System.in);
                s.nextLine();
            }
            
            System.out.println("Enter one of the following commands");
            System.out.println(" Press 1 Display all flights on the System");
            System.out.println("Press 2 Allow a user to view a particular flight");
            System.out.println("Press 3 Allow a user to view all available aircraft");
            System.out.println("Press 4 Allow a user to view a particular aircraft");
            System.out.println("Press 5 Allow a user to view all pilots");
            System.out.println("Press 6 Allow a user to view a particular pilot");
            System.out.println("Press 7 Allow a user to create a flight");
            System.out.println("Press 8 End of the program");
            Scanner scanchoice = new Scanner(System.in);
             choiceentry = scanchoice.nextInt();
             switch (choiceentry){
                 case 1:
                     //showing the flights
                     this.setup.printFlights();
                     break;
                 case 2:
                     //
                     Logic l = new Logic();
                     l.searchFlight(this.setup.getFlights());
                     break;
                 case 3:
                     this.setup.printAirCraft();
                   
                     break;
                 case 4:
                     Logic lo = new Logic();
                     lo.searchAircraft(this.setup.getAirPlanes());
                     break;
                 case 5:
                   this.setup.printPilots();
                     
                     break;
                 case 6:
                     Logic lu = new Logic();
                     lu.searchPilot(this.setup.getPilots());
                     break;
                 case 7:
                     this.setup.createFlight();
                     break;
                 case 8:
                      System.out.println("End of the program");
                            System.exit(0);
                        default:
                       System.out.println(choiceentry+ " is not a valid Menu Option! Please Select Another.");
         }
          

        }
    }
   
}
