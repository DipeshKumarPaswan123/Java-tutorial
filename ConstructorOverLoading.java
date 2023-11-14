class OverloadingDemo {

    OverloadingDemo() {
        System.out.println("Default constructor");
    }

    OverloadingDemo(int value) {
        System.out.println("Parameterized constructor with value: " + value);
    }


    void print() {
        System.out.println("No argument method");
    }

    void print(int value) {
        System.out.println("Method with int argument: " + value);
    }

    void print(String message) {
        System.out.println("Method with String argument: " + message);
    }
}

class OverloadingExample {
    public static void main(String[] args) {

        OverloadingDemo constructorDemo1 = new OverloadingDemo();
        OverloadingDemo constructorDemo2 = new OverloadingDemo(25);


        OverloadingDemo methodDemo = new OverloadingDemo();
        methodDemo.print();
        methodDemo.print(10);
        methodDemo.print("Hello, Overloading!");
    }
}
