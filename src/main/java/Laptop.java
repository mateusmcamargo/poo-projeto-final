public class Laptop extends Computer implements Benchmark {

    // Constructors
    public Laptop() {}
    public Laptop(String name, boolean hasMouse, int memory, int storage, Cpu cpu, Gpu gpu, Display display) {
        super(name, "laptop", true, hasMouse, true, false, memory, storage, cpu, gpu, display);
    }
    public Laptop(String name, boolean hasMouse, int memory, int storage, Cpu cpu, Gpu gpu, Display display, Camera camera) {
        super(name, "laptop", true, hasMouse, true, true, memory, storage, cpu, gpu, display, camera);
    }
}
