import org.hibernate.internal.CoreMessageLogger;

import org.jboss.logging.Logger;

/**
 * Information about the Hibernate version.
 */
public class Version {
	private static String version;

	private Version() {
	}

	/**
	 * Access to the Hibernate version.
	 *
	 * IMPL NOTE : Real value is injected by the build.
	 *
	 * @return The Hibernate version
	 */
	public static String getVersionString() {
		if ( version == null ) {
			version = Version.class.getPackage().getImplementationVersion();
			if ( version == null ) {
				version = "[WORKING]";
			}
		}
		return version;
	}

	/**
	 * Logs the Hibernate version (using {@link #getVersionString()}) to the logging system.
	 */
	public static void logVersion() {
		Logger.getMessageLogger( CoreMessageLogger.class, Version.class.getName() ).version( getVersionString() );
	}

	/**
	 * Prints the Hibernate version (using {@link #getVersionString()}) to SYSOUT.  Defined as the main-class in
	 * the hibernate-core jar
	 *
	 * @param args n/a
	 */
	public static void main(String[] args) {
		System.out.println( "Hibernate Core {" + getVersionString() + "}" );
	}
}