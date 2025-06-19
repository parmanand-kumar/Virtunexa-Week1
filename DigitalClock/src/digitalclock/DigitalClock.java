package digitalclock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DigitalClock {

	public static void main(String[] args) {
		
		// creating the main frame
		JFrame frame = new JFrame("Digital Clock");
		frame.setSize(500,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		// Creating a JLabel for the time display
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Courier New", Font.BOLD, 40));
		
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setOpaque(true);
		timeLabel.setBackground(new Color(0,62,64)); // dark blue color
		
		// Adding the label to the frame
		frame.add(timeLabel, BorderLayout.CENTER);
		
		// Timer to update the time every second
		Timer timer = new Timer(1000, e -> {
			String currentTime = new SimpleDateFormat("hh:mm:ss:a").format(new Date());
			timeLabel.setText(currentTime);
		});
		
		timer.start();
		frame.setVisible(true);
		
	}
}