public class Gpu {

    // Attributes
    private String type;
    private String model;
    private int memory;
    private int frequency;

    // Constructors
    public Gpu() {}
    public Gpu(String type, String model, int memory, int frequency) {
        this.type = type;
        this.model = model;
        this.memory = memory;
        this.frequency = frequency;
    }

    // Sets GPU type
    public void setType(String type) { this.type = type; }

    // Sets GPU memory, throws exception if negative
    public void setMemory(int memory) throws NegativeNumberException {
        if (memory <= 0) throw new NegativeNumberException();
        this.memory = memory;
    }

    // Sets GPU model, throws exception if length is invalid
    public void setModel(String model) throws SmallStringException, BigStringException {
        if (model.length() < 2) throw new SmallStringException();
        if (model.length() > 15) throw new BigStringException();
        this.model = model;
    }

    // Sets GPU frequency, throws exception if negative
    public void setFrequency(int frequency) throws NegativeNumberException {
        if (frequency <= 0) throw new NegativeNumberException();
        this.frequency = frequency;
    }

    // Getters
    public String getType() { return type; }
    public String getModel() { return model; }
    public int getMemory() { return memory; }
    public int getFrequency() { return frequency; }
}
