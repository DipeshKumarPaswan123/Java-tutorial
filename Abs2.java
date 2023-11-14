import org.w3c.dom.ls.LSOutput;

/*
 * Author: Dipesh Kumar Paswan
 * Date: 10-30-2023
 * Description: Abstraction Class in Java calling without abstraction method
 */
abstract class Abs2 {
    void Programmer(){
        System.out.println("I am a programmer");
    }
}
class Abs3 extends Abs2{
}
class Main1{
    public static void main(String[] args){
        Abs3 abs3 = new Abs3();
        abs3.Programmer();
    }
}
