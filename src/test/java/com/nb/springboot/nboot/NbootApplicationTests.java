package com.nb.springboot.nboot;

import com.nb.springboot.nboot.pojo.Dog;
import com.nb.springboot.nboot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NbootApplicationTests {
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(dog);
    }

}
