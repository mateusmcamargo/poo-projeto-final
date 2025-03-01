public class Server extends Computer implements Benchmark {

    // Constructors
    public Server() {}
    public Server(String name, int memory, int storage, Cpu cpu, Gpu gpu) {
        super(name, "server", false, false, false, false, memory, storage, cpu, gpu);
    }
}