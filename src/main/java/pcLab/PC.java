package pcLab;

public class PC {
   private Case cAse;
   private Motherboard motherboard;
   private Monitor monitor;


    public PC(Case cAse, Motherboard motherboard, Monitor monitor) {
        this.cAse = cAse;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixelAt(5, 5, "blue");
    }

    public String description(){
        return "Welcome to worst buy, below is the description of the pc on sale today: ";
    }
}
