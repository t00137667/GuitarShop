import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Wood.ALDERWOOD, Wood.ALDERWOOD);

        List guitars = inventory.search(whatLookingFor);

        if (!guitars.isEmpty()){
            for(Iterator i = guitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar) i.next();
                System.out.println(guitar.getSerialNumber() + " \n"
                        + guitar.getSpec().getBuilder() + " \n"
                        + guitar.getSpec().getModel() + " \n"
                        + guitar.getPrice() + " \n"
                        + guitar.getSpec().getType() + " \n"
                        + guitar.getSpec().getTopwood() + " \n"
                        + guitar.getSpec().getBackwood());
            }

            //System.out.println("You might like this: " + guitar.getSerialNumber() + " " +
            //guitar.getPrice()); //and whatever other details you desire
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,
                Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDERWOOD,
                Wood.ALDERWOOD);

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER,
                "Stratocastor",
                Type.ACOUSTIC,
                Wood.ALDERWOOD,
                Wood.ALDERWOOD);

    }
}
