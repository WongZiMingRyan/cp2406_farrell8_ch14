import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JFrameDisableButton2 aFrame = new JFrameDisableButton2();
        aFrame.setVisible(true);
    }

    int countVal = 0;
    JButton button = new JButton("Button");
    JLabel count = new JLabel("");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    final int WIDTH = 400;
    final int HEIGHT = 100;

    public JFrameDisableButton2(){
        setSize(WIDTH, HEIGHT);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        count.setFont(bigFont);
        add(count);
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        countVal = countVal + 1;

        if (countVal == 8){
            button.setEnabled(false);
            count.setText("That's enough!");
        }
    }
}
