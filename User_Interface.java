import javax.swing.*;
import java.awt.*;

public class User_Interface implements ActionListener {
    private Timer timer;
    private JLabel timeLabel;
    private JButton tickButton;

    public User_Interface() {
        timer = new Timer();
        
        JFrame frame = new JFrame("Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        timeLabel = new JLabel(formatTime(), SwingConstants.CENTER);
        timeLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        
        tickButton = new JButton("Tick");
        tickButton.addActionListener(this);
        
        frame.getContentPane().add(timeLabel, BorderLayout.CENTER);
        frame.getContentPane().add(tickButton, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }

    private String formatTime() {
        return String.format("%02d:%02d:%02d", timer.getHours(), timer.getMinutes(), timer.getSeconds());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.tick();
        timeLabel.setText(formatTime());
    }

    public static void main(String[] args) {
        new User_Interface();
    }
}