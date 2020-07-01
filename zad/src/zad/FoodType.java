package zad;

public class FoodType implements Observer {

	private String name;
	private Observable food;
	
	public FoodType(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(food == null) {
			System.out.println("food1");
			return;
		}
		
		String foodName = food.getUpdate();
		System.out.println(this.getName() + " updated with: " + "Food is: " + foodName);
		
	}
	@Override
	public void setFood1(Observable food) {
		this.food = food;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setFood(Observable food) {
		// TODO Auto-generated method stub
		
	}


}
