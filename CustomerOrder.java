public class CustomerOrder {
    private String name;
    private String phone;
    private String bikesInput;
    private String paymentMethod;
    private double orderPrice;

    public CustomerOrder(String name, String phone, String bikesInput, String paymentMethod, double orderPrice) {
        this.name = name;
        this.phone = phone;
        this.bikesInput = bikesInput;
        this.paymentMethod = paymentMethod;
        this.orderPrice = orderPrice;
    }

   
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
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

    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBikesInput(String bikesInput) {
        this.bikesInput = bikesInput;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

   
}

