
package cctair;

/**
 *
 * @author 
 */
public class Pilot 
{
    private String name;
    private String ID;
    private double rating;
    
    public Pilot(){
       this.ID = "Null";
       this.name = "Not assigned";
       this.rating = 0.0;
               
    }
    
    public Pilot(String name,String ID, double rating) 
    {
        this.ID=ID;
        this.name = name;
        this.rating = rating;
    }
     

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() 
    {
        return "Pilot{" + "ID=" + ID + " name= " + name + " , rating= " + rating + '}';
    }
    
    
    

    
}
