import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JFrameDisableButton aFrame = new JFrameDisableButton();
        aFrame.setVisible(true);
    }

    JButton button = new JButton("Button");
    final int WIDTH = 400;
    final int HEIGHT = 100;

    public JFrameDisableButton() {
        setSize(WIDTH, HEIGHT);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }
}
