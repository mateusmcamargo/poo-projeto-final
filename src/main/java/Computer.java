// NOME: Mateus de Melo Camargo
// RA......: 2564548

public abstract class Computer {

    // Attributes
    private String name;
    private String type;
    private int memory;
    private int storage;
    private boolean hasKeyboard;
    private boolean hasMouse;
    private boolean hasDisplay;
    private boolean hasCamera;

    // Essential components
    private Cpu cpu = new Cpu();
    private Gpu gpu = new Gpu();

    // Optional components
    private Display display = new Display();
    private Camera camera = new Camera();

    // Benchmark constants
    private static final float CPU_BIAS = 0.0735f;
    private static final float GPU_BIAS = 0.8337f;

    // Constructors
    public Computer() {}
    public Computer(String name, String type, boolean hasKeyboard, boolean hasMouse,
                    boolean hasDisplay, boolean hasCamera, int memory, int storage, Cpu cpu, Gpu gpu) {
        this.name = name;
        this.type = type;
        this.hasKeyboard = hasKeyboard;
        this.hasMouse = hasMouse;
        this.hasDisplay = hasDisplay;
        this.hasCamera = hasCamera;
        this.memory = memory;
        this.storage = storage;
        this.cpu = cpu;
        this.gpu = gpu;
    }
    public Computer(String name, String type, boolean hasKeyboard, boolean hasMouse,
                    boolean hasDisplay, boolean hasCamera, int memory, int storage, Cpu cpu, Gpu gpu, Display display) {
        this(name, type, hasKeyboard, hasMouse, hasDisplay, hasCamera, memory, storage, cpu, gpu);
        this.display = display;
    }
    public Computer(String name, String type, boolean hasKeyboard, boolean hasMouse,
                    boolean hasDisplay, boolean hasCamera, int memory, int storage, Cpu cpu, Gpu gpu, Display display, Camera camera) {
        this(name, type, hasKeyboard, hasMouse, hasDisplay, hasCamera, memory, storage, cpu, gpu, display);
        this.camera = camera;
    }

    // Benchmarks CPU performance
    public float benchCpu(int cores, int frequency) { return ((cores * frequency) * CPU_BIAS); }
    public float benchCpu() { return ((cpu.getCores() * cpu.getFrequency()) * CPU_BIAS); }

    // Benchmarks GPU performance
    public float benchGpu(int memory, int frequency) { return ((memory * frequency) * GPU_BIAS); }
    public float benchGpu() { return ((gpu.getMemory() * gpu.getFrequency()) * GPU_BIAS); }

    // Setters with exceptions
    public void setName(String name) throws SmallStringException, BigStringException {
        if (name.length() < 2)   throw new SmallStringException();
        if (name.length() > 15) throw new BigStringException();
        this.name = name;
    }
    public void setMemory(int memory) throws NegativeNumberException {
        if (memory <= 0) throw new NegativeNumberException();
        this.memory = memory;
    }
    public void setStorage(int storage) throws NegativeNumberException {
        if (storage <= 0) throw new NegativeNumberException();
        this.storage = storage;
    }

    // Name and boolean setters
    public void setType(String type) { this.type = type; }
    public void setHasKeyboard(boolean hasKeyboard) { this.hasKeyboard = hasKeyboard; }
    public void setHasMouse(boolean hasMouse) { this.hasMouse = hasMouse; }
    public void setHasDisplay(boolean hasDisplay) { this.hasDisplay = hasDisplay; }
    public void setHasCamera(boolean hasCamera) { this.hasCamera = hasCamera; }

    // Component setters
    public void setCpu(Cpu cpu) { this.cpu = cpu; }
    public void setGpu(Gpu gpu) { this.gpu = gpu; }
    public void setDisplay(Display display) { this.display = display; }
    public void setCamera(Camera camera) { this.camera = camera; }

    // Getters
    public String getName() { return this.name; }
    public String getType() { return this.type; }
    public boolean getHasKeyboard() { return this.hasKeyboard; }
    public boolean getHasMouse() { return this.hasMouse; }
    public boolean getHasDisplay() { return this.hasDisplay; }
    public boolean getHasCamera() { return this.hasCamera; }
    public int getMemory() { return this.memory; }
    public int getStorage() { return this.storage; }
    public Cpu getCpu() { return cpu; }
    public Gpu getGpu() { return gpu; }
    public Display getDisplay() { return display; }
    public Camera getCamera() { return camera; }
}
