package HW31.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Helper {
    Lock lock = new ReentrantLock();

    public void ChampionsLeague() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " Champions League Number: " + i);
        }
    }

    public void EuropeLeague() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " Europe League Number: " + i);
        }
    }

    public void ChampionsWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + " Champions World Number: " + i);
        }
        lock.unlock();
    }
}
