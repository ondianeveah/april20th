package pcLab;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    public Monitor( String model, String manufacturer, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;

    }

    private Resolution getResolution() {
        return resolution;
    }

    private String getModel() {
        return "";
    }

    private String getManufacturer() {
        return "";
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color: " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
