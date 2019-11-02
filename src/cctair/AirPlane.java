
package cctair;

/**
 *
 * @author 
 */
public class AirPlane 
{   // Variables used in the Class AirPlane
    private String airplaneNumber;
    private String make;
    private String model;
    private int capacity;
    private Pilot pilot;
    
    // Constructor

    /**
     *
     * @param airplaneNumber
     * @param make
     * @param model
     * @param capacity
     * @param pilot
     */
     public AirPlane(){
        this.airplaneNumber=null;
        this.make=null;
        this.model=null;
        this.capacity=0;
        this.pilot=null;
    }
    public AirPlane(String airplaneNumber, String make, String model, int capacity, Pilot pilot){
        this.airplaneNumber=airplaneNumber;
        this.make=make;
        this.model=model;
        this.capacity=capacity;
        this.pilot=pilot;
    }

    //Method for adding a value to the Airplane Number

    /**
     *
     * @param airplaneNumber
     */
    public void setAirplaneNumber(String airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }
    //Method for adding a value to make

    /**
     *
     * @param make
     */
    public void setmake(String make) {
        this.make = make;
    }
    
    //Method for adding a value to the Model

    /**
     *
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }
    //Method for adding a value to the Capacity

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    //Method for adding a value to the assignPilot

    /**
     *
     * @param pilot
     */
    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
    }
    //Method for visualizing the AirplaneNumber

    /**
     *
     * @return
     */
    public String getAirplaneNumber() {
        return airplaneNumber;
    }
    //Method for visualizing Make

    /**
     *
     * @return
     */
    public String getMake() {
        return make;
    }
    //Method for visualizing Model

    /**
     *
     * @return
     */
    public String getModel() {
        return model;
    }
    //Method for visualizing Capacity

    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }
    //Method for visualizing Pilot

    /**
     *
     * @return
     */
    public Pilot getPilot() {
        return pilot;
    }
    //Method for Printing 
    @Override
    public String toString(){
        return "Aircraft: " + make + model + "\n" +
                " Capacity " + capacity + " seats " + "\n"+ 
                " Pilot: " + pilot;
                
    }
}
