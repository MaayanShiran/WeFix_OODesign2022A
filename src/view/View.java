package view;

/**
 * @author Gadi Engelsman.
 * @author Shahar Raz.
 * */
import listeners.ViewListenable;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;



public class View {

	private static final double ENLRAGMENT_FACTOR = 1; // constant

	private ArrayList<ViewListenable> allListeners;
//	private HBox hbButtons;
	private static final String TAG = "View";

	private Stage stage;


	public void registerListener(ViewListenable l) {
		allListeners.add(l);
	}

	public View(Stage stg) {
		allListeners = new ArrayList<ViewListenable>();
		this.stage = stg;

		hbButtons = getHBox();
		creatTabPane();

		Scene scene = new Scene(hbButtons, 530 * ENLRAGMENT_FACTOR, 600 * ENLRAGMENT_FACTOR);

		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Store Saver");
		stage.show();
	}


}