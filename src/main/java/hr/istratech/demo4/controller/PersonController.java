package hr.istratech.demo4.controller;


import hr.istratech.demo4.domain.Person;
import hr.istratech.demo4.repository.PersonRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/persons")
public class PersonController {

//    @Autowired
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public Person savePerson(@RequestBody final Person person) {
        return personRepository.save(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/{person_id}")
    public Person getPersonsById(@PathVariable("person_id") final Long personId) {
        final Optional<Person> person = personRepository.findById(personId);
        return person.get();
    }
}
