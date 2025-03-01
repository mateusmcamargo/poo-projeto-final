import javax.swing.JOptionPane;

public class SmallStringException extends Exception {
    
    // Displays a warning if the name is too short
    public void smallName() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O nome deve conter pelo menos 2 caracteres.",
            "Nome Inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }
    
    // Displays a warning if the model name is too short
    public void smallModel() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O modelo deve conter pelo menos 2 caracteres.",
            "Modelo inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }
}
