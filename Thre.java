class myThreads extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){

            System.out.println("The threads " + Thread.currentThread().getId() + " Count " + i);
        }
    }
}
class Threads{
    public static void main(String[] args){
        myThreads t = new myThreads();
        t.run();
    }
}