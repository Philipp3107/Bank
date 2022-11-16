package domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public class Bank implements Serializable {
			private String name;
			private HashMap<Integer, Konto> konten = new HashMap<>();
			//neue Hashmap für die Verwaltung aller Kudnen
			private HashMap<Integer, Kunde> kunden = new HashMap<>();
			private int kontozähler;
			//zähler zum anlegen von Kudnen
			private int kundenzaehler;

			public Bank(String name) {
						this.name = name;
						this.kontozähler = -1;
						this.kundenzaehler = -1;
			}

			public int addKonto(String name, int auswahl) {
						Konto k;

						if (auswahl == 1)
									k = new Konto(name, ++kontozähler);
						else
									k = new Girokonto(name, ++kontozähler);

						konten.put(k.getKontonummer(), k);

						return k.getKontonummer();
			}

			public String getName() {
						return name;
			}

			public Collection<Konto> getKontenliste() {
						return konten.values();
			}

			public Konto findeKonto(int kontonummer) {
						return konten.get(kontonummer);
			}
			//Kunden in der hashmap finden und zurückgeben
			public Kunde finde_kunden(int kn){
				return kunden.get(kn);
			}
			//Passwort des Kundens bekommen
			public String get_Password(int kn){
				Kunde k = kunden.get(kn);
				return k.get_password();
			}
			//Kunde zum System hinzufügen
			public int adde_kunden(String first_name, String last_name, String adress, String password, int age){
				Kunde kunde = new Kunde(first_name, last_name, adress, password, age, ++kundenzaehler);
				kunden.put(kunde.get_client_number(), kunde);
				return kunde.get_client_number();

			}
}

