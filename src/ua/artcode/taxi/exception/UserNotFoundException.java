package ua.artcode.taxi.exception;

/**
 * Created by serhii on 23.04.16.
 */
public class UserNotFoundException extends TaxiAppException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
