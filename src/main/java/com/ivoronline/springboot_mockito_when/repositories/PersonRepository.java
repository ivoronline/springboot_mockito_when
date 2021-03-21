package com.ivoronline.springboot_mockito_when.repositories;

import com.ivoronline.springboot_mockito_when.entities.Person;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class PersonRepository {

  //PROPERTY
  Map<Integer, Person> persons = new HashMap();

  //CONSTRUCTOR
  public PersonRepository() {
    persons.put(1, new Person(1, "John", 20));
    persons.put(2, new Person(2, "Bill", 30));
    persons.put(3, new Person(2, "Jack", 40));
  }

  //GET PERSON BY ID
  public Person getPersonById(Integer id) {
    return persons.get(id);
  }

}
