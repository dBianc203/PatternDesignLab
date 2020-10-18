import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private List<Part> parts = new ArrayList<Part>();
    
    public void addPart(Part part)
    {
     parts.add(part);   
    }
    public float getCost(){
     float cost = 0.0f;
     
     for (Part part : parts) 
        {
         cost += part.price();
        }
        return cost;
    }
    public void showParts(){
        for (Part part : parts) {
            System.out.print("Part : " + part.name());
            System.out.println(", Price : " + part.price());
        
        }
    }
}