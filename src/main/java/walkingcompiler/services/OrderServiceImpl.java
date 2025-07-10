package walkingcompiler.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Order;
import walkingcompiler.data.repository.OrderRepository;
import walkingcompiler.exceptions.ItemsNotfoundException;
import walkingcompiler.exceptions.OrderNotFoundException;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order findByOrderId(String orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    @Override
    public Order findByCustomerName(String customerName) {
        return orderRepository.findByCustomerName(customerName);
    }

    @Override
    public Order findByCustomerContact(String customerContact) {
        return orderRepository.findByCustomerContact(customerContact);
    }

    @Override
    public Order findByCustomerAddress(String customerAddress) {
        return orderRepository.findByCustomerAddress(customerAddress);
    }

    @Override
    public Order findByOrderStatus(String orderStatus) {
        return orderRepository.findByOrderStatus(orderStatus);
    }

    @Override
    public Order findByOrderDate(String orderDate) {
        return orderRepository.findByOrderDate(orderDate);
    }

    @Override
    public Order findByOrderTime(String orderTime) {
        return orderRepository.findByOrderTime(orderTime);
    }

    @Override
    public Order findByAccountName(String accountName) {
        return orderRepository.findByAccountName(accountName);
    }

    @Override
    public Order findByBankName(String bankName) {
        return orderRepository.findByBankName(bankName);
    }

    @Override
    public Order findByAccountNumber(String accountNumber) {
        return orderRepository.findByAccountNumber(accountNumber);
    }

    @Override
    public Order findByAccountType(String accountType) {
        return orderRepository.findByAccountType(accountType);
    }

    @Override
    public Order findByCardNumber(String cardNumber) {
        return orderRepository.findByCardNumber(cardNumber);
    }

    @Override
    public Order findByCardType(String cardType) {
        return orderRepository.findByCardType(cardType);
    }

    @Override
    public Order findOrder(Order order) {
        Order foundOrder = orderRepository.findById(order.getOrderId())
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + order.getOrderId()));

        if (foundOrder.getOrderStatus() == null) {
            throw new ItemsNotfoundException("Item in order is out of stock");
        }
        return foundOrder;
    }

}
