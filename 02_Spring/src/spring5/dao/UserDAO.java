package spring5.dao;


import org.springframework.stereotype.Repository;

@Repository(value = "userDAO")
public class UserDAO {
    
    public void add() {
        System.out.println("UserDAO add...");
    }
    
    
    
}
