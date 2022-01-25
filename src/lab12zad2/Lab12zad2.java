package lab12zad2;

public class Lab12zad2 {

    public static void main(String[] args) {
       Thread racer1 = new Thread(new Countdown("racer 1", 20));
       Thread racer2 = new Thread(new Countdown("racer 2", 20));
       racer1.start();
       racer2.start();
        try {
            racer1.join();
            racer2.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception");
        }
    
       System.out.println("Race is over");
    }
    
}
