class MyThread extends Thread {
    public void run() {
        for(int i = 0; i<10; i++){
        System.out.println("Thread started.");}
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread finished.");
    }
}

public class Th {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        try {
            myThread.join(1000);

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread continues.");
    }
}
