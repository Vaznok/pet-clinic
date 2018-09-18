package spring.vlasenko.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {
    private String description;

    @ManyToMany(mappedBy = "specialties")
    private Set<Vet> vets = new HashSet<>();

}
