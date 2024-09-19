import javax.swing.*;

public class EmailPasswordForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Email and Password Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 20, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 20, 165, 25);
        panel.add(emailText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 80, 80, 25);
        panel.add(submitButton);
    }
}
