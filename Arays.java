import java.util.*;
public class Arays {
    public static void main(String[] args){
        int[] marks = new int[5];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 88;
        marks[3] = 99;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for(int i = 0;i<4;i++){
            try{
                System.out.println(marks[6]);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("hello");

        }
    }
}
