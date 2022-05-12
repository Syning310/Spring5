package syning.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import syning.domain.Book;

import java.util.List;

@Repository(value = "bookDAO")
public class BookDAO {
    
    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    
    
    public Integer add(Book book) {
        
        String sql = "insert into t_book values (null, ?, ?)";
        return jdbcTemplate.update(sql, book.getName(), book.getPrice());
        
    }

    // 获取单行单列
    public Integer findCount(String sql) {
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
    
    
    // 获取单行单列
    public Book getBookByName(String sql, Object... parameters) {
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), parameters);
    }
    
    // 获取多行多列
    public List<Book> getBookList(String sql, Object... parameters) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class), parameters);
    }

    // 更新语句
    public int[] update(String sql, List<Object[]> lst) {
        return jdbcTemplate.batchUpdate(sql, lst);
    }
    
    
    
    public int[] addBookList(String sql, List<Object[]> lst) {
        return jdbcTemplate.batchUpdate(sql, lst);
    }
    

    
    
}
