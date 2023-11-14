class Student1 {
    String id;
    String name;
    static String branch = "CSE-B"; // Added missing 'String' type declaration
    static String college = "GIET"; // Added missing 'String' type declaration

    static void studentDetails(String id, String name, String branch, String college) {
        System.out.println(id + " " + name + " " + branch + " " + college); // Removed unnecessary 'String' in println
    }

//    void show() {
//        System.out.println("Student Id-->>" + this.id);
//        System.out.println("Student Name-->>" + this.name);
//        System.out.println("Student Branch-->>" + branch);
//        System.out.println("Student College-->>" + college);
//    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.id = "22551A0586";
        s1.name = "Dipesh Kumar Paswan";

        Student1 s2 = new Student1();
        s2.id = "22551A05C4";
        s2.name = "Sagar Debnath";

        Student1 s3 = new Student1();
        s3.id = "22551A05A3";
        s3.name = "Md. Shariful Islam Siam";

        Student1 s4 = new Student1();
        s4.id = "22551A05B5";
        s4.name = "Prabesh Kumar Chaudhary";

        Student1.studentDetails(s1.id, s1.name, branch, college);
        Student1.studentDetails(s2.id, s2.name, branch, college);
        Student1.studentDetails(s3.id, s3.name, branch, college);
        Student1.studentDetails(s4.id, s4.name, branch, college);

//        s1.show();
//        s2.show();
//        s3.show();
//        s4.show();
    }
}
