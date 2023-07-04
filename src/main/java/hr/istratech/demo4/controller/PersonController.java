package hr.istratech.demo4.controller;


import hr.istratech.demo4.domain.Person;
//import org.springframework.beans.factory.annotation.Autowired;
import hr.istratech.demo4.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonController {

    //    @Autowired
    final private PersonService personService;

    public PersonController(final PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person savePerson(@RequestBody final Person person) {
        return personService.savePerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons(@RequestParam(name = "name", defaultValue = "") final String name) {
        return personService.getAllPersonsFilteredByName(name);
    }

    @GetMapping("/{person_id}")
    public Person getPersonsById(@PathVariable("person_id") final Long personId) {
        return personService.getPersonById(personId);
    }
}
