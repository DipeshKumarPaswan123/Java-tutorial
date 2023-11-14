interface Branch {
    void name();

    void branch();
}

interface Course {
    void pin();

    void section();
}

class Programmer implements Branch, Course {
    public void name() {
        System.out.println("Programmer name is Dipesh Kumar Paswan");
    }

    public void branch() {
        System.out.println("in the branch Computer Science and Engineering");
    }

    public void pin() {
        System.out.println("With Pin No: 22551A0586");
    }

    public void section() {
        System.out.println("in the section CSE-B ");
    }

    public static void main(String[] args) {
        Programmer pr = new Programmer();
        pr.name();
        pr.branch();
        pr.pin();
        pr.section();
    }
}
