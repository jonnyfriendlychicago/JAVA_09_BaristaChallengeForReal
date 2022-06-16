import java.util.ArrayList; 

class Order {

    private String customerName; 
    private boolean orderIsReady;
    private double fullOrderPrice; 
    private ArrayList<Item> orderItemsAL = new ArrayList<Item>(); 
    
    public String customerNameGetter() {return customerName; }
    public void customerNameSetter(String customerName) {customerName = this.customerName; }

    public boolean orderIsReadyGetter() {return orderIsReady; }
    public void orderIsReadySetter(boolean orderIsReady) {orderIsReady = this.orderIsReady; }

    public double fullOrderPriceGetter() {return fullOrderPrice; }
    public void fullOrderPriceSetter(double fullOrderPrice) {fullOrderPrice = this.fullOrderPrice; }

    public ArrayList<Item> orderItemsALGetter() {return orderItemsAL; }
    public void orderItemsALSetter(ArrayList<Item> orderItemsAL) {orderItemsAL = this.orderItemsAL; }


    // below is a nice test, but no related to assignment
    // public void somethingMthd(String incomingVariableForBelow) {

    //     System.out.println(incomingVariableForBelow); 

    // }

    // note to self: needs to say "Item" i.e. name of class that's being used. 
    // ALSO, put 'void' after public, as shown below, when there's no need to return anything. 
    
    //instantiate object of this class
    public Order(String customerName) {
        this.customerName = customerName; 
    }

    public void addItemToOrderMethod(Item incomingObj) {

        orderItemsAL.add(incomingObj); 

    }

    public void updateOrderStatus(String incomingStringVar) {
        if (incomingStringVar == "ready")  {
            orderIsReady = true; 
        }
        else {
            orderIsReady = false; 
        }; 
    }

    public void getOrderFullReadOut () {
        System.out.printf("Customer Name: %s \n", customerName ); 
        System.out.println("Ordered Items:"); 
        int itemNumberForDisplay = 1; 
        
        // for (int i = 0; i < orderItemsAL.size(); i++) {
        // below replaces line above
        for ( Item itemObjectInTheArray : orderItemsAL) {
            System.out.println("Item #" + itemNumberForDisplay + ": " + itemObjectInTheArray.itemNameGetter() + " $" + itemObjectInTheArray.itemPriceGetter() ); 
            itemNumberForDisplay += 1; 
        }

        // for (int i = 0; i < orderItemsAL.size(); i++) {
        // below line replaces above line
        for (Item itemObjectInTheArray : orderItemsAL ) {
            fullOrderPrice += itemObjectInTheArray.itemPriceGetter(); 
        }
        
        System.out.printf("Total: $%s\n", fullOrderPrice); 

        String orderIsReadyPrintVersion; 
        if (orderIsReady) {
            orderIsReadyPrintVersion = ("Order Ready!"); 
        }
        else {
            orderIsReadyPrintVersion = ("Working on it!"); 
        }; 

        System.out.println("Order Status: " + orderIsReadyPrintVersion); 
    }

    // public String initiateOrderMthd(String incomingCustomerName) {
        
    //     Order.customerName = incomingCustomerName; 
    //     System.out.println("order created::: \n Customer Name: " + incomingCustomerName); 
    //     return "yeppers"; 
    // }
}