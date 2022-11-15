package domain;

public class Kunde {
			private String first_name;
			private String last_name;
			private String addres;
			private String password;
			private int age;
			private int client_number;

			public Kunde(String first_name, String last_name, String addres, String password, int age, int client_number){
					this.first_name = first_name;
					this.last_name = last_name;
					this.addres = addres;
					this.password = password;
					this.age = age;
					this.client_number = 1000 + client_number;
			}

			public String get_name(){
						return first_name + " " + last_name;
			}
			public String get__name(String part){
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



}
