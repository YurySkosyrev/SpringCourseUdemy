package spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Мы взяли книгу из uniLibrary");
    }

    public String returnBook(){
        System.out.println("Мы вернули книгу из uniLibrary");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("Мы взяли журнал из uniLibrary");
    }

}
