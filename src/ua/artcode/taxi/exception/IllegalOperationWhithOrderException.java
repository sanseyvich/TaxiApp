package ua.artcode.taxi.exception;

/**
 * Created by serhii on 23.04.16.
 */
public class IllegalOperationWhithOrderException extends TaxiAppException {
    public IllegalOperationWhithOrderException(String message) {
        super(message);
    }
}
