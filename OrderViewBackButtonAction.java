import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderViewBackButtonAction implements ActionListener {
    private JFrame orderViewFrame;

    public OrderViewBackButtonAction(JFrame orderViewFrame) {
        this.orderViewFrame = orderViewFrame;
    }

    public void actionPerformed(ActionEvent e) {
        orderViewFrame.setVisible(false);
        BikeForm bikeForm = new BikeForm();
        bikeForm.getFrame().setVisible(true);
    }
}
