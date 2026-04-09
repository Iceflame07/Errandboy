package walkingcompiler.exceptions;
import lombok.experimental.StandardException;

@StandardException
public class PaymentNotFoundException extends RuntimeException {
  public PaymentNotFoundException(String message) {
    super(message);
  }
}
