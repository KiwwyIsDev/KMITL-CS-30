class Worker1 extends Thread {
    public void run() {
        System.out.println("I'm a worker1");
    }
}

class Worker2 extends Thread {

    public void run() {
        System.out.println("I'm a worker2");
    }
}

public class OSLab7_01 {
    public static void main(String[] args) {
        new Worker1().start();
        Worker2 wk2 = new Worker2();
        Thread thd = new Thread(wk2);
        thd.start();
        try {
            thd.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("I'm a master");
    }
}