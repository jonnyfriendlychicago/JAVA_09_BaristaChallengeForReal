class Item {

    private String itemName; 
    private double itemPrice; 
    
    public Item() {

    }

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName; 
        this.itemPrice = itemPrice; 
    }

    public String itemNameGetter() {return itemName; }
    public void itemNameSetter(String itemName) {itemName = this.itemName; }
    public double itemPriceGetter() {return itemPrice; }
    public void itemPriceSetter(double itemPrice) {itemPrice = this.itemPrice; }
    
}