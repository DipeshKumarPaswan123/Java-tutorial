package dipesh;

public class UsrDexp extends Exception {
    public UsrDexp(String message) {
        super(message);
    }
}

class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age <= 18) {
                throw new UsrDexp("You are not eligible");
            }
            System.out.println("You can Vote because your age is: " + age);
        } catch (UsrDexp ude) {
            System.out.println("Custom Exception: " + ude.getMessage());
            ude.printStackTrace();
        }
        System.out.println("Thank You");
    }
}
