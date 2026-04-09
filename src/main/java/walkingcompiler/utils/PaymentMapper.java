package walkingcompiler.utils;
import walkingcompiler.data.models.Payment;
import walkingcompiler.dto.PaymentDto;

public class PaymentMapper {

    public static Payment mapToPayment(PaymentDto card) {
        return new Payment(
                card.getPaymentType(),
                card.getCardNumber(),
                card.getCompanyAccount()
        );
    }

    public static PaymentDto mapToPaymentDto(Payment pay) {
        return new PaymentDto(
                pay.getPaymentType(),
                pay.getCardNumber(),
                pay.getCompanyAccount()
        );
    }
}