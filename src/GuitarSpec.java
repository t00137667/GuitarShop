public class GuitarSpec {

    private Builder builder;
    private String model;
    private Strings numStrings;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Strings numStrings, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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


    public Builder getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
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
