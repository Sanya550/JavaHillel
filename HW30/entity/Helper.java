package HW30.entity;

import lombok.Data;

@Data
public class Helper {
    private static Integer id = 0;

    public static synchronized void print() {
        System.out.println(Thread.currentThread().getName() + ", id: " + id++);
    }
}
