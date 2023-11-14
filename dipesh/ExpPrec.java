package dipesh;
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

class SubclassException extends BaseException {
    public SubclassException(String message) {
        super(message);
    }
}

public class ExpPrec {
    public static void main(String[] args) {
        try {
            throw new SubclassException("Subclass Exception");
        } catch (SubclassException se) {
            System.out.println("Caught SubclassException: " + se.getMessage());
            se.printStackTrace();
        }
        System.out.println("hello");
    }
}
