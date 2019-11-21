public class GuitarSpec extends InstrumentSpec{

    private Strings numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Strings numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec spec) {

        if (this.getBuilder() != spec.getBuilder())
            return false;

        if (this.getModel() != spec.getModel())
            return false;

        if (this.getNumStrings() != spec.getNumStrings())
            return false;

        if (this.getType() != spec.getType())
            return false;

        if (this.getBackwood() != spec.getBackwood())
            return false;

        if (this.getTopwood() != spec.getTopwood())
            return false;

        return true;
    }

    public Strings getNumStrings(){ return numStrings; }
    public Type getType(){
        return type;
    }
    public Wood getBackwood(){
        return backWood;
    }
    public Wood getTopwood(){
        return topWood;
    }
}
