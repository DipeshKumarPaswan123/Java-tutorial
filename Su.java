public class Su {
    String color = "White";
}
class Sup extends Su{
    String color = "Balck";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    public static void main(String[] args){
        Sup sup = new Sup();
        sup.printcolor();
    }
}

