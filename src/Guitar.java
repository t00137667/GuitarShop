public class Guitar extends Instrument {
    private String serialNumber;
    private double price;
    public GuitarSpec specification;



    public Guitar(String serialNumber, double price, Builder builder, String model, Strings numStrings,
                  Type type, Wood backWood, Wood topWood) {
        GuitarSpec newSpec = new GuitarSpec(builder, model, numStrings, type,backWood,topWood);
        this.serialNumber = serialNumber;
        this.price = price;
        specification = newSpec;
        }

    public Guitar(String serialNumber, double price, GuitarSpec newSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        specification = newSpec;
    }

    public String getSerialNumber(){
        return serialNumber;
    }
    public double getPrice(){
        return price;
    }

    private void setPrice(double newPrice){
        this.price = newPrice;
    }

    public GuitarSpec getSpec(){
        return specification;
    }


}
