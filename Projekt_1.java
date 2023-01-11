package Projekt_1;

import java.util.Scanner;

    public class Projekt_1 {
            
        public static void main(String[] args){
            Scanner Rambo = new Scanner (System.in);

            System.out.println("Välkommen till(...)");
            System.out.print("Välj ett namn: ");
            String Name = Rambo.nextLine();
            System.out.println("Hej "+Name);

            Player_Attacks(Move);

        }

        static String Player_Attacks(String Move)
        {
            Scanner Laeeb = new Scanner(System.in);

            System.out.println("Move: ");
            String moves = Laeeb.nextLine();

            if(moves.equals("Special Attack"))
            {
                double toffla = Math.random()*100;

                if(95<=toffla && toffla<=100)
                {
                    System.out.println("critical hit");
                }

            }  
                moves = Move;
                return Move;
        }

        
}