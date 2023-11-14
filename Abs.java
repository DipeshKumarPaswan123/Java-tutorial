/*
    * Author: Dipesh Kumar Paswan
    * Date: 10-30-2023
    * Description: Abstraction Class in Java
 */
abstract class Abs {
    void type(){
        System.out.println("Black Hat, White Hat, Gray Hat Hackers");
    }
    abstract void hacker();
    void hack() {
        System.out.println("A hacker can hack anything as he want");
    }
 }
class Black extends Abs{
    void hacker(){
        System.out.println("There are mainly three types of hacker");
    }
}
class Ha{
    public static void main(String[] args){
        Abs ab = new Black();
        ab.hack();
        ab.hacker();
        ab.type();
    }
}
