package banking;

public class Customer {
    String name;

    String address;

    // constructor
    public Customer(String name) {
        this.name = name;
    }

    // method
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
