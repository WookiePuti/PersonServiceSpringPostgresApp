package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDAO personData;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDAO personData) {
        this.personData = personData;
    }

    public int addPerson(Person person) {
        return this.personData.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return this.personData.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personData.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personData.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person person) {
        return personData.updatePersonById(id, person);
    }
}
