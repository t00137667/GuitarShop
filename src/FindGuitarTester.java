import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, "Stratocastor",Strings.SIX , Type.ACOUSTIC, Wood.ALDERWOOD, Wood.ALDERWOOD);

        List guitars = inventory.search(whatLookingFor);

        if (!guitars.isEmpty()){
            for(Iterator i = guitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar) i.next();
                System.out.println("Serial Number: " + guitar.getSerialNumber() + " \n"
                        + "Builder: " + guitar.getSpec().getBuilder() + " \n"
                        + "Model: "+ guitar.getSpec().getModel() + " \n"
                        + "Strings: "+ guitar.getSpec().getNumStrings() + "\n"
                        + "Price €: "+ guitar.getPrice() + " \n"
                        + "Type: "+ guitar.getSpec().getType() + " \n"
                        + "Top Wood: "+ guitar.getSpec().getTopwood() + " \n"
                        + "Back Wood: "+ guitar.getSpec().getBackwood());
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
                Strings.TWELVE,
                Type.ELECTRIC,
                Wood.ALDERWOOD,
                Wood.ALDERWOOD);

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER,
                "Stratocastor",
                Strings.SIX,
                Type.ACOUSTIC,
                Wood.ALDERWOOD,
                Wood.ALDERWOOD);

        inventory.addGuitar("V00003",
                1699.99,
                Builder.GIBSON,
                "Les Paul",
                Strings.SIX,
                Type.ELECTRIC,
                Wood.CEDAR,
                Wood.MAHOGANY);

        inventory.addGuitar("V00005",
                1699.99,
                Builder.FENDER,
                "Stratocastor",
                Strings.SIX,
                Type.ACOUSTIC,
                Wood.ALDERWOOD,
                Wood.ALDERWOOD);

    }
}
