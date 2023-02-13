import java.util.ArrayList;
import java.util.Scanner;

public class userInterface {

    double cash_on_hand = 100.0;
    ArrayList<merch> inventory;
    Scanner input;

    userInterface() {
        //ArrayList for storing a list of objects.
        inventory = new ArrayList<>();
        input = new Scanner(System.in); //Plug that memory leak, you memory plumber

        //Adds the default items to the inventory. Replace this with file input if we have time.
        merch i0001 = new merch("Pool Noodle", 1000000.00, 32);
        merch i0002 = new merch("Expired Milk", 9.50, 5);
        merch i0003 = new merch("Canned Soup", 3.50, 10);
        merch i0004 = new merch("Stegosaurus", 0.01, 5000000);

        inventory.add(i0001);
        inventory.add(i0002);
        inventory.add(i0003);
        inventory.add(i0004);

    }

    void display(){

        for ( merch item : inventory
        ) {
            System.out.println(item.name);
            System.out.println("          " + item.quantityInStock + "          $" + item.price
            );

        }
    }

    void addNewItem(){
        System.out.println("Welcome to the New Product Wizard!");


        System.out.println("Please enter the name of the new product: ");
        String tempName = input.nextLine();

        System.out.println("What is the price of the new product?");
        double tempPrice = input.nextDouble();
        input.nextLine(); //Purge the scanner. Avoid bug.

        System.out.println("How many of this new item are in stock?");
        int tempStock = input.nextInt();
        input.nextLine();

        //Create the object with these temp properties.

        merch tempMerch = new merch(tempName, tempPrice,tempStock);

        inventory.add(tempMerch);
    }

    void removeItem(){
        System.out.println("Welcome to the Remove Product Wizard");

        System.out.println("Enter the name of the product you want to remove. ");
        String targetName = input.nextLine();
        merch target = null;

        //Find the target in list.
        for (merch item : inventory
             ) {
            if(item.name == targetName){
                target = item;  //Found it.
            }
        }


        //Delete the target - must be seperate.
        if( target != null){
            inventory.remove(target);
        }else{
            System.out.println("Not found.");
        }


    }








}
