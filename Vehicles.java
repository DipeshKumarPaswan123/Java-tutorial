import java.io.*;
public class Vehicles {
    void run()
    {
        System.out.println("run() method of base/parrent class");
        System.out.println("is running");
    }

}
class Bike extends Vehicles{
    void run()
    {
        System.out.println("run() method of child/drived class");
        System.out.println("Bike is runnig on 100KM/hrs speed");
    }
}

class All{
    public static void main(String[] args){
        Bike b = new Bike();
        Vehicles v = new Vehicles();

        b.run();
        v.run();

        Vehicles vehicles = new Bike();
        vehicles.run();
    }
}

