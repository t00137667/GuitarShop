public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style){
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }


    public boolean matches(MandolinSpec spec) {

        if (this.getBuilder() != spec.getBuilder())
            return false;

        if (this.getModel() != spec.getModel())
            return false;

        if (this.getStyle() != spec.getStyle())
            return false;

        if (this.getType() != spec.getType())
            return false;

        if (this.getBackwood() != spec.getBackwood())
            return false;

        if (this.getTopwood() != spec.getTopwood())
            return false;

        return true;
    }


    public Style getStyle(){
        return style;
    }
}
