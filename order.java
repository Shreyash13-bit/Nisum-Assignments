class Cart {
    String itemName;
    double itemValue;
    int itemId;

    Cart(String itemName, double itemValue, int itemId) {
        if (itemName == null || itemName.isEmpty() || itemValue <= 0 || itemId <= 0) {
            throw new IllegalArgumentException("Invalid cart item data");
        }
        this.itemName = itemName;
        this.itemValue = itemValue;
        this.itemId = itemId;
    }
}

public class order {
    public static void main(String[] args) {
        Cart[] items = {
            new Cart("Pen", 10.0, 101),
            new Cart("Notebook", 50.0, 102),
            new Cart("Bag", 500.0, 103)
        };

        int itemCount = items.length;
        double orderTotal = 0;

        for (Cart item : items) {
            orderTotal += item.itemValue;
        }

        System.out.println("Order Summary:");
        System.out.println("Items Count: " + itemCount);
        System.out.println("Order Total: Rs" + orderTotal);
    }
}
