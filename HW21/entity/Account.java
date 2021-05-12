package HW21.entity;

import lombok.Data;

@Data
public class Account {

    private long id;
    private long client_id;
    private String number;
    private double value;
}
