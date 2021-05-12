package HW30.thread;

import HW30.entity.Helper;
import lombok.Data;

@Data
public class CustomRunnable implements Runnable {
    private static Integer runnableCounter = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("CustomRunnable " + runnableCounter++);
            Helper.print();
        }

    }
}
