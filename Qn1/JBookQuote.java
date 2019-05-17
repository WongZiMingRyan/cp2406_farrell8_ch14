import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {
    JLabel quote = new JLabel("This is my quote");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    final int WIDTH = 400;
    final int HEIGHT = 100;
    public JBookQuote() {
        setSize(WIDTH, HEIGHT);
        quote.setFont(bigFont);
        add(quote);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setVisible(true);
    }
}
