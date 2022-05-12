package transaction.service;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transaction.dao.BlankDAO;


@Transactional
@Service(value = "blankService")
public class BlankService {
    
    @Autowired
    @Qualifier(value = "blankDAO")
    BlankDAO blankDAO;
    

    public void accountMoney() {
        // 给 1 扣 1000 元
        int pp = blankDAO.tranf(1, -1000D);
        System.out.println(pp);
        
        int i = 1 / 0;    // 回滚
        
        // 给 2 加 1000 元
        int ppp = blankDAO.tranf(2, 1000D);
        System.out.println(ppp);
    }


    public Integer myAccount(Integer id, Double balance) {
        String sql = "update blank set balance = balance + ? where id = ?";
        return blankDAO.update(sql, balance, id);
    }
    
    
    
    
}
