package HW30.deadlock;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Uefa {
    private Superliga superliga;

    public synchronized String messageFromUefa(){
        return "We will have 36 team";
    }


    public synchronized String predictFromUefa(){
        return superliga.messageFromSuperliga();
    }
}
