package democonfig;


import org.springframework.stereotype.Component;

@Component(value = "book")
public class Book {
    
    public void buy() {
        System.out.println("buy......");
    }
    
}
