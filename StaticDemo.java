public class StaticDemo {
        static int a = 10;

        static {
            System.out.println("Static block");
            a++;
        }

        static void display() {
            System.out.println("Static method");
        }

        public static void main(String args[]) {
            System.out.println("Main method");
            System.out.println(a);
            display();
        }
    }


