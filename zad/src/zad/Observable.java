package zad;

public interface Observable {
	public void eat(Observer observer);

	public void notifyObservers();
	public String getUpdate();
	
}
