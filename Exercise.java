import java.util.Scanner;
public class Exercise {
    public static void main(String[] args)
    {

        System.out.println("Enter whole subject marks below");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter math total marks");
        float math = sc.nextFloat();

        System.out.println("Enter java total marks");
        float java = sc.nextFloat();

        System.out.println("Ente C total marks");
        float c = sc.nextFloat();

        System.out.println("Enter python marks");
        int python = sc.nextInt();

        float cgpa = (math+java+c+python)/500;

        System.out.println("The total marks of all subjects inculding is --->>>");
        System.out.println(cgpa);

//        int percentage = total*100/4;

    }
}

