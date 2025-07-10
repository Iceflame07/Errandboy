package walkingcompiler.exceptions;
import lombok.experimental.StandardException;

@StandardException
public class ItemOutOfStockException extends RuntimeException {
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
