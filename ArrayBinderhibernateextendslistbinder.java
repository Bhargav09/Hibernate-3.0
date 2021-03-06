package org.hibernate.cfg.annotations;
import org.hibernate.mapping.Array;
import org.hibernate.mapping.Collection;
import org.hibernate.mapping.PersistentClass;

/**
 * Bind an Array
 *
 */
public class ArrayBinder extends ListBinder {

	public ArrayBinder() {
	}

	protected Collection createCollection(PersistentClass persistentClass) {
		return new Array( getBuildingContext().getMetadataCollector(), persistentClass );
	}
}