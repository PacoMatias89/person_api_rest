package com.pacomolina.person_api_rest.controller;

import com.pacomolina.person_api_rest.model.Person;
import com.pacomolina.person_api_rest.repository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Esta clase le indica a spring que la clase va a ser
 * un controlador de una Api Rest y nos proveerá de todos los
 * métodos CRUD
 */
@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRespository repository;


    @GetMapping("/persons")
    public List<Person> allPersons(){
        return repository.findAll();
    }

    @GetMapping("/person/{name}")
    public List<Person> findByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        return repository.save(person);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable int id ,@RequestBody Person person) {
        return repository.save(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
