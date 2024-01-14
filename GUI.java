import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class GUI {
    static String date;

    GUI(String date) {
        this.date = date;
    }

    public static void basicGUI() {
        JFrame frame = new JFrame();
        Icon icon = new ImageIcon("C:\\Users\\Omen\\Downloads\\agent\\noman.gif"); // Use double backslashes or a forward slash in the path
        JLabel label = new JLabel();
        JLabel outcomeLabel = new JLabel();


        outcomeLabel.setVerticalTextPosition(JLabel.TOP);
        frame.add(outcomeLabel);

        label.setText("Welcome to Nomen Agent \t");

        frame.setTitle("Nomen Agent");
        frame.setResizable(false);
        label.setIcon(icon);

        // Set up Timer to update the time every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime curTime = LocalTime.now();
                label.setText("Welcome to Nomen Agent \t" + curTime.toString());
            }
        });
        timer.start();


        label.setHorizontalTextPosition(JLabel.HORIZONTAL);
        label.setVerticalTextPosition(JLabel.TOP);
        frame.add(label);

        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}
