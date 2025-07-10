package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Order;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class OrderTest {

    @Test
    public void testOrder() {
        Order order = new Order();
        order.setOrderId("");
        order.setOrderDate("");
        order.setOrderTime("");
        order.setCardType("");
        order.setCardNumber("");
        order.setCustomerContact("");
        order.setCustomerName("");
        order.setCustomerAddress("");
        order.setAccountType("");
        order.setAccountNumber("");
        order.setAccountName("");
        order.setOrderStatus("");
        Assertions.assertEquals("", order.getOrderId());
        Assertions.assertEquals("", order.getOrderDate());
        Assertions.assertEquals("", order.getOrderTime());
        Assertions.assertEquals("", order.getCardType());
        Assertions.assertEquals("", order.getCardNumber());
        Assertions.assertEquals("", order.getCustomerContact());
        Assertions.assertEquals("", order.getCustomerName());
        Assertions.assertEquals("", order.getCustomerAddress());
        Assertions.assertEquals("", order.getAccountType());
        Assertions.assertEquals("", order.getAccountNumber());
        Assertions.assertEquals("", order.getAccountName());
        Assertions.assertEquals("", order.getOrderStatus());
    }
}
