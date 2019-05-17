import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JHistorIcalFacts extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JFrameDisableButton2 aFrame = new JFrameDisableButton2();
        aFrame.setVisible(true);
    }

    int countVal = 0;
    JButton button = new JButton("Button");
    JLabel count = new JLabel("");
    String fact1 = "Fact 1", fact2 = "Fact 2", fact3 = "Fact 3", fact4 = "Fact 4", fact5 = "Fact 5" ;
    ArrayList factList = new ArrayList();
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    final int WIDTH = 400;
    final int HEIGHT = 100;

    public JFrameDisableButton2(){
        setSize(WIDTH, HEIGHT);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        factList.add(0, "Fact 1");
        factList.add(1, "Fact 2");
        factList.add(2, "Fact 3");
        factList.add(3, "Fact 4");
        factList.add(4, "Fact 5");
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
