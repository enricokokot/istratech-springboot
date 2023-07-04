package hr.istratech.demo4.service.impl;

import hr.istratech.demo4.domain.Person;
import hr.istratech.demo4.repository.PersonRepository;
import hr.istratech.demo4.service.PersonService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    final private PersonRepository personRepository;

    public PersonServiceImpl(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> getAllPersonsFilteredByName(String name) {
//        List<Person> persons = personRepository.findAll();
//        if (name.equalsIgnoreCase("")) {
//            return persons;
//        }
//        List<Person> filteredPersons = persons.stream().filter(person -> person.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
//        return filteredPersons;
        if (Strings.isBlank(name)) {
            return getAllPersons();
        }
        return getAllPersons().stream().filter(person -> person.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    @Override
    public Person getPersonById(Long personId) {
        final Optional<Person> person = personRepository.findById(personId);
        return person.get();
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }
}
