package walkingcompiler.dto;

import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @Id
    private String orderId;

    private String customerName;
    private String customerContact;
    private String customerAddress;
    private String orderStatus;
    private String orderDate;
    private String orderTime;
    private String bankName;
    private String AccountName;
    private String AccountType;
    private String AccountNumber;
    private String cardNumber;
    private String cardType;
}
