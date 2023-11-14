//public class Final2 {
//    final void mark()
//    {
//        System.out.println("If your mark is more than 90% then you are topper");
//    }
//    class Fa extends Final2{
//        void mark()
//        {
//            System.out.println("Work Hard for being a topper");
//        }
//        public static void main(String[] args){
//            Fa fa = new Fa();
//            fa.mark();
//
//        }
//    }
//}

class Final2{
    final void run(){
        System.out.println("running");}
}

class Honda extends Bike{
    void run(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}