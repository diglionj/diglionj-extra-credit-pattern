package client;

import car.SportsCar;
import car.CarDriver;

public class Demo
{
    public static void main(String[] args)
    {
        SportsCar sportsCar = new SportsCar();
        CarDriver driver = new CarDriver(sportsCar);
        driver.start();
        driver.drive();
        driver.turn("Left");
        driver.stop();
    }
}