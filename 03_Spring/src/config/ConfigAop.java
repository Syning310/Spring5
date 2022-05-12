package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "democonfig")
@EnableAspectJAutoProxy(proxyTargetClass=true)  // 替代配置文件中的 Aspect 生成代理对象
public class ConfigAop {
    
    
}
 