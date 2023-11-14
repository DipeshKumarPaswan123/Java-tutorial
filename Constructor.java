public class Constructor {


        String empsalary;
        String empname;
        String empexp;
        String compname;

        // Default Constructor
        public Constructor() {
            System.out.println("Creating a default constructor");
        }

        // Parameterized Constructor
        public Constructor(String empname, String empsalary, String empexp, String compname) {
            this.empname = empname;
            this.empsalary = empsalary;
            this.empexp = empexp;
            this.compname = compname;
            System.out.println("Creating a parameterized constructor");
        }

        // Instance Methods

        public void displayEmployeeDetails() {
            System.out.println("Employee Name: " + empname);
            System.out.println("Employee Salary: " + empsalary);
            System.out.println("Employee Experience: " + empexp);
            System.out.println("Company Name: " + compname);
        }

        public static void main(String[] args) {

            // Creating an instance using the default constructor
            Constructor emp1 = new Constructor();
            emp1.empname = "dipesh";
            emp1.empsalary = "50LPA";
            emp1.empexp = "5 years";
            emp1.compname = "Google";

            System.out.println("\nDetails of emp1 (created with default constructor):");
            emp1.displayEmployeeDetails();

            // Creating an instance using the parameterized constructor
            Constructor emp2 = new Constructor("Ragni", "55LPA", "4 Years", "Facebook");

            System.out.println("\nDetails of emp2 (created with parameterized constructor):");
            emp2.displayEmployeeDetails();
        }
    }


