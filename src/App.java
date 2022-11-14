
import facade.Banksystem;
import ui.Ui;

public class App {
						public static void main(String[] args) throws Exception {
									Banksystem bs = new Banksystem("Spaßkasse Mannheim");
									new Ui(bs);
						}

			}

