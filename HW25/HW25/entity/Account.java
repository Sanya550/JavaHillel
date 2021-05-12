package HW25.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "client_id", nullable = false)
    private int client_id;
    @Column(name = "number", unique = true, nullable = false, length = 20)
    private String number;
    @Column(name = "value", nullable = false)
    private double value;
}
