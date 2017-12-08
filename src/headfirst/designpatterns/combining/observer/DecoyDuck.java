package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class DecoyDuck implements Quackable {
	//Observable observable;
	ArrayList<Observer> observers = new ArrayList<Observer>();

	public DecoyDuck() {
		//observable = new Observable(this);
	}

	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		//observable.registerObserver(observer);
		observers.add(observer);
	}

	public void notifyObservers() {
		//observable.notifyObservers();
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(this);
		}
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
