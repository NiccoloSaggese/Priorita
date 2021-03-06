package com.priorita;

/**
 *
 * @author User
 */
public class Contatori implements Runnable {

    private final int id;
    private int contatore = 0;
    private boolean run = true;

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public Contatori(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (run == true) {
            contatore++;
            System.out.println("Thread" + id + " " + contatore);
        }
    }

}
