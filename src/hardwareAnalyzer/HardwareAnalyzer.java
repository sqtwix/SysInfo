package hardwareAnalyzer;

import java.util.Properties;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.io.File;

public class HardwareAnalyzer {

    // Printing info about OS, OS user, Java runtime
    public void printBasicSystemInfo() {
        Properties props = System.getProperties();
        Runtime runtime = Runtime.getRuntime();

        printLine();
        printTitle("SYSTEM INFO");
        System.out.printf("\nOperation system: " + props.getProperty("os.name") + "\n");
        System.out.println("OS version: " + props.getProperty("os.version"));
        System.out.println("OS architecture: " + props.getProperty("os.arch"));

        System.out.printf("\nUser name: " + props.getProperty("user.name") + "\n");
        System.out.printf("User dir: " + props.getProperty("user.dir") + "\n");
        System.out.println("User country: " + System.getProperty("user.country"));

        System.out.printf("\nJava runtime name: " + System.getProperty("java.runtime.name") + "\n");
        System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
        printLine();
    }

    // Printing info about CPU
    public void printCpuInfo() {
        Runtime runtime = Runtime.getRuntime();

        System.out.println();
        printLine();
        printTitle("CPU INFO");
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Count of cores: " + cores);

        // load average for last min
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        double loadAverage = osBean.getSystemLoadAverage();
        if (loadAverage >= 0) {
            System.out.printf("Avarage load: %.2f%n", loadAverage);
        } else {
            System.out.println("Avarage load is unavailable");
        }
        printLine();
    }


    // Printing info about disks
    public void printDiskInfo() {

        System.out.println();
        printLine();
        printTitle("DISK INFO");

        File[] roots = File.listRoots();
        for (File root:roots){
            System.out.printf("\nDick: " + root.getAbsolutePath() + "\n");
            System.out.println("Volume: " + root.getTotalSpace());
            System.out.println("Free space: " + root.getFreeSpace());
            System.out.println("Usable space: "+ root.getUsableSpace());
        }

        printLine();
    }

    public void printLine() {
        System.out.println("-".repeat(40));
    }

    public void printTitle(String name) {
        System.out.printf("===" + name.toUpperCase() + "===");
    }
}
