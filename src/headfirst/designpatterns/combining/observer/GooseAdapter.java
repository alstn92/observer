package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class GooseAdapter implements Quackable {
	Goose goose;
	//Observable observable;
	ArrayList<Observer> observers = new ArrayList<Observer>();
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		//observable = new Observable(this);
	}
 
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
