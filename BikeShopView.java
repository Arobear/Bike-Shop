import javax.swing.*;

public class BikeShopView {
    private JFrame frame;
    private JPanel panel;
    private JTextArea orderTextArea;
    private JButton backButton;

    public BikeShopView() {
        frame = new JFrame("Bike Shop Orders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        panel = new JPanel();
        panel.setLayout(null);

        orderTextArea = new JTextArea();
        orderTextArea.setEditable(false);
        orderTextArea.setBounds(20, 20, 540, 250);
        panel.add(orderTextArea);

        backButton = new JButton("Back to Shop");
        backButton.setBounds(220, 290, 150, 30);
        backButton.addActionListener(new OrderViewBackButtonAction(frame));
        panel.add(backButton);

        frame.add(panel);
        loadOrderData();
    }

   private void loadOrderData() {
    Order[] orders = ShopRepository.getAll();

    if (orders.length == 0) {
        orderTextArea.setText("No orders found.");
    } else {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < orders.length; i++) {
            Order order = orders[i];
            builder.append("Name: ").append(order.getName())
                   .append(", Phone: ").append(order.getPhone())
                   .append(", Bikes: ").append(order.getBikes())
                   .append(", Payment: ").append(order.getPayment())
                   .append(", Price: $").append(order.getPrice())
                   .append("\n");
        }
        orderTextArea.setText(builder.toString());
    }
}


    public JFrame getFrame() {
        return frame;
    }
}
