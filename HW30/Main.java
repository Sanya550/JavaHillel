package HW30;

import HW30.deadlock.Superliga;
import HW30.deadlock.Uefa;
import HW30.thread.CustomCallable;
import HW30.thread.CustomRunnable;
import HW30.thread.CustomThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();
        customThread.join();

        CustomRunnable customRunnable = new CustomRunnable();
        Thread thread1 = new Thread(customRunnable);
        thread1.start();
        thread1.join();

        CustomCallable customCallable= new CustomCallable();
        FutureTask<Integer> task = new FutureTask(customCallable);
        Thread customCallableThread = new Thread(task);
        customCallableThread.start();
        customCallableThread.join();

//5.1:  2997 - 2999;
//5.2:  2999 - 2999;
//5.3:  2999 - 2999;

        Uefa uefa = new Uefa();
        Superliga superliga = new Superliga();
        uefa.setSuperliga(superliga);
        superliga.setUefa(uefa);

        Thread threadd1 = new Thread(()-> System.out.println(superliga.predictFromSuperliga()));
        Thread thread2 = new Thread(()-> System.out.println(uefa.predictFromUefa()));

        threadd1.start();
        thread2.start();
    }
}
