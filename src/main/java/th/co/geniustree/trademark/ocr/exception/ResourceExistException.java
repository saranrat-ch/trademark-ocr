package th.co.geniustree.trademark.ocr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by saranrat on 13/6/2560.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceExistException extends RuntimeException {
    public ResourceExistException() {
    }

    public ResourceExistException(String message) {
        super(message);
    }
}
