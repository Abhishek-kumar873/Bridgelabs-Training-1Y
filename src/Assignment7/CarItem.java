package Assignment7;
class CartItem {
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    void addItem(int qty) {
        quantity += qty;
    }
    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough quantity to remove!");
    }
    double totalCost() {
        return price * quantity;
    }
    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Book", 100, 2);
        item.addItem(3);
        item.removeItem(1);
        item.display();
    }
}