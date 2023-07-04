package hr.istratech.demo4.service;

import hr.istratech.demo4.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPersons();

    List<Person> getAllPersonsFilteredByName(final String name);

    Person getPersonById(final Long personId);

    Person savePerson(final Person person);
}
