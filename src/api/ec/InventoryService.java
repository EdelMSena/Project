package api.ec;

public interface InventoryService {
    boolean checkStock(String itemId, int quantity);
    void reserve(String itemId, int quantity);
}