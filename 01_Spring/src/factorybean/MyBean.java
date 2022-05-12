package factorybean;


import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<String> {


    
    // 返回对象
    @Override
    public String getObject() throws Exception {
        // 定义返回bean
        return new String("尚亦宁");
    }
    
    
    // 返回类型
    @Override
    public Class<?> getObjectType() {
        return Integer.TYPE;
    }

    
    // 是否是单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
