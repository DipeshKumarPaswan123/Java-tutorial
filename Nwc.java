public class Nwc {
    //instance variables
    String empsalary;
    String empname;
    String empexp;
    String compname;
    //member data: methods
    //constructor
    public Nwc(){
        System.out.println("Creating a defaults constructor");
    }
    public Nwc(String empname){
        System.out.println("Creating a parameterized constructor");
    }
    public void empslary(){
        System.out.println("slaray of the employr"+ empsalary);
    }
    public void empname(){
        System.out.println("The name of the employee is ->>\t"+empname);
    }
    public void compname(){
        System.out.println("The company name of the employee ->>\t"+compname);
    }
    public void empexp(){
        System.out.println("Experience of the employee for this company is ->>\t"+empexp);
    }
    public void alldetails(){
        System.out.println("slaray of the employe is ->>\t"+ empsalary);
        System.out.println("The name of the employee is ->>\t"+empname);
        System.out.println("Experience of the employee for this company is ->>\t"+empexp);
    }

    public static void main(String[] args){
        //creating an objects
        Nwc emp1 = new Nwc();
        emp1.empsalary = "50LPA";
        emp1.empname = "dipesh";
        emp1.empexp = "5 years";
        emp1.compname = "Google";

        emp1.compname();
        emp1.alldetails();

        Nwc emp2 = new Nwc();
        emp2.empname = "Ragni";
        emp2.empsalary = "55LPA";
        emp2.empexp = "4 Years";
        emp2.compname = "Facebook";

        emp2.empname();
        emp2.alldetails();
    }

}

