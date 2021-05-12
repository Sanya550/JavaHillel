package HW31;

import HW31.entity.Helper;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private static Helper helper = new Helper();

    public static void main(String[] args) throws InterruptedException {
        Object key = new Object();
        Thread thread1 = new Thread(() -> {
            Thread.currentThread().setName("First thread");
            synchronized (key) {
                TheSameLogic();
            }
        });

        Thread thread2 = new Thread(() -> {
            Thread.currentThread().setName("Second thread");
            synchronized (key) {
                TheSameLogic();
            }
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        Thread thread3 = new Thread(Main::helperMethod);
        Thread thread4 = new Thread(Main::helperMethod);
        Thread thread5 = new Thread(Main::helperMethod);
        thread3.start();
        thread4.start();
        thread5.start();
    }

    public static void TheSameLogic() {
for (int i = 0;i<10000;i++){
    Thread thread = new Thread(()->{
        atomicInteger.decrementAndGet();
    });
    thread.start();
}
try{
    Thread.sleep(2000);
}catch (InterruptedException e){
    e.printStackTrace();
}
        System.out.println(Thread.currentThread().getName() + " " + atomicInteger.get());
    }

    public static void helperMethod() {
        helper.ChampionsLeague();
        helper.EuropeLeague();
        helper.ChampionsWorld();
    }
}
