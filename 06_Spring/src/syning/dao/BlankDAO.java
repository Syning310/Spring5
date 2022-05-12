package syning.dao;


import org.springframework.stereotype.Repository;
import syning.BasicDAO;
import syning.domain.Blank;

@Repository(value = "blankDAO")
public class BlankDAO extends BasicDAO<Blank> {
    
    
    // 转账
    public Integer transfer(Integer id, Double balance) {
        String sql = "update blank set balance = balance + ? where id = ?";
        return super.update(sql, balance, id);
    }
    
    
    
    
}
