package pcLab;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;


    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return "H240";
    }

    public String getManufacturer() {
        return "";
    }

    public String getPowerSupply() {
        return "";
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
