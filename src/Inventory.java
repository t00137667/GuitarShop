import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type,  Wood backWood, Wood topWood){
        GuitarSpec newSpec = new GuitarSpec(builder,model,type,backWood,topWood);
        Guitar guitar = new Guitar(serialNumber,price,newSpec);
        guitars.add(guitar);
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

            if(searchGuitar.getBuilder() != guitar.getSpec().getBuilder()){
                System.out.println("Builder Match");
                continue;
            }


            if (searchGuitar.getModel() != guitar.getSpec().getModel())
                continue;

            if (searchGuitar.getType() != guitar.getSpec().getType())
                continue;

            if (searchGuitar.getBackwood() != guitar.getSpec().getBackwood())
                continue;

            if (searchGuitar.getTopwood() != guitar.getSpec().getTopwood())
                continue;

            guitarList.add(guitar);
        }
        return guitarList;
    }
}
