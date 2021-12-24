package controller;

import listeners.LogicListenable;
import listeners.ViewListenable;
import model.Model;
import view.View;

import java.util.Map;



public class Controller implements ViewListenable, LogicListenable {
	private Model theModel;
	private View theView;

	public Controller(Model m, View v) {
		theModel = m;
		theView = v;

		theModel.registerListener(this);
		theView.registerListener(this); // throws


	}

}
