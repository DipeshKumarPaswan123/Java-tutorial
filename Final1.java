public class Final1 {
    final int mark = 90; // Declared in final keyword
    void num()
    {
        int mark = 80; // Value of the mrk cant be changed when it declared once time
        //System.out.println("Local Variable " + mark);

    }
    public static void main(String[] args)
    {
        Final1 final1 = new Final1();
        //System.out.println("Instance Variable " + final1.mark);
        final1.num();
    }
}
