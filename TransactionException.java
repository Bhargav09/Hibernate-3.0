public class TransactionException extends HibernateException {
	/**
	 * Constructs a TransactionException using the specified information.
	 *
	 * @param message The message explaining the exception condition
	 * @param cause The underlying cause
	 */
	public TransactionException(String message, Throwable cause) {
		super( message, cause );
	}

	/**
	 * Constructs a TransactionException using the specified information.
	 *
	 * @param message The message explaining the exception condition
	 */
	public TransactionException(String message) {
		super( message );
	}

}