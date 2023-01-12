package Projekt_1;

import java.util.Scanner;

    public class Projekt_1 {
            
        public static void main(String[] args){
            Scanner Rambo = new Scanner (System.in);

            System.out.println("Welcome to(...)");
            System.out.print("Choose a name: ");
            String Name = Rambo.nextLine();
            System.out.println("Hello, "+Name+"! Press enter to begin...");
            System.out.println("You are a member of the notorious ");
            

            Player_Attacks();

        }

        static boolean Player_Attacks()
        {
            Scanner Laeeb = new Scanner(System.in);

            System.out.print("Move: ");
            String moves = Laeeb.nextLine();

            if(moves.equals("Special Attack"))
            {
                double toffla = Math.random()*100;

                if(95<=toffla && toffla<=100)
                {
                    System.out.println("Critical hit!!!");

                    return true;
                }
                else
                {
                    System.out.println("Special Attack Failed!");
                    return false;
                }
                
            }  

            if(moves.equals("Attack 1"))
            {
                double toffla = Math.random()*100;

                if(10<=toffla && 100>=toffla)
                {
                    System.out.println("Hit!!!");

                    return true;
                }
                else
                {
                    System.out.println("Miss!!!");

                    return false;
                }
            }

            return false;

        }

        
}