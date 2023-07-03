package hr.istratech.demo4.domain;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
//import jakarta.persistence.Table;


import java.util.List;

@Entity
//@Table(name = "M.PERSON")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

//    @Column(name = "X")
    private String name;
    private String surname;

    @Transient
    private List<Person> children;

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
