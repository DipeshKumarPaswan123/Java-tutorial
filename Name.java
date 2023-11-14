class Home{
    String color="white";
}
class House extends Home{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
class Chose{
    public static void main(String args[]){
        House h =new House();
        h.printColor();
    }}