package com.proserus.stocks.model.common;

import java.io.File;
import java.util.Observable;
import java.util.Observer;

abstract public class ObservableModel extends Observable {
	static public String config = System.getProperty("user.home") + File.separator + "Proserus/";

	@Override
	final public synchronized void addObserver(Observer o) {
	    super.addObserver(o);
	    o.update(this, null);
	}
}
