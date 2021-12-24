package model;

/*
 * @author Gadi Engelsman.
 * @author Shahar Raz.
 * */

import listeners.LogicListenable;


import java.util.ArrayList;
import java.util.Map;

public class Model {
	private ArrayList<LogicListenable> allListeners;
	private static final String TAG = "Model";

	public Model() {
		this.allListeners = new ArrayList<>();
	}

	public void registerListener(LogicListenable l) {
		allListeners.add(l);
	}

}
