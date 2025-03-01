import javax.swing.JOptionPane;

public class ScannerFormatException extends Exception {
    
    // Displays a warning if the input is not a valid integer
    public void scannerInvalidInteger() {
        JOptionPane.showMessageDialog(
            null,
            "Por favor, insira um numero INTEIRO válido.",
            "Número inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if the input is not a valid decimal number
    public void scannerInvalidFloat() {
        JOptionPane.showMessageDialog(
            null,
            "Por favor, insira um numero DECIMAL válido.",
            "Número inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }
}
