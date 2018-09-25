package bd.ac.seu.server.exception;

public class ResourceAlreadyExistException extends Error{
    public ResourceAlreadyExistException(String message) {
        super(message);
    }
}
