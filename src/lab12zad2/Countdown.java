package lab12zad2;

import java.util.Random;

public class Countdown implements Runnable{
    private final String name;
    private final int limit;

    public Countdown(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }
    
    @Override
    public void run() {
       Random random= new Random();
       for (int i = limit; i > 0; i--) {
            System.out.println(name + ": " + i);
           try {
               Thread.sleep((long) (random.nextDouble()*990+10));
           } catch (InterruptedException ex) {
               System.out.println("Exception");
           }
}
    }
    
}
