import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeShopFormSubmitButtonAction implements ActionListener {
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField bikesField;
    private JTextField paymentField;
    private JTextField priceField;

    public BikeShopFormSubmitButtonAction(JTextField nameField, JTextField phoneField,
           JTextField bikesField, JTextField paymentField,
           JTextField priceField) {
        this.nameField = nameField;
        this.phoneField = phoneField;
        this.bikesField = bikesField;
        this.paymentField = paymentField;
        this.priceField = priceField;
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String name = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            String bikes = bikesField.getText().trim();
            String payment = paymentField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());

            Order order = new Order(name, phone, bikes, payment, price);
            ShopRepository.insert(order);

            JOptionPane.showMessageDialog(null, "Order saved successfully!");

            
            nameField.setText("");
            phoneField.setText("");
            bikesField.setText("");
            paymentField.setText("");
            priceField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid order price.");
        }
    }
}
