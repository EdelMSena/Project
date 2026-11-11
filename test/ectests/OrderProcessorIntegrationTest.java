import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import api.ec.InventoryService;
import api.ec.OrderProcessor;

public class OrderProcessorIntegrationTest {

    public static class InMemoryInventoryService implements InventoryService {
        private final Map<String, Integer> stockMap = new HashMap<>();

        public void addStock(String itemId, int quantity) {
            stockMap.put(itemId, quantity);
        }

        public int getStock(String itemId) {
            return stockMap.getOrDefault(itemId, 0);
        }

        @Override
        public boolean checkStock(String itemId, int quantity) {
            return getStock(itemId) >= quantity;
        }

        @Override
        public void reserve(String itemId, int quantity) {
            int currentStock = getStock(itemId);
            if (currentStock >= quantity) {
                stockMap.put(itemId, currentStock - quantity);
            } else {
                throw new IllegalStateException("Insufficient inventory to reserve.");
            }
        }
    }

    @Test
    public void testOrderProcessorWithRealInventory() {
        InMemoryInventoryService inventoryService = new InMemoryInventoryService();
        String itemId = "WIDGET-01";
        inventoryService.addStock(itemId, 10);

        OrderProcessor orderProcessor = new OrderProcessor(inventoryService);

        boolean orderResult = orderProcessor.processOrder(itemId, 4);

        assertTrue(orderResult, "The order should process successfully.");
        assertEquals(6, inventoryService.getStock(itemId), "The inventory should be reduced from 10 to 6.");
    }
}