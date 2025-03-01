public class DeskTop extends Computer implements Benchmark {

    // Constructors
    public DeskTop() {}
    public DeskTop(String name, int memory, int storage, Cpu cpu, Gpu gpu) {
        super(name, "desktop", false, false, false, false, memory, storage, cpu, gpu);
    }
    public DeskTop(String name, boolean hasKeyboard, boolean hasMouse, int memory, int storage, Cpu cpu, Gpu gpu, Display display) {
        super(name, "desktop", hasKeyboard, hasMouse, true, false, memory, storage, cpu, gpu, display);
    }
    public DeskTop(String name, boolean hasKeyboard, boolean hasMouse, int memory, int storage, Cpu cpu, Gpu gpu, Display display, Camera camera) {
        super(name, "desktop", hasKeyboard, hasMouse, true, true, memory, storage, cpu, gpu, display, camera);
    }
}
