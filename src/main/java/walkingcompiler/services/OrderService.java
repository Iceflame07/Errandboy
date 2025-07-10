package walkingcompiler.services;
import org.springframework.stereotype.Service;
import walkingcompiler.data.models.Order;

@Service
public interface OrderService {

    Order findByOrderId(String orderId);
    Order findByCustomerName(String customerName);
    Order findByCustomerContact(String customerContact);
    Order findByCustomerAddress(String customerAddress);
    Order findByOrderStatus(String orderStatus);
    Order findByOrderDate(String orderDate);
    Order findByOrderTime(String orderTime);
    Order findByAccountName(String accountName);
    Order findByBankName(String bankName);
    Order findByAccountNumber(String accountNumber);
    Order findByAccountType(String accountType);
    Order findByCardNumber(String cardNumber);
    Order findByCardType(String cardType);

    Order findOrder(Order order);
}
