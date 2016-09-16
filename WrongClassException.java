import java.io.Serializable;
public class WrongClassException extends HibernateException {
	private final Serializable identifier;
	private final String entityName;

	/**
	 * Constructs a WrongClassException using the supplied information.
	 *
	 * @param message A message explaining the exception condition
	 * @param identifier The identifier of the entity
	 * @param entityName The entity-type requested
	 */
	public WrongClassException(String message, Serializable identifier, String entityName) {
		super(
				String.format(
						"Object [id=%s] was not of the specified subclass [%s] : %s",
						identifier,
						entityName,
						message
				)
		);
		this.identifier = identifier;
		this.entityName = entityName;
	}

	public String getEntityName() {
		return entityName;
	}

	public Serializable getIdentifier() {
		return identifier;
	}
}