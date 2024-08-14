package ru.semyak.FIrstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.semyak.FIrstRestApp.entities.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
