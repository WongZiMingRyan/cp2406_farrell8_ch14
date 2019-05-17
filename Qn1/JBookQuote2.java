import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JBookQuote implements ActionListener{
    public static void main(String[] args) {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setVisible(true);}

    JButton TitleButton = new JButton("Book Title");
    JLabel title = new JLabel("");

    public JBookQuote2() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setSize(WIDTH, HEIGHT);
        quote.setFont(bigFont);
        add(quote);
        add(TitleButton);
        add(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TitleButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String booktitle = "This is the title";
        title.setText(booktitle);
    }


}
