package Children;
import parent.Animal;
public class Reptile extends Animal{
	private String name;

	public Reptile(String habitat, String skill, String type, String name) {
		super(habitat, skill, type);
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	

}
