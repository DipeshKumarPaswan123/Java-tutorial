class Cs {
    void show() {
        System.out.println("This is the Parent class");
    }

    void display() {
        System.out.println("Print message from the Parent class");
    }
}

class Cse extends Cs {
    void show() {
        System.out.println("This is the Child class");
    }

    void display(String message) {
        System.out.println("Print message from the child class: " + message);
    }
}

class OverloadingAndOverriding {
    public static void main(String[] args) {
        Cs cs = new Cs();
        Cse cse = new Cse();

        System.out.println("Method Overriding:");
        cs.show();
        cse.show();

        System.out.println("\nMethod Overloading:");
        cs.display();
        //cse.display();
        cse.display("I am the Computer Science Student");
    }
}
