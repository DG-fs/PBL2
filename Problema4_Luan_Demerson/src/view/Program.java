package view;

import java.awt.EventQueue;
import java.io.IOException;

import controller.Controller;

public class Program {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Controller.getInstance().ImportarArq();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.getTela().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
