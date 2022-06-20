package spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Мы взяли книгу из uniLibrary");
    }

    public void returnBook(){
        System.out.println("Мы вернули книгу из uniLibrary");
    }

    public void getMagazine(){
        System.out.println("Мы взяли журнал из uniLibrary");
    }

    public void returnMagazine(){
        System.out.println("Мы вернули журнал из uniLibrary");
    }
    public void addBook(){
        System.out.println("Мы добавили книгу в uniLibrary");
    }
    public void addMagazine(){
        System.out.println("Мы добавли журнал в uniLibrary");
    }
}
