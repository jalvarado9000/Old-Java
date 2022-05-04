import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ahora {

    public static void main(String[] args) {
        Object[] options1 = { "English", "Spanish",
                "Quit" };

        
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Choose your Language"));
        
        
        
        //JTextField textField = new JTextField(10);
        //panel.add(textField);

        int result = JOptionPane.showOptionDialog(null, panel, "Currency Exchange Machine",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
        /*if (result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, textField.getText());
        }*/
    }
}