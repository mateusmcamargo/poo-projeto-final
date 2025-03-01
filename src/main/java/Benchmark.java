// Defines a benchmark for CPU and GPU performance
public interface Benchmark {

    // Benchmarks CPU performance based on the number of cores and frequency
    float benchCpu(int cores, int frequency);

    // Benchmarks GPU performance based on memory size and frequency
    float benchGpu(int memory, int frequency);
}
