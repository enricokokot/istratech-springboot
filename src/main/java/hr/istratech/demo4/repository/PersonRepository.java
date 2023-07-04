package hr.istratech.demo4.repository;

import hr.istratech.demo4.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByNameIgnoreCase(final String name);
}
