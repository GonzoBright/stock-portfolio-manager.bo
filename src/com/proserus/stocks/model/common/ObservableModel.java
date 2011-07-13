package com.proserus.stocks.model.common;

import java.util.Observable;
import java.util.Observer;

abstract public class ObservableModel extends Observable {
	static public String config = "./";

	@Override
	final public synchronized void addObserver(Observer o) {
		super.addObserver(o);

		// Kind of a cheat to make sure that after a new observer is added,
		// he next notifyObserver is actually really sent out
		setChanged();
	}
}
