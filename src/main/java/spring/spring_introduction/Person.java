package spring.spring_introduction;

public class Person {
    private Pet pet;
    public Person(){
        System.out.println("Person bean is created");
    }

//    public Person(Pet pet){
//        this.pet = pet;
//        System.out.println("Person bean is created");
//    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.println("Pet is setted");
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
