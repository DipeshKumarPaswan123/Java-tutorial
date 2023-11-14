//Code by Dipesh

public class Hh {
    int id;
    String name;
    static String college = "GIET";
    static void details(int i,String name, String college){
        System.out.println(i+ " " + " " +name + " " + college);
        //System.out.println("These are the all-details show of each students");
    }
    //void show(){
//        System.out.println("This is my id \n" + id);
//        System.out.println("And I'm \n" + name);
//        System.out.println("Or my college name is\n" + college);
    //}

    public static void main(String[] args){
        Hh s1 = new Hh();
        s1.id = 101;
        s1.name = "dipesh";

        Hh s2 = new Hh();
        s2.id = 102;
        s2.name = "Sagar";

        Hh.details(s1.id,s1.name,college);
        Hh.details(s2.id,s2.name,college);
        //s1.show();
    }
}
