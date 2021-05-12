package HW23.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id")
    private Passport passport;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Address> address;

    @ManyToMany
    @JoinTable(
            name = "client_car",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private Set<Car> cars;
}
