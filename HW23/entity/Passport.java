package HW23.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passports")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String number;

    @OneToOne(mappedBy = "passport")
    private Client client;


}
