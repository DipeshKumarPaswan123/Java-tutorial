import java.io.*;
public class MethodOverLoading {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("Method overloading with two parameter");
        System.out.println(add(5,6));
        System.out.println("Method overloading with two parameter");
        System.out.println(add(4,5,8));
    }
}
