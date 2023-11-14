package dipesh;

public class FinalKeywordExample {


    final int finalVariable = 10;


    final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalKeywordExample example = new FinalKeywordExample();

        example.finalMethod();

        final FinalClass finalObj = new FinalClass();
        finalObj.printMessage();
    }
}

final class FinalClass {
    void printMessage() {
        System.out.println("This is a final class.");
    }
}
