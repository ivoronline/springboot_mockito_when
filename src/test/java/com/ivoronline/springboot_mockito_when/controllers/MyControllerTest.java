package com.ivoronline.springboot_mockito_when.controllers;

import com.ivoronline.springboot_mockito_when.entities.Person;
import com.ivoronline.springboot_mockito_when.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

  @Autowired MyController     myController;          //INSTANTIATE CLASS BEING TESTED
  @Mock      PersonRepository personRepositoryMock;  //MOCK DEPENDENCY CLASS

  @Test
  void getPerson() {

    //MOCK METHOD: getPersonById(1)
    when(personRepositoryMock.getPersonById(1)).thenReturn(new Person(1, "John", 20));

    //TEST CONTROLLER'S ENDPOINT
    String result = myController.getPerson(1);

    //TEST RESULT
    assertEquals("Hello John", result);

  }

}
