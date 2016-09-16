public class UnknownEntityTypeException extends MappingException {
	public UnknownEntityTypeException(String message, Throwable cause) {
		super( message, cause );
	}

	public UnknownEntityTypeException(String message) {
		super( message );
	}
}