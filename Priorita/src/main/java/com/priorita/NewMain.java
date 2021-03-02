package com.priorita;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        public static boolean run = true;
        
        Contatori c1 = new Contatori(1);
        Contatori c2 = new Contatori(2);
        Contatori c3 = new Contatori(3);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(5000);

        c1.setRun(false);
        c2.setRun(false);
        c3.setRun(false);

        //t1.stop();
        //t2.stop();
        //t3.stop();
    }

}
