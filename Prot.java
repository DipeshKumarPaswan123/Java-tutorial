/*
    Author: Dipesh Kumar Paswan
    Date: 10-29-2023
    Description: This is private access modifier
 */
public class Prot {
    protected String name = "dipesh";
    protected void id()
    {
        System.out.println("22551A0586");
    }
    public static void main(String[] args){
        Prot prot = new Prot();
        System.out.println("Within the package");
        System.out.println(prot.name);
        prot.id();
        System.out.println();
        Pr pr = new Pr();
        pr.subClassMain();

    }
}
class Pr extends Prot{
    public void subClassMain(){
        Pr prt = new Pr();
        System.out.println("outside package by subclass only");
        System.out.println(prt.name);
        prt.id();
    }
}


