package HW30.deadlock;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
public class Superliga {
    private Uefa uefa;

    public synchronized String messageFromSuperliga(){
        return "We will have 12 team";
    }
@SneakyThrows
    public synchronized String predictFromSuperliga(){
    Thread.sleep(10);
        return uefa.messageFromUefa();
    }

}
