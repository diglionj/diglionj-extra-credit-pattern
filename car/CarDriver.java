package car;

/** 
* CarDriver is the abstraction for the bridge pattern.
* The abstraction provides high-level control logic. 
* It relies on the implementation object to do the actual low-level work.
* The CarDriver will operate as the driver of the car.
*
* @author Nick Diglio
* @version 06/28/2024
*/
public class CarDriver 
{
    protected Car car;

    private static final int SPEED_LIMIT = 45;

    public CarDriver(Car car)
    {
        this.car = car;
    }

    public void start()
    {
        if (car.isOn() == true)
        {
            System.out.println("The car is already on.");
        }
        else
        {
            car.turnOn();
            System.out.println("The car is now on.");
        }
    }

    public void drive()
    {
        car.setSpeed(SPEED_LIMIT);
        System.out.printf("Speeding up to %d.\n",SPEED_LIMIT);
    }

    public void brake()
    {   
        car.setSpeed(0);
        System.out.printf("Slowing to %d...\n", car.getSpeed());
    }

    public void turn(String direction)
    {
        if (car.getDirection().equals("North"))
        {
            if (direction.equals("Left"))
            {
                car.setDirection("West");
            }
            else if (direction.equals("Right"))
            {
                car.setDirection("East");
            }
        }
        else if (car.getDirection().equals("South"))
        {
            if (direction.equals("Left"))
            {
                car.setDirection("East");
            }
            else if (direction.equals("Right"))
            {
                car.setDirection("West");
            }
        } 
        else if (car.getDirection().equals("East"))
        {
            if (direction.equals("Left"))
            {
                car.setDirection("South");
            }
            else if (direction.equals("Right"))
            {
                car.setDirection("North");
            }
        }
        else if (car.getDirection().equals("West"))
        {
            if (direction.equals("Left"))
            {
                car.setDirection("North");
            }
            else if (direction.equals("Right"))
            {
                car.setDirection("South");
            }
        }
        System.out.printf("We are now traveling %s.\n", car.getDirection());
    }

    public void stop()
    {
        if (car.getSpeed() != 0)
        {
            brake();
            car.turnOff();
            System.out.println("The car is now off.");
        }
        else
        {
            car.turnOff();
            System.out.println("The car is now off.");
        }
    }

}
