package GuiPractice;

import javax.swing.*;

public class SimpleGUI {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("My First GUI");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // absolute positioning
		
		// text field
//		JTextField textField = new JTextField();
//		textField.setBounds(20, 20, 150, 25);

		// button
		JButton button = new JButton("Click Me");
		button.setBounds(180, 20, 90, 25);

		// label
		JLabel label = new JLabel("Hello!");
		label.setBounds(20, 60, 250, 25);
		
		//combobox
		JComboBox<String> box = new JComboBox(new String [] {"Leslie", "Gabby", "Evie"});
		box.setBounds(20, 20, 150, 25);
		
		// Add components to the frame
//		frame.add(textField);
		frame.add(button);
		frame.add(label);
		frame.add(box);
		
		button.addActionListener(e -> {
//		    String name = textField.getText();
		    String name = "" + box.getSelectedItem();
//		    String name = box.getName();
		    label.setText("Hello, " + name + "!");
		});
		
		frame.setVisible(true); 
		
		}
	}


