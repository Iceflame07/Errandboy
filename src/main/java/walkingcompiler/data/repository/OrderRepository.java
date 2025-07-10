package walkingcompiler.data.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import walkingcompiler.data.models.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

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
}
