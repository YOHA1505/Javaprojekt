package Projekt_1;

import java.util.Scanner;

    public class Projekt_1 {
            static int Player_HP = 100;
            static int Opp_HP = 100;
        public static void main(String[] args){
            Scanner Rambo = new Scanner (System.in);

            System.out.println("Welcome to(...)");
            System.out.print("Choose a name: ");
            String Name = Rambo.nextLine();
            System.out.println("Hello, "+Name+"! Press enter to begin...");
            System.out.println("You are a member of the notorious gang Los Vagos in the southside of the city Rondua");
            

            Player_Attacks();
            if(Opp_HP==0)
            {
                System.out.println("Opp has been obliterated");
            }

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
                    Opp_HP=-100;

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

                if(10<=toffla && toffla<=100)
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

            if(moves.equals("Attack 2"))
            {
                double toffla = Math.random()*100;

                if(25<=toffla && toffla<=100)
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