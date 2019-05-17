import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JHistoricalFacts extends JFrame implements ActionListener {
    public static void main(String[] args) {
        JHistoricalFacts aFrame = new JHistoricalFacts();
        aFrame.setVisible(true);
    }

    int countVal = 0;
    JButton button = new JButton("Next Fact");
    ArrayList<String> factList = new ArrayList<>();
    JLabel fact = new JLabel("");
    Font bigFont = new Font("Arial", Font.BOLD, 16);
    final int WIDTH = 400;
    final int HEIGHT = 100;

    public JHistoricalFacts(){
        setSize(WIDTH, HEIGHT);
        factList.add(0, "Fact 1");
        factList.add(1, "Fact 2");
        factList.add(2, "Fact 3");
        factList.add(3, "Fact 4");
        factList.add(4, "Fact 5");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        fact.setFont(bigFont);
        add(fact);
        fact.setText(factList.get(0));
        add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        countVal = countVal + 1;
        if (countVal == 5){
            countVal = 0;
        }
        fact.setText(factList.get(countVal));
    }
}
