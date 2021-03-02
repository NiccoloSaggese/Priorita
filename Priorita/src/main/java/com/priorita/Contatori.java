package com.priorita;

/**
 *
 * @author User
 */
public class Contatori implements Runnable {

    private final int id;
    private int contatore = 0;

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
        while (Main.run) {
            contatore++;
            System.out.println("Thread" + id + " " + contatore);
        }
    }

}
