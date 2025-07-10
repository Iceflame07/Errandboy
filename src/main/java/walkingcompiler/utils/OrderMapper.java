package walkingcompiler.utils;
import walkingcompiler.data.models.Order;
import walkingcompiler.dto.OrderDto;

public class OrderMapper {

    public static Order mapToOrder(OrderDto order) {
        return new Order(
                order.getOrderId(),
                order.getCustomerName(),
                order.getCustomerContact(),
                order.getOrderDate(),
                order.getOrderTime(),
                order.getOrderStatus(),
                order.getBankName(),
                order.getAccountNumber(),
                order.getAccountType(),
                order.getCardType(),
                order.getCustomerAddress(),
                order.getCustomerAddress(),
                order.getCardNumber()
        );
    }

    public static OrderDto mapToOrderDto(Order order) {
        return new OrderDto(
                order.getOrderId(),
                order.getCustomerName(),
                order.getCustomerContact(),
                order.getCustomerAddress(),
                order.getOrderTime(),
                order.getOrderDate(),
                order.getOrderStatus(),
                order.getBankName(),
                order.getAccountName(),
                order.getAccountType(),
                order.getAccountNumber(),
                order.getCardType(),
                order.getCardNumber()
        );
    }
}