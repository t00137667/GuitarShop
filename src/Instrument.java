public abstract class Instrument {
    private String serialNumber;
    private double price;
    public InstrumentSpec specification;

    public Instrument(String serialNumber, double price){
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public Instrument(String serial, double price, InstrumentSpec spec){
        this.serialNumber = serial;
        this.price = price;
        this.specification = spec;
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

    public InstrumentSpec getSpec(){
        return specification;
    }
}
