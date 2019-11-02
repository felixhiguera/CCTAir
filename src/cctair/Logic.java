/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Logic 
{
    //

    /**
     *
     * @param flights
     */
    //method for searching a particular flight
    public void searchFlight(ArrayList<Flight> flights){
        System.out.println("Select From");
        Scanner s = new Scanner(System.in);
        String from = s.next();
        Boolean flag = false;
        
        System.out.println("Select To");
        String to = s.next();
        for(Flight fli:flights){
            if (fli.getOrigin().equalsIgnoreCase(from) && fli.getDestination().equalsIgnoreCase(to)){
                System.out.println(fli.toString());
                flag = true;
            }          
        }
        
        if(!flag){
            System.out.println("There is no results!");
        }
        
    }

    /**
     *
     * @param AirPlanes
     */
    
        //method for searching a particular Aircraft

    public void searchAircraft(ArrayList<AirPlane> AirPlanes){
        System.out.println("Select the Airplane number");
        Scanner s = new Scanner(System.in);
        String AN = s.nextLine();
        Boolean flag = false;
        
     
        for(AirPlane air:AirPlanes){
            if (air.getAirplaneNumber().equalsIgnoreCase(AN)){
                System.out.println(air.toString());
                flag = true;
            }          
        }
        
        if(!flag){
            System.out.println("There is no results!");
        }
        
    }

    /**
     *
     * @param Pilots
     */
    
        //method for searching a particular Pilot

    public void searchPilot(ArrayList<Pilot> Pilots){
        System.out.println("Select the ID");
        Scanner s = new Scanner(System.in);
        String ID = s.nextLine();
        Boolean flag = false;
        
     
        for(Pilot pil:Pilots){
            if (pil.getID().equalsIgnoreCase(ID)){
                System.out.println(pil.toString());
                flag = true;
            }          
        }
        
        if(!flag){
            System.out.println("There is no results!");
        }
        
    }
     
}
