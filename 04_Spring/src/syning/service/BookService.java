package syning.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syning.dao.BookDAO;
import syning.domain.Book;

import java.util.List;

@Service(value = "bookService")
public class BookService {
    
    // 注入DAO
    @Autowired
    private BookDAO bookDAO;
    
    
   
    public Integer add(Book book) {
        return bookDAO.add(book);
    }
    
    public Integer findCount() {
        String sql = "select count(*) from t_book";
        return bookDAO.findCount(sql);
    }
    
    public Book getBookById(Integer id) {
        String sql = "select id, name, price from t_book where id = ?";
        return bookDAO.getBookByName(sql, id);
    }
    
    public List<Book> getBookList() {
        String sql = "select id, name, price from t_book";
        return bookDAO.getBookList(sql);
    }
    
    
    public int[] addList(List<Object[]> lst) {
        String sql = "insert into t_book values(null, ?, ?)";
        return bookDAO.addBookList(sql, lst);
    }
    
    public int[] updateList(List<Object[]> lst) {
        String sql = "update t_book set price=? where id=?";
        return bookDAO.update(sql, lst);
    }
    
    
    public int[] deleteList(List<Object[]> lst) {
        String sql = "delete from t_book where id=?";
        return bookDAO.update(sql, lst);
    }
    
    
}
