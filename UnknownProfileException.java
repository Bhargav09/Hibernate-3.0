public class UnknownProfileException extends HibernateException {
	private final String name;

	/**
	 * Constructs an UnknownProfileException for the given name.
	 *
	 * @param name The profile name that was unknown.
	 */
	public UnknownProfileException(String name) {
		super( "Unknow fetch profile [" + name + "]" );
		this.name = name;
	}

	/**
	 * The unknown fetch profile name.
	 *
	 * @return The unknown fetch profile name.
	 */
	public String getName() {
		return name;
	}
}