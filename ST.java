public class ST {
    void read()
    {
        System.out.println("Student is reading");
    }
}
class STU extends ST{
    void write()
    {
        System.out.println("Student is writing assigment");
    }
}
class STUD{
    public static void main(String[] args){
        STU stu = new STU();
        stu.read();
        stu.write();
    }
}