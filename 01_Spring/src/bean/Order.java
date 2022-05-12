package bean;

public class Order {
    
    private String name;

    public Order() {
        System.out.println("1、Order的无参构造方法......");
    }
    
    
    public void setName(String name) {
        System.out.println("2、Order的setName方法......");
        this.name = name;
    }
    
    
    // 执行初始化的方法，需要在配置文件中指定
    public void initMethod() {
        System.out.println("3、Order的初始化的方法......");
    }
    
    
    // 执行销毁的方法，需要在配置文件中指定
    public void destroyMethod() {
        System.out.println("5、Order的销毁的方法");
    }
    
    
    
}
