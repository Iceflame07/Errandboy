package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Payment;
import walkingcompiler.dto.PaymentDto;
import walkingcompiler.services.PaymentService;
import walkingcompiler.utils.PaymentMapper;

@RestController()
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/payment")
    public ResponseEntity<PaymentDto> payment(@RequestBody PaymentDto payment) {
        Payment pay = paymentService.findByCardType(String.valueOf(payment));
        return new ResponseEntity<>(PaymentMapper.mapToPaymentDto(pay), HttpStatus.CREATED);
    }

    @PostMapping("/cardType")
    public ResponseEntity<PaymentDto> createPayment(@RequestBody PaymentDto createPayment) {
        Payment found = paymentService.findByCardLength(createPayment.getCardNumber());
        Payment use = paymentService.findByCardLength(found.getCardNumber());
        return new ResponseEntity<>(PaymentMapper.mapToPaymentDto(use), HttpStatus.OK);
    }

    @PostMapping("/company")
    public ResponseEntity<PaymentDto> company(@RequestBody PaymentDto company) {
        Payment found = paymentService.findByCompanyAccount(company.getCompanyAccount());
        Payment another = paymentService.findByCompanyAccount(found.getCompanyAccount());
        return new ResponseEntity<>(PaymentMapper.mapToPaymentDto(another), HttpStatus.OK);
    }
}