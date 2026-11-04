package api.ec;

public class OrderProcessor {
    private final InventoryService inventoryService;

    public OrderProcessor(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public boolean processOrder(String itemId, int quantity) {
        boolean inStock = inventoryService.checkStock(itemId, quantity);

        if (inStock) {
            inventoryService.reserve(itemId, quantity);
            return true;
        }

        return false;
    }
}