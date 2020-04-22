package pcLab;

public class PcLabMain {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 55, 5);
        Case cAse = new Case("H420", "Sony", "240 volts", dimensions );
        Resolution resolution = new Resolution(10, 10);
        Monitor monitor = new Monitor("55 inch monster", "HP", resolution);
        Motherboard motherboard = new Motherboard("BJ-300", "Pentium", 4, 5, "v.244");
        PC pc = new PC(cAse, motherboard, monitor);
        System.out.println(pc.description());
        System.out.println(cAse.toString());
        System.out.println(monitor.toString());
        System.out.println(motherboard.toString());
        cAse.pressPowerButton();
        monitor.drawPixelAt(10, 10, "blue");
        motherboard.loadProgram();
    }
}
