public class Book {
    Book()
    {
        System.out.println("Default Constructor ");
    }
    Book(int value)
    {
        System.out.println("Parametrized constructor with value: " + value);
    }
    void print(){
        System.out.println("No Argument Method");
    }
    void print(int value)
    {
        System.out.println("Arguments with int: " + value);
    }
    void print(String message)
    {
        System.out.println("Method with String Arguments " + message);
    }
}
class Show{
    public static void main(String[] args){
        System.out.println("Constructor OverLoadingiding");
        Book constrct1 = new Book();
        Book constract2 = new Book(10);

        System.out.println("\nMethod Over Loading");
        Book method = new Book();
        method.print();
        method.print(2);
        method.print("Python and Java ");
    }
}
