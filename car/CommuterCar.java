package car;

/** 
* CommuterCar is a concrete implementation of Car.
* It has a lower top speed compared to SportsCar.
*  
* @author Nick Diglio
* @version 06/28/2024
*/
public class CommuterCar implements Car
{
    private boolean isOn;
    private int speed;
    private String direction;
    private static final int TOP_SPEED = 80;
    
    public CommuterCar()
    {
        isOn = false;
        speed = 0;
        direction = "North";
    }
    
    public boolean isOn()
    {
        return isOn;
    }
    public void turnOn()
    {
        isOn = true;
    }
    public void turnOff()
    {
        isOn = false;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void setSpeed(int speed)
    {
        if (speed <= TOP_SPEED)
        {
            this.speed = speed;
        }
    }
    public String getDirection()
    {
        return direction;
    }
    public void setDirection(String direction)
    {
        this.direction = direction;
    }  
}
