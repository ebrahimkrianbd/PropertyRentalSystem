package bd.ac.seu.server.exception;

public class ResourceDoesnotExistException extends  Error{
    public ResourceDoesnotExistException(String message) {
        super(message);
    }
}
