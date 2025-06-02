import javax.swing.*;

public class BikeForm {
    private JFrame frame;

    public BikeForm() {
        frame = new JFrame("Bike Shop Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 350);  
        frame.setLayout(null);

       
        JLabel nameLabel = new JLabel("Customer Name:");
        nameLabel.setBounds(30, 30, 120, 25);
        frame.add(nameLabel);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(30, 70, 120, 25);
        frame.add(phoneLabel);

        JLabel bikesLabel = new JLabel("Bike Model(s):");
        bikesLabel.setBounds(30, 110, 120, 25);
        frame.add(bikesLabel);

        JLabel paymentLabel = new JLabel("Payment Method:");
        paymentLabel.setBounds(30, 150, 120, 25);
        frame.add(paymentLabel);

        JLabel priceLabel = new JLabel("Order Price:");
        priceLabel.setBounds(30, 190, 120, 25);
        frame.add(priceLabel);

        
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 30, 200, 25);
        frame.add(nameField);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(160, 70, 200, 25);
        frame.add(phoneField);

        JTextField bikesInputField = new JTextField();
        bikesInputField.setBounds(160, 110, 200, 25);
        frame.add(bikesInputField);

        JTextField paymentMethodField = new JTextField();
        paymentMethodField.setBounds(160, 150, 200, 25);
        frame.add(paymentMethodField);

        JTextField orderPriceField = new JTextField();
        orderPriceField.setBounds(160, 190, 200, 25);
        frame.add(orderPriceField);

        
        JLabel catalogLabel = new JLabel("Available Bikes:");
        catalogLabel.setBounds(380, 20, 120, 25);
        frame.add(catalogLabel);

       
        JTextArea bikeCatalogArea = new JTextArea();
        bikeCatalogArea.setBounds(380, 50, 200, 230);
        bikeCatalogArea.setEditable(false);
        bikeCatalogArea.setText(
            "Mountain Bike - $500\n" +
            "Road Bike - $750\n" +
            "Hybrid Bike - $600\n" +
            "Electric Bike - $1200\n" +
            "Kids Bike - $300"
        );
        frame.add(bikeCatalogArea);

       
        JButton submitButton = new JButton("Submit Order");
        submitButton.setBounds(50, 250, 150, 30);
        submitButton.addActionListener(new BikeShopFormSubmitButtonAction(
                nameField, phoneField, bikesInputField, paymentMethodField, orderPriceField));
        frame.add(submitButton);

        
        JButton viewButton = new JButton("View Orders");
        viewButton.setBounds(220, 250, 150, 30);
        viewButton.addActionListener(new BikeViewButtonAction(frame));
        frame.add(viewButton);
    }

    public JFrame getFrame() {
        return frame;
    }
}
