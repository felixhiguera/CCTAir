/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author 
 */
public class Flight 
{   
    //Variables 
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private String type;
    private AirPlane airPlane;

    //Constructor

    /**
     *
     
     */
     public  Flight(){
        this.origin = null;
        this.destination =  null;
        this.departureTime = null;
        this.arrivalTime =null;
        this.dateOfFlight = null;
        this.type = null;
        this.airPlane = null;
        
    }
  public  Flight(String origin, String destination, String departureTime, String arrivalTime, String dateOfFlight, String type, AirPlane airPlane){
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime =arrivalTime;
        this.dateOfFlight = dateOfFlight;
        this.type = type;
        this.airPlane = airPlane;
        
    }

    public AirPlane getAirPlane() {
        return airPlane;
    }

    public void setAirPlane(AirPlane airPlane) {
        this.airPlane = airPlane;
    }
   
    //Method for visualizing Origin

    /**
     *
     * @return
     */
    public String getOrigin() {
        return origin;
    }
    //Method for adding a value to Origin

    /**
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    //Method for visualizing Destination

    /**
     *
     * @return
     */
    public String getDestination() {
        return destination;
    }
    //Method for adding a value Destination

    /**
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    //Method for visualizing Departure Time

    /**
     *
     * @return
     */
    public String getDepartureTime() {
        return departureTime;
    }
    //Method for adding a value to Departure Time

    /**
     *
     * @param departureTime
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    //Method for visualizing arrival time

    /**
     *
     * @return
     */
    public String getArrivalTime() {
        return arrivalTime;
    }
    //Method for adding a value to Arrival Time

    /**
     *
     * @param arrivalTime
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    //Method for visualizing DateOfFlight

    /**
     *
     * @return
     */
    public String getDateOfFlight() {
        return dateOfFlight;
    }
    //Method for adding a value setDateOfFlight

    /**
     *
     * @param dateOfFlight
     */
    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }
    
    //Method that it is used for printing 
    public String toString(){
        return "flight Information: " + "\n" +
        "Date: " + dateOfFlight + "\n" +
        "from: "+ origin +" to "+ destination +"\n" + 
        "flight time: " + departureTime + "\n " +
        "type: " + type + "\n " +
        "Airplane: "+ airPlane +
        "------------------------------------";
                
    } 
    
}
