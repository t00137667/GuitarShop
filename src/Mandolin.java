public class Mandolin extends Instrument {
    private String serialNumber;
    private double price;
    public MandolinSpec specification;



    public Mandolin(String serialNumber, double price, Builder builder, String model,
                  Type type, Wood backWood, Wood topWood, Style style) {
        super(serialNumber,price);
        MandolinSpec mandolinSpec = new MandolinSpec(builder, model, type, backWood, topWood, style);
        specification = mandolinSpec;
    }

    public Mandolin(String serialNumber, double price, MandolinSpec newSpec) {
        super(serialNumber, price);
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

    public MandolinSpec getSpec(){
        return specification;
    }


}