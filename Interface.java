import java.beans.PropertyEditorSupport;
// Dipesh Kumar Paswan
interface Interface {
//    public static final int a = 6;
//    public static final int b = 7;
    public abstract void add();
}
class I1 implements Interface
{
    public void add()

    {
        int a = 6;
        int b = 7;
        int results = a +  b;
        System.out.println("Addition of two numbers "  + results);
    }
    public static void main(String[] args)
    {
        I1 i1 = new I1();
        i1.add();
    }
}
