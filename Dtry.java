public class Dtry {
        public static void main (String[] args){
            int a = 900;
            int b = 0;
            try{
                int c = a / b;
                System.out.println("The sum of a and b is:" + c);
            }
            catch(Exception d){
                //System.out.println("");
                //System.out.println(d);
                d.printStackTrace(); // This will print java.lang.ArithmeticException: / by zero
                //	at Dtry.main(Dtry.java:6)
            }
            finally{
                System.out.println("This is finally block");
            }
        }
}
