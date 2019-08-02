package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int liczba=((int)(Math.random()*9)+1);
        boolean wygrana=false;
        int rundy=0;

        //System.out.println(liczba);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w zgadywance, wylosowałem liczbę z zakresu 1-10, spróbuj zgadnąć, powodzenia!");
        do{
            System.out.println("Podaj liczbę");

            int proba = scanner.nextInt();
            if (proba==liczba){
                wygrana=true;
            }
            else {
                System.out.println("Błąd! Spróbuj jeszcze raz...");
                rundy++;
            }
        }while(!wygrana);
        System.out.println("Gratulacje, wygrałeś! Liczba rund: " + rundy);




        }
    }


