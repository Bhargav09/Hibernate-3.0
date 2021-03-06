import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Bhargav Gangadhara
 */
@Entity
@Table(name = "`IN`")
public class In {
	@Id
	@GeneratedValue
	private long id;

	private String prop;

	public long getId() {
		return id;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}
}