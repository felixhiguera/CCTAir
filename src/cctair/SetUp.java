/*
 * This class is used to create and fill the data structures
 * needed for the program to run.
 * create data structures of completed flights / airplanes / pilots
 */
package cctair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class SetUp 
{
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Pilot> Pilots = new ArrayList<>();
    private ArrayList<AirPlane> AirPlanes = new ArrayList<>();

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<Pilot> getPilots() {
        return Pilots;
    }

    public ArrayList<AirPlane> getAirPlanes() {
        return AirPlanes;
    }
    
    
    // suggestions
    
    // use google to get a list of cities with airports
    // split this info into two Array structures
    public void flights (){
        this.flights.add(new Flight("Dublin","London","12:00","14:00","02/11/19", "Departure",new AirPlane()));
        this.flights.add(new Flight("Dublin","Venecia","15:00","15:00","03/11/19", "Departure",new AirPlane()));
        this.flights.add(new Flight("Dublin","Madrid","17:00","16:00","03/11/19", "Departure",new AirPlane()));
        this.flights.add(new Flight("Dublin","Porto","18:00","17:00","04/11/19", "Departure",new AirPlane()));        
        this.flights.add(new Flight("Mexico","Dublin","9:00","14:00","02/11/19", "Arrival",new AirPlane()));
        this.flights.add(new Flight("Sao Paulo","Dublin","10:00","16:00","03/11/19", "Arrival",new AirPlane()));
        this.flights.add(new Flight("Los Angeles","Dublin","11:00","17:00","03/11/19", "Arrival",new AirPlane()));
        this.flights.add(new Flight("Santiago","Dublin","13:00","18:00","04/11/19", "Arrival",new AirPlane()));
     
    }
    
    public void printFlights(){
        for(Flight f: this.flights){
            System.out.println(f.toString());
        }
    }
    
     public void airCraft(){
        this.AirPlanes.add(new AirPlane("1","Boeing","300",500,new Pilot()));
        this.AirPlanes.add(new AirPlane("2","Airbus","301",510,new Pilot()));
        this.AirPlanes.add(new AirPlane("3","Boeing","302",520,new Pilot()));
        
        this.flights.get(0).setAirPlane(AirPlanes.get(0));
        this.flights.get(1).setAirPlane(AirPlanes.get(1));
        this.flights.get(2).setAirPlane(AirPlanes.get(2));
        this.flights.get(3).setAirPlane(AirPlanes.get(0));
        this.flights.get(4).setAirPlane(AirPlanes.get(1));
        this.flights.get(5).setAirPlane(AirPlanes.get(2));
        this.flights.get(6).setAirPlane(AirPlanes.get(0));
        this.flights.get(7).setAirPlane(AirPlanes.get(1));
      }
     
     public void printAirCraft(){
         for(AirPlane a:this.AirPlanes){
             System.out.println(a.toString());
         }
     }
   
     public void pilots(){
         
         Pilots.add(new Pilot("Enrique Jimenez","1",4.5));
         Pilots.add(new Pilot("Michael James","2",4.8));
         Pilots.add(new Pilot("Fabricio Do Santos","3",4.9));
          
        AirPlanes.get(0).assignPilot(Pilots.get(1));
        AirPlanes.get(1).assignPilot(Pilots.get(0));
        AirPlanes.get(2).assignPilot(Pilots.get(2));

     }
     
     public void printPilots(){
         for(Pilot p:this.Pilots){
             System.out.println(p.toString());
         }
     }
     
      public void createFlight(){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("what is the origin");
            String origin= myObj.nextLine();
          
            System.out.println("what is the destination");
            String destiny= myObj.nextLine();
              
            System.out.println("what is the departure time");
            String departureTime= myObj.nextLine();
              
            System.out.println("what is the arrival Time?");
            String arrivalTime= myObj.nextLine();
           
            System.out.println("what is the date of flight?");
            String dateOfFlight= myObj.nextLine();
           
            System.out.println("Is it departure or arrival?");
            String type= myObj.nextLine();
            System.out.println("what aircraft?");
            String type2= myObj.nextLine();
            for(AirPlane air:AirPlanes){
            if (air.getAirplaneNumber().equalsIgnoreCase(type2)){
            int result = Integer.parseInt(type2);
            this.flights.add(new Flight(origin,destiny,departureTime,arrivalTime,dateOfFlight,type,AirPlanes.get(result)));
            }
            }
      }
     }
  
    // one for origin and one for destination
    // (make sure to have an irish airport as either the origin or destination for each flight)
    
    
    // create an Array to hold names of types of passenger airplanes (google search)
    // create an Array of names to be used for pilots 
    
    // randomly select from these data structures to populate the fields
    // within your objects
    
    // pass these data structures to your Logic class to be used while the 
    // program is running
  
