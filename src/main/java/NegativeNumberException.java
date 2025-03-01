import javax.swing.JOptionPane;

public class NegativeNumberException extends RuntimeException {

    // Displays a warning if CPU cores are less than 1
    public void negativeCores() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O processador deve ter pelo menos 1 núcleo.",
            "Dados do processador inválidos",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if frequency is less than 1
    public void negativeFrequency() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O valor da frequência deve ser maior que 1.",
            "Valor da frequência inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if display size in inches is less than 1
    public void negativeInches() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O valor em polegadas deve ser maior que 1.",
            "Tamanho do Display inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if memory is less than 1
    public void negativeMemory() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! A quantidade de memória deve ser maior que 1.",
            "Valor da memória inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if resolution is less than 1
    public void negativeResolution() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! O valor da resolução deve ser maior que 1.",
            "Valor da resolução inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }

    // Displays a warning if storage is less than 1
    public void negativeStorage() {
        JOptionPane.showMessageDialog(
            null,
            "ATENÇÃO! A quantidade de armazenamento deve ser maior que 1.",
            "Valor do armazenamento inválido",
            JOptionPane.WARNING_MESSAGE
        );
    }
}