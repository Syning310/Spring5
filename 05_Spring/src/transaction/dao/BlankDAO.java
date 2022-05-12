package transaction.dao;

import domain.Blank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository(value = "blankDAO")
public class BlankDAO {
    
    
    @Autowired
    @Qualifier(value = "jdbcTemplate")
    JdbcTemplate jdbcTemplate;
    
    
    // 修改
    public Integer update(String sql, Object... parameters) {
        return jdbcTemplate.update(sql, parameters);
    }
    
    // 查询多行多列
    public List<Blank> getList(String sql, Object... parameters) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Blank.class), parameters);
    }
    
    // 查询单行多列
    public Blank getBlank(String sql, Object... parameters) {
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Blank.class), parameters);
    }
    
    // 单行单列对象
    public Object getSingleRow(String sql, Object... parameters) {
        return jdbcTemplate.queryForObject(sql, Object.class, parameters);
    }


    
    // 将以上四个方法放在 BasicDAO
    
    // 以下的方法作为自己特殊的 DAO 方法，围绕着自己的父类书写，实现分层
    
    
    
    //@Transactional
    public void transfer() {

        System.out.println("开始转账");
        
        String sql = "update blank set balance = balance + ? where id = ?";

        int p = jdbcTemplate.update(sql, -1000, 1);
        System.out.println(p);
        
        int i = 1 / 0;

        int up = jdbcTemplate.update(sql, 1000, 2);

        System.out.println(up);
        
        System.out.println("操作完成");
        
        
    }
    
    
    public Integer tranf(Integer id, Double balance) {
        String sql = "update blank set balance = balance + ? where id = ?";
        return jdbcTemplate.update(sql, balance, id);
    }
    
    
    
}
