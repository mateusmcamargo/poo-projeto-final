// NOME: Mateus de Melo Camargo
// RA......: 2564548

public class Cpu {

    // Attributes
    private String model;
    private int cores;
    private int frequency;

    // Constructors
    public Cpu() {}
    public Cpu(String model, int cores, int frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    // Sets model, throws exception if length is invalid
    public void setModel(String model) throws SmallStringException, BigStringException {
        if (model.length() < 2) throw new SmallStringException();
        if (model.length() > 15) throw new BigStringException();
        this.model = model;
    }

    // Sets cores, throws exception if negative
    public void setCores(int cores) throws NegativeNumberException {
        if (cores <= 0) throw new NegativeNumberException();
        this.cores = cores;
    }

    // Sets frequency, throws exception if negative
    public void setFrequency(int frequency) throws NegativeNumberException {
        if (frequency <= 0) throw new NegativeNumberException();
        this.frequency = frequency;
    }

    // Getters
    public String getModel() { return model; }
    public int getCores() { return cores; }
    public int getFrequency() { return frequency; }
}