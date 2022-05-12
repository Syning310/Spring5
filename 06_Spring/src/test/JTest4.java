package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import syning.service.BlankService;

@RunWith(SpringJUnit4ClassRunner.class)   // 单元测试框架
@ContextConfiguration("classpath:config.xml")  // 加载配置文件
public class JTest4 {
    @Autowired
    @Qualifier(value = "blankService")
    private BlankService blankService;
    
    @Test
    public void test() {
        blankService.accountMoney();
    }
    
}
