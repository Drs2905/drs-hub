class Dipti extends Thread {
    public void run() {
        System.out.println("Current thread name: " + Thread.currentThread().getName());
        System.out.println("run() method called");
    }

}
public class Ranjan {


    public static void main(String[] args) {
        Dipti mtc = new Dipti();

        mtc.run();
        mtc.run();

    }
}
