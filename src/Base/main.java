package Base;
import parent.Animal;
import Children.Bird;
import Children.Fish;
import Children.Reptile;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reptile snake = new Reptile("land", "rengna", "limbs", "cobra");
		System.out.println(snake.getHabitat());
		System.out.println(snake.getName());

	}

}
