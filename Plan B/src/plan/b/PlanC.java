 import javax.swing.*; // Needed for Swing classes
 import java.awt.event.*; // Needed for event listener interface
  package plan.b;
 /**
5 This class demonstrates how to retrieve the action command
6 from an event object.
7 */

 public class PlanC extends JFrame
 {
 private JButton button1; // Button 1
 private JButton button2; // Button 2
 private JButton button3; // Button 3
 private JPanel panel; // A panel to hold components
 private final int WINDOW_WIDTH = 300; // Window width
 private final int WINDOW_HEIGHT = 70; // Window height


 public EventObject()
 {
 // Set the title bar text.
 setTitle("Event Object Demonstration");
// Set the size of the window.
 setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
 // Specify what happens when the close button is clicked.
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create the three buttons.
 button1 = new JButton("Button 1");
 button2 = new JButton("Button 2");
 button3 = new JButton("Button 3");

 // Register an event listener with all 3 buttons.
 button1.addActionListener(new ButtonListener());
 button2.addActionListener(new ButtonListener());
 button3.addActionListener(new ButtonListener());

 panel = new JPanel();
 panel.add(button1);
 panel.add(button2);
 panel.add(button3);


 add(panel);

 setVisible(true);
 }

 private class ButtonListener implements ActionListener
 {
 public void actionPerformed(ActionEvent e)
 
 {

 String actionCommand = e.getActionCommand();

 if (actionCommand.equals("Button 1"))
 {
 JOptionPane.showMessageDialog(null, "You clicked " +
 "the first button.");
 }
 else if (actionCommand.equals("Button 2"))
 {
 JOptionPane.showMessageDialog(null, "You clicked " +
 "the second button.");
 }
 else if (actionCommand.equals("Button 3"))
 {
 JOptionPane.showMessageDialog(null, "You clicked " +
 "the third button.");
 }
 }
 }

 
 }