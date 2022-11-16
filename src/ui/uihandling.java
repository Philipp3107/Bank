package ui;
import domain.Kunde;

import java.util.Scanner;

public class uihandling {
    
   
        private void login(){
            Scanner sc = new Scanner(System.in);
            String[] options = {"Anmelden", "Registrieren", "beenden"};
            for(String s: options){
                System.out.println(s);
            }
            System.out.println(" > ");
            int input = Integer.parseInt(sc.nextLine());

            switch(input){
                case 1:
                case 2:
                case 3:
                default:
            }
        }

        //future return type is Kunde
        private void anmelden(){

        }
        //future return type is Kunde
        private void registrieren(){

        }
    
}
