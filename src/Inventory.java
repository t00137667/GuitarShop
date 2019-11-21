import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    /*public void addGuitar(String serialNumber, double price, Builder builder, String model, Strings numStrings,
                          Type type,  Wood backWood, Wood topWood){
        GuitarSpec newSpec = new GuitarSpec(builder,model,numStrings,type,backWood,topWood);
        Guitar guitar = new Guitar(serialNumber,price,newSpec);
        guitars.add(guitar);
    }*/

    public void addInstrument(String serialNumber, double price, Builder builder, String model,,
                              Type type,  Wood backWood, Wood topWood, Strings numStrings){

    }
    public void addInstrument(String serialNumber, double price, Builder builder, String model,,
                              Type type,  Wood backWood, Wood topWood, Style style){

    }
    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){

        Instrument instrument;

        if (spec instanceof GuitarSpec)
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);

        else if(spec instanceof GuitarSpec)
            instrument = new Mandolin()
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar) {

        List<Guitar> guitarList = new LinkedList<>();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is unique

            if(guitar.getSpec().matches(searchGuitar))
                guitarList.add(guitar);
        }
        return guitarList;
    }


}
