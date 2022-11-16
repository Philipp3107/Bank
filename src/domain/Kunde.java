package domain;

import java.util.HashMap;

public class Kunde {
			private String first_name;
			private String last_name;
			private String addres;
			private String password;
			private int age;
			private int client_number;

			protected HashMap<Integer, Konto> account;

			public Kunde(String first_name, String last_name, String addres, String password, int age, int client_number){
					this.first_name = first_name;
					this.last_name = last_name;
					this.addres = addres;
					this.password = password;
					this.age = age;
					this.client_number = 1000 + client_number;
					this.account = new HashMap<>();
			}

			public String get_name(){
						return first_name + " " + last_name;
			}
			public String get_name(String part){
								switch (part){
											case "first":
														return first_name;
											case "last":
														return last_name;
											default:
														return get_name();
								}
			}
			public String get_addres(){
						return addres;
			}
			public String get_password(){
						return password;
			}
			public int get_client_number(){
						return client_number;
			}
			public int get_age(){
						return age;
			}
			public int add_to_accounts(Konto konto){
						account.put(konto.getKontonummer(), konto);
						return konto.getKontonummer();
			}
			//neue toString() methode um Kunden als Text ausgeben zu können
			@Override
			public String toString(){
				return first_name + " " + last_name + "[ Adresse: " + addres + ", Age " + age + ", Clientnumber" + client_number + " ]";
			}





}
