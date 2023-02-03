import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       merch i0001 = new merch("Pool Noodle", 1000000.00, 32);
        merch i0002 = new merch("Expired Milk", 9.50, 5);
        merch i0003 = new merch("Canned Soup", 3.50, 10);
        merch i0004 = new merch("Stegosaurus", 0.01, 5000000);

        //ArrayList for storing a list of objects.
        ArrayList<merch> inventory = new ArrayList<>();

        inventory.add(i0001);
        inventory.add(i0002);
        inventory.add(i0003);
        inventory.add(i0004);

        //For each loop to iterate through our ArrayList

        for ( merch item : inventory
             ) {
            System.out.println(item.name);
            System.out.println("          " + item.quantityInStock + "          $" + item.price
            );

        }

        }




    }
