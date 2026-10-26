package api;

public class OrderProcessor {
    private final InventoryService inventoryService;

    // Dependency Injection via constructor
    public OrderProcessor(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean processOrder(String itemId, int quantity) {
        // Check if the requested quantity is in stock
        boolean inStock = inventoryService.checkStock(itemId, quantity);

        if (inStock) {
            inventoryService.reserve(itemId, quantity);
            return true;
        }

        return false;
    }
}