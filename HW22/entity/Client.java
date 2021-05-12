package HW22.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name", length = 20)
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "phone", unique = true, nullable = false)
    private long phone;
    @Column(name = "about")
    private String about;
}
