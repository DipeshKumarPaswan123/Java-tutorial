public class College {
    void room() {
        System.out.println("There are many classrooms in the college");
    }
}

class Teacher extends College {
    void teach() {
        System.out.println("Teachers teach students");
    }
}

class STUDENTS extends Teacher {
    void study() {
        System.out.println("Students sit in their classes");
    }

    public static void main(String[] args) {
        STUDENTS student = new STUDENTS();
        student.room();
        student.teach();
        student.study();
    }
}
