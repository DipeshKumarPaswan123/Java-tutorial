/*
    Author: Dipesh Kumar Paswan
    Date: 10-28-2023
    Description: This is private access modifier
 */
//public class P {
//    private int data = 50;
//    private void msg(){
//        System.out.println("Hello i earn today");
//    }
//}
//class P1{
//    public static void main(String[] args){
//        P p = new P();
//        System.out.println(p.data); //This cant be accessible it occurs compile time error because we are trying to access it outside the class
//        p.msg();
//    }
//}


class P {
    public int a = 50;
    private void msg(){
        System.out.println("Hello i earn today");
    }
    public static void main(String[] args){
        P p1 = new P();
        p1.msg();
        System.out.println(p1.a); //Private access modifier only can access within the class no outside the class
    }
}
