package syning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import syning.dao.BlankDAO;


@Transactional
@Service(value = "blankService")
public class BlankService {
    
    @Autowired
    @Qualifier(value = "blankDAO")
    private BlankDAO blankDAO;
    
    
    public void accountMoney() {
        System.out.println("开始转账");
        
        // 给 1 扣 1000 元
        int p = blankDAO.transfer(1, -1000D);
        System.out.println(p);
        
        //int i = 1 / 0;
        
        // 给 2 加 1000 元
        int o = blankDAO.transfer(2, 1000D);
        System.out.println(o);
        
        System.out.println("操作完成");
        
    }
    
    
    
    
    
    
}
