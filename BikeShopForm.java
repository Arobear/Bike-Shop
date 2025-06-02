import javax.swing.*;

public class BikeShopForm {
    private JFrame frame;
    private JPanel formPanel; 
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField bikesInputField;
    private JTextField paymentMethodField;
    private JTextField orderPriceField;
    private JButton submitButton;
    private JButton viewButton;

    public BikeShopForm() {
        frame = new JFrame("Bike Shop Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 320);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBounds(0, 0, 400, 320); 

        nameField = new JTextField();
        nameField.setBounds(30, 20, 320, 25);
        formPanel.add(nameField);

        phoneField = new JTextField();
        phoneField.setBounds(30, 55, 320, 25);
        formPanel.add(phoneField);

        bikesInputField = new JTextField();
        bikesInputField.setBounds(30, 90, 320, 25);
        formPanel.add(bikesInputField);

        paymentMethodField = new JTextField();
        paymentMethodField.setBounds(30, 125, 320, 25);
        formPanel.add(paymentMethodField);

        orderPriceField = new JTextField();
        orderPriceField.setBounds(30, 160, 320, 25);
        formPanel.add(orderPriceField);

        submitButton = new JButton("Submit Order");
        submitButton.setBounds(30, 200, 140, 30);
        submitButton.addActionListener(new BikeShopFormSubmitButtonAction(
            nameField, phoneField, bikesInputField, paymentMethodField, orderPriceField
        ));
        formPanel.add(submitButton);

        viewButton = new JButton("View Orders");
        viewButton.setBounds(210, 200, 140, 30);
        viewButton.addActionListener(new BikeViewButtonAction(frame));
        formPanel.add(viewButton);

        frame.add(formPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}
