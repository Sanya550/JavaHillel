package HW30.thread;

import HW30.entity.Helper;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<Integer> {
    private static Integer callableCounter = 0;

    @Override
    public Integer call() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("CustomCallable " + callableCounter++);
            Helper.print();
        }

        return callableCounter;
    }
}