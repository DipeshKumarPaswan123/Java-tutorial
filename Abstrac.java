// Code has been written by Dipesh KUmar
abstract class Abstrac { //Abstract class which declared by the abstract keywod

    abstract void start(); //If the class is abstract then we have to make methods also abstract methods by abstract keyword
     //If the class is abstract then we have to make methods also abstract methods by abstract keyword
    abstract void run();
}
class Car extends Abstrac
{
    void start()
    {
        System.out.println("Car start with Key ");
    }
    void run()
    {
        System.out.println("Car is running on 100/kmh");
    }
}
class Scooty extends Abstrac
{
    void start()
    {
        System.out.println("Scooty starts by hitting the Kick");
    }
    void run()
    {
        System.out.println("Scooty is running on 50/kmh");
    }
    public static void main(String[] args)
    {
        System.out.println("This is the features of the car");
        Car c = new Car();
        c.start();
        c.run();
        System.out.println("");

        System.out.println("Features of the Scooty");
        Scooty sc = new Scooty();
        sc.start();
        sc.run();
    }
}
