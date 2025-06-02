import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BikeViewButtonAction implements ActionListener {
    JFrame bikeShopFrame;

    public BikeViewButtonAction(JFrame bikeShopFrame) {
        this.bikeShopFrame = bikeShopFrame;
    }

    public void actionPerformed(ActionEvent e) {
        this.bikeShopFrame.setVisible(false);
        BikeShopView bikeView = new BikeShopView();
        bikeView.getFrame().setVisible(true);
    }
}
