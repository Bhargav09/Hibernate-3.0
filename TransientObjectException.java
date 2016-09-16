public class TransientObjectException extends HibernateException {
	/**
	 * Constructs a TransientObjectException using the supplied message.
	 *
	 * @param message The message explaining the exception condition
	 */
	public TransientObjectException(String message) {
		super( message );
	}

}