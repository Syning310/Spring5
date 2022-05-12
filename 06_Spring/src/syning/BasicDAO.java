package syning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BasicDAO<T> {

    @Autowired
    @Qualifier(value = "jdbcTemplate")
    JdbcTemplate jdbcTemplate;
    
    
    // 修改
    public Integer update(String sql, Object... parameters) {
        return jdbcTemplate.update(sql, parameters);
    }
    
    // 查询多行多列数据
    public List<T> queryMutil(String sql, Class<T> clazz,  Object... parameters) {
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(clazz), parameters);
    }
    
    // 查询单行多列数据
    public T querySingle(String sql, Class<T> clazz, Object... parameters) {
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(clazz), parameters);
    }
    
    // 查询单行单列数据
    public Object queryScalar(String sql, Object... parameters) {
        return jdbcTemplate.queryForObject(sql, Object.class, parameters);
    }
    
}
