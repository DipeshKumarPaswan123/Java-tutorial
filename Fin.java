public class Fin {
    final int speed = 50;
    void speed(){
        System.out.println("The car is running on the speed of " + speed);
    }
    public static void main(String[] args){
        int speed = 100;
        Fin fin = new Fin();
        fin.speed();
    }
}