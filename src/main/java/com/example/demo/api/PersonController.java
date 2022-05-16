package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person") //Define endpoint in rest api
@RestController //Expose endpoints clients can consume
public class PersonController {
    private final PersonService personService;

    @Autowired //Dep Injection
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping //Method used when POST method
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    @GetMapping //Method used when GET method
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }
    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null); //Returns null if person not found
    }
    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PutMapping(path = "{id}")
    public void updatePersonById(@PathVariable("id") UUID id, @RequestBody Person personToUpdate) {
        personService.updatePerson(id, personToUpdate);
    }
}
