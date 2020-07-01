package zad;

public class ObserverMain {

	public static void main(String[] args) {


		Food food = new Food();
		Observer obs1 = new foodHorse("Wheat");

		
		food.eat(obs1);
		
		
		food.setName("New food");
		food.setName("Other food");
	}

}
