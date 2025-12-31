//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import hardwareAnalyzer.*;

public final String CYAN = "\u001B[36m";
public static final String RESET = "\u001B[0m";


void main() {
    printHeadLabel();

    HardwareAnalyzer analyzer = new HardwareAnalyzer();

    analyzer.printBasicSystemInfo();
    analyzer.printCpuInfo();
    analyzer.printDiskInfo();
}

public void printHeadLabel() {
    System.out.println(CYAN + "===SysInfo===" + RESET);
}