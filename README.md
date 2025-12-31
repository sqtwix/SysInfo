**System Info Analyzer**

A simple console-based Java application that displays key hardware and system information about your computer using built-in Java libraries.
Features

Operating System Info: OS name, version, architecture, user details, and Java runtime information.
CPU Info: Number of available processor cores and system load average (where supported).
Disk Info: List of available drives with total volume, free space, and usable space (formatted in MB).

The application provides a clean, structured output in the console, making it easy to quickly check your system's basic specifications.
Requirements

Java **8 or higher**

**How to Run**
Compile the source files:

  ```javac hardwareAnalyzer/HardwareAnalyzer.java Main.java```

Run the application:

 ``` java Main ```

**Future Improvements**
- Add adaptive byte formatting (GB/TB support)
- Export results to a text file
- Interactive menu for selective information display
Integration with OSHI library for advanced hardware details (CPU model, RAM size, etc.)

Feel free to fork and contribute! 🚀
