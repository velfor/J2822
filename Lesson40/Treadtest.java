package Lesson40;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Treadtest {
    public static int counter = 0;
    public static Object locker = new Object();

    public static void main(String[] args) {
        /*int limit = 500000;
        IncThread t6 = new IncThread(limit);
        DecThread t7 = new DecThread(limit);
        t6.start();
        t7.start();
        try{
            t6.join();
            t7.join();
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
            Logger.getLogger(Treadtest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("counter="+counter);*/
        MyResource res = new MyResource();
        Thread t1 = new MyThread(res);
        Thread t2 = new MyThread(res);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("res = " + res.getCounter());
    }
}

class IncThread extends Thread{
    int limit;

    public IncThread(int limit) { this.limit = limit; }

    @Override
    public void run() {
        for(int i=0; i < limit; i++){
            synchronized (Treadtest.locker) {
                Treadtest.counter++;
            }
        }
    }
}

class DecThread extends Thread{
    int limit;

    public DecThread(int limit) { this.limit = limit; }

    @Override
    public void run() {
        for(int i=0; i < limit; i++){
            synchronized (Treadtest.locker) {
                Treadtest.counter--;
            }
        }
    }
}

class MyResource {
    long counter = 0;

    public synchronized void add(long value){
        this.counter += value;
    }

    long getCounter(){
        return this.counter;
    }
}

class MyThread extends Thread{
    protected MyResource obj_counter = null;
    public MyThread(MyResource counter){
        this.obj_counter = counter;
    }
    @Override
    public void run() {
        for(int i=0; i<=1000000; i++){
            obj_counter.add(i);
        }
    }
}