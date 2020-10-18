
/**
 * Write a description of class CarBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarBuilder
{
    public Car PrepareWinterCar ()
    {
     Car car = new Car();
     car.addPart(new Winter());
     car.addPart(new DuelExitPipe());
     return car;
    }
    
    public Car PrepareSummerCar ()
    {
     Car car = new Car();
     car.addPart(new Summer());
     car.addPart(new SingleExitPipe());
     return car;       
    }
}
