package umg.edu.gt.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person; // Relación con la entidad Person

}
