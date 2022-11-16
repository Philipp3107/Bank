package ui;
import domain.Kunde;
import facade.Banksystem;

import java.util.Scanner;

public class uihandling {
    
   
        private void login(){

        mainloop:
            while(true){
            Scanner sc = new Scanner(System.in);
            String[] options = {"Anmelden", "Registrieren", "beenden"};
            for(String s: options){
                System.out.println(s);
            }
            System.out.println(" > ");
            int input = Integer.parseInt(sc.nextLine());

            switch(input){
                case 1: anmelden(sc); break;
                case 2: registrieren(); break;
                case 3: break mainloop;
                default:
            }
        }
        }

        //future return type is Kunde
        private void anmelden(Scanner sc){
            String[] options = {"Bitte geben Sie ihre Kundennummer an: ", "Bitte geben Sie ihr Password an: "};
            System.out.println(options[0]);
            System.out.print(" > ");
            int kn = Integer.parseInt(sc.nextLine());
            System.out.println(options[1]);
            System.out.print(" > ");
            String pw = sc.nextLine();




        }
        //future return type is Kunde
        private void registrieren(){

        }
    
}
