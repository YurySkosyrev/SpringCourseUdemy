package spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Мы взяли книгу из uniLibrary");
        System.out.println("_________________________________________");
    }

    public String returnBook(){
        System.out.println("Мы вернули книгу из uniLibrary");
        return "Война и мир";

    }

    public void getMagazine(){
        System.out.println("Мы взяли журнал из uniLibrary");
        System.out.println("_________________________________________");
    }

    public void returnMagazine(){
        System.out.println("Мы вернули журнал из uniLibrary");
        System.out.println("_________________________________________");
    }
    public void addBook(String person_name, Book book){
        System.out.println("Мы добавили книгу в uniLibrary");
        System.out.println("_________________________________________");
    }
    public void addMagazine(){
        System.out.println("Мы добавли журнал в uniLibrary");
        System.out.println("_________________________________________");
    }
}
