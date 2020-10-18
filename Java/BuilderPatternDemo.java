
/**
 * Write a description of class BuilderPatternDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BuilderPatternDemo
{
    public static void main(String[] args) 
    {
        CarBuilder carBuilder = new CarBuilder();
        
        Car WinterCar = carBuilder.PrepareWinterCar();
        System.out.println("Winter Car");
        WinterCar.showParts();
        System.out.println("Total Cost: " + WinterCar.getCost());
        
        
        Car SummerCar = carBuilder.PrepareSummerCar();
        System.out.println("Summer Car");
        SummerCar.showParts();
        System.out.println("Total Cost: " + SummerCar.getCost());
    }
}
