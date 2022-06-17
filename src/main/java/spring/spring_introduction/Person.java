package spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(){
        System.out.println("Person bean is created");
    }

    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Class Person: set pet");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
