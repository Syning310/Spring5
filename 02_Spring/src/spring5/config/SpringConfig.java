package spring5.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// 作为配置类，替代xml配置文件
@Configuration    // 1
@ComponentScan(basePackages = "spring5")  // 2
public class SpringConfig {
    
    
}
