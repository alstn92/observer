package headfirst.designpatterns.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class MallardDuck implements Quackable {
	//Observable observable;
	ArrayList<Observer> observers = new ArrayList<Observer>();
 
	public MallardDuck() {
		//observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Quack");
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
		return "Mallard Duck";
	}
}
