public class TypeMismatchException extends HibernateException {
	/**
	 * Constructs a TypeMismatchException using the supplied message.
	 *
	 * @param message The message explaining the exception condition
	 */
	public TypeMismatchException(String message) {
		super( message );
	}
}