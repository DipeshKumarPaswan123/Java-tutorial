public class Student {
    //data:data members: instance variable

    int studentId;
    String studentName;
    String studentBranch;

    //constructor
    public Student(){

        System.out.println("Creating a non-patermized constructor as object");
    }
    public Student(int st){
        System.out.println("parametirizd constructor ");
    }
    //Behaviour" member methods : methods: (functions)
    public void study(){
        System.out.println(studentName+"\tis the student");
    }
    public void showFUllDetails(){
        System.out.println("My name is\t"+studentName);
        System.out.println("My id is\t"+studentId);
        System.out.println("My branch is\t"+studentBranch);
        //System.out.println("");
    }
//public class Demo {


        public static void main(String[] args) {
            //now creating objects
            Student st1;
            st1 = new Student();
            st1.studentName = "dipesh";
            st1.studentId = 86;
            st1.studentBranch = "CSE";

            st1.study();
            st1.showFUllDetails();

            Student s2;
            s2 = new Student();
            s2.studentName = "Ragni";
            s2.studentId = 123;
            s2.studentBranch = "EEE";

            s2.study();
            s2.showFUllDetails();


        }

}
