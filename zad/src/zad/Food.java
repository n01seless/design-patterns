package zad;

import java.util.ArrayList;
import java.util.List;

public class Food implements Observable {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String name;

	public void setName(String name) {
		this.name = name;
		this.notifyObservers();
	}


	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.name;
	}


	@Override
	public void eat(Observer observer) {
		// TODO Auto-generated method stub
		
	}

}
