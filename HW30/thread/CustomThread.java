package HW30.thread;

import HW30.entity.Helper;
import lombok.Data;

@Data
public class CustomThread extends Thread {
    private static Integer threadCounter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("CustomThread " + threadCounter++);
            Helper.print();
        }


    }
}