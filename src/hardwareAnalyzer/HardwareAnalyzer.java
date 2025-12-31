package hardwareAnalyzer;

import java.util.Properties;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class HardwareAnalyzer {

    // Info about OS, OS user, Java runtime
    public void printBasicSystemInfo() {
        Properties props = System.getProperties();
        Runtime runtime = Runtime.getRuntime();

        System.out.println("===BASIC SYSTEM INFO===");
        System.out.println("Operation system: " + props.getProperty("os.name"));
        System.out.println("OS version" + props.getProperty("os.version"));
        System.out.println("OS architecture" + props.getProperty("os.arch"));

        System.out.printf("\nUser name: " + props.getProperty("user.name") + "\n");
        System.out.printf("User dir: " + props.getProperty("user.dir"));
        System.out.println("User country: " + System.getProperty("user.country"));

        System.out.printf("\nJava runtime name: " + System.getProperty("java.runtime.name") + "\n");
        System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
    }

    // Info about CPU
    public void printCpuInfo() {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("===CPU INFO===");
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.printf("Count of cores" + cores);

        // load average for last min
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        double loadAverage = osBean.getSystemLoadAverage();
        if (loadAverage >= 0) {
            System.out.printf("Avarage load: %.2f%n", loadAverage);
        } else {
            System.out.println("Avarage load is unavailable");
        }
    }
}
