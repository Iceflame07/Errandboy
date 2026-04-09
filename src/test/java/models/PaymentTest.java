package models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import walkingcompiler.data.models.Payment;

public class PaymentTest {

    @Test
    public void testPaymentMethod() {
       Payment pay = new Payment();
       pay.setCompanyAccount("");
       pay.setPaymentType("");
       pay.setCardNumber("");
       Assertions.assertEquals("", pay.getCardNumber());
       Assertions.assertEquals("", pay.getCompanyAccount());
       Assertions.assertEquals("", pay.getPaymentType());
    }
}
