import javax.swing.JOptionPane;

// Handles oversized strings
public class BigStringException extends Exception {

    // Displays a warning for names longer than 15 characters
    public void bigName() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O nome não pode conter mais de 15 caracteres.",
            "Nome inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning for models longer than 15 characters
    public void bigModel() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O modelo não pode conter mais de 15 caracteres.",
            "Modelo inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }
}
