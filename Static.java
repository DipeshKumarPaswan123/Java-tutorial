public class Static {
    static int a = 10;

    static void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("This is static method");
        display();


        Demo demo = new Demo();
        demo.show();
    }
}

class Demo {
    String b = "dipesh";

    void show() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println("This is non-static method");
    }
}
