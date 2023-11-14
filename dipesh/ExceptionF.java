class ExceptionF extends Exception {
    public ExceptionF(String message) {
        super(message);
    }
}

class SubcException extends ExceptionF {
    public SubcException(String message) {
        super(message);
    }
    public class SubcExceptionPrecedenceDemo {
        public static void main(String[] args) {
            try {
                throw new SubcException("Subclass Exception");
            } catch (SubcException e) {
                System.out.println("Caught SubclassException: " + e.getMessage());
            } catch (ExceptionF e) {
                System.out.println("Caught ExceptionF: " + e.getMessage());
            }
        }
    }
}


