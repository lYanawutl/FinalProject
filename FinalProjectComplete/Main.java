import javax.swing.*;
import Controller.AppController;
import java.awt.*;
import Page.*;

public class Main extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private AppController controller;

    public Main() {
        setTitle("Montra");
        setSize(375, 812);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        controller = new AppController(cardLayout, mainPanel);

        // Page
        mainPanel.add(new Welcome(controller), "Welcome");
        mainPanel.add(new Path(controller), "Path");
        mainPanel.add(new Home(controller), "Home");

        add(mainPanel);
        cardLayout.show(mainPanel, "Welcome");
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}