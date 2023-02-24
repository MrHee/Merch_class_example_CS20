public class merch {

    //Create our PROPERTIES

   private double price;
   String name;
   private int quantityInStock;


   //Getters and Setters

    double getPrice(){
        return price;
    }

    int getQuantity(){
        return quantityInStock;
    }

    //Example setter
    void setQuantity(int newQuantity){
        quantityInStock = newQuantity;

    }





    //Constructor
    merch(String name, double price, int quantityInStock){

        this.name = name;
        this.price = price;
        this.quantityInStock=quantityInStock;

    }

    void restock(int newStock){
        quantityInStock += newStock;
    }

    double sell( int quantitySold ){

        if(quantitySold > quantityInStock){
            System.out.println("ERROR: There are only " + quantityInStock + " " + name + " in stock. ");
            System.out.println("Sale cancelled");

            return 0d;

        }
        else{
            quantityInStock -= quantitySold;
            return (price*quantitySold);

        }

    }


}
