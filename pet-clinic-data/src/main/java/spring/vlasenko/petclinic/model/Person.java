package spring.vlasenko.petclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
