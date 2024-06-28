package car;

/** 
* Car interface is the implementation for the bridge pattern.
* The implementation declares the interface 
* that’s common for all concrete implementations.
*
* @author Nick Diglio
* @version 06/28/2024 
*/
public interface Car
{
    public boolean isOn();
    public void turnOn();
    public void turnOff();
    public int getSpeed();
    public void setSpeed(int speed);
    public String getDirection();
    public void setDirection(String direction);
}
