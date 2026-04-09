package walkingcompiler.exceptions;
import lombok.experimental.StandardException;

@StandardException
public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(String message) {
        super(message);
    }
}
