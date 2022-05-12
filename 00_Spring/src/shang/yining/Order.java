package shang.yining;

public class Order {
    
    private String name;
    private String address;
    
    
    
    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
