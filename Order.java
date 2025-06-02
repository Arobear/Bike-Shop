// Order.java
public class Order {
    private String name;
    private String phone;
    private String bikesInput;
    private String paymentMethod;
    private double orderPrice;

    public Order(String name, String phone, String bikesInput, String paymentMethod, double orderPrice) {
        this.name = name;
        this.phone = phone;
        this.bikesInput = bikesInput;
        this.paymentMethod = paymentMethod;
        this.orderPrice = orderPrice;
    }

    public String getBikesInput() {
        return bikesInput;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public String getBikes() {
        return bikesInput;
    }

    public String getPayment() {
        return paymentMethod;
    }

    public double getPrice() {
        return orderPrice;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
