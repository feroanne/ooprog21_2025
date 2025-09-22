import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                break;
            }

            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "You haven't entered a name. Please provide your name to continue.", "Input Required", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Would you like your name to be displayed?",
                    "Show Name Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (confirm == JOptionPane.NO_OPTION) {
                continue;
            } else {
                System.exit(0);
            }
        }
    }
}

