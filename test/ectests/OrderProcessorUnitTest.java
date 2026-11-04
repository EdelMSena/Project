import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OrderProcessorUnitTest {

    @Test
    public void testProcessOrder_InStock() {
        InventoryService inventoryServiceMock = mock(InventoryService.class);
        OrderProcessor orderProcessor = new OrderProcessor(inventoryServiceMock);

        String itemId = "ITEM-001";
        int quantity = 3;

        when(inventoryServiceMock.checkStock(eq(itemId), eq(quantity))).thenReturn(true);

        boolean result = orderProcessor.processOrder(itemId, quantity);
        assertTrue(result, "Order should process successfully when item is in stock.");

        verify(inventoryServiceMock, times(1)).reserve(eq(itemId), eq(quantity));
    }

    @Test
    public void testProcessOrder_OutOfStock() {
        InventoryService inventoryServiceMock = mock(InventoryService.class);
        OrderProcessor orderProcessor = new OrderProcessor(inventoryServiceMock);

        String itemId = "ITEM-002";
        int quantity = 5;

        when(inventoryServiceMock.checkStock(eq(itemId), eq(quantity))).thenReturn(false);

        boolean result = orderProcessor.processOrder(itemId, quantity);
        assertFalse(result, "Order should fail when item is out of stock.");

        verify(inventoryServiceMock, never()).reserve(anyString(), anyInt());
    }
}