public abstract class InstrumentSpec {
    protected Builder builder;
    protected String model;
    protected Type type;
    protected Wood backWood;
    protected Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean matches(InstrumentSpec spec){
        if (this.getBuilder() != spec.getBuilder())
            return false;

        if (this.getModel() != spec.getModel())
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
