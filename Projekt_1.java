package Projekt_1;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Projekt_1 {
            static Scanner Laeeb = new Scanner(System.in);
            //Alla karaktärers hälsopoäng
            static int Player_HP = 100;
            static int Opp_HP = 100;
            static int Fed_HP = 130;
            static int Sup_HP = 200;
            static int SP1 =0;
            static int SP2 = 0;
            static boolean begining=true;
        public static void main(String[] args)
        {
 
            Scanner Rambo = new Scanner (System.in);
            Array_SP(SP1, SP2);

            //Intro
            System.out.println("Welcome to the city of Rondua!");
            System.out.print("Choose a name: ");
            String Name = Rambo.nextLine();
            System.out.println("Hello, "+Name+"! You are a member of the notorious gang Los Vagos in the southside of the City");

            String intro = """
                                          ------------------------------------------------------------------------
                                            One day you are walking down the street to the bodega at the corner
                                                    And you see an opp standing there like a dickhead
                                                           You walk up to him to confront him
                                          Suddenly he truns to you and starts reaching for something in his pocket
                                                          There is no time! You have to act now!

                                                      If you want to display your Stats enter <Stats>
                                                    Otherwise press any key and enter so start the fight
                                          ------------------------------------------------------------------------
                    """;
            System.out.println(intro);
            String Listzz = Rambo.nextLine();
            if(Listzz.equals("Stats") || Listzz.equals("<Stats>") || Listzz.equals("stats") || Listzz.equals("<stats>"))
            {
                Stats();
                System.out.println("If you wish to display your stats at anytime during the fight just enter <Stats> again");
                System.out.println("Press enter to start fight");
            }

            //Första matchen
            while(Player_HP>=0)
            {
                Player_Attacks();
                System.out.print("Opp move...");
                Rambo.nextLine();
                Opp_Attacks();
                System.out.println("Player HP: "+Player_HP);
                System.out.println("Opp HP: "+Opp_HP);
                Rambo.nextLine();
                ClearConsole();

                if(Fed_HP<=0)
                {
                    System.out.print("Opp has been obliterated!!! Press enter to continue the story...");
                    Rambo.nextLine();
                    Player_HP = 130;
                    break;
                }
                if(Player_HP<=0)
                {
                    Player_HP = 100;
                    Opp_HP = 100;

                    System.out.print("Game Over!!!");
                    Rambo.nextLine();
                    System.out.print("Press enter to restart match");
                    Rambo.nextLine();
                    continue;
                }
            }

            //Sidouppdrag
            String SideQuest = """
                                     ------------------------------------------------------------
                                        You are standing over the decapitated body of the Opp 
                                         whom you discovered went by the name of Totooooo05
                                                      Absolute horror name btw
                                         When you turn around to get the fuck out of dodge 
                                            you notice someone trying to flee the scene
                                                          It's a wild Arda!!!
                                                  I'll be honest alie, if it was me
                                     I'd cancel his life subscripton cuz my man is a snitch innit
                                                        But it's up to you now...

                                        A) Shoot him            B) Be a Prius Driver aka a Pussio 
                                                                        and let him live

                                                  C) Rob him, Let him run away like 10m,
                                                            then kill him
                                     ------------------------------------------------------------
                             """;
            
            System.out.println(SideQuest);
            String Snitch = Rambo.nextLine();
            //Scenario A
            if(Snitch.equals("A") || Snitch.equals("a"))
            {
                String SQ_A = """
                  -----------------------------------------------------------------------------------------
                                     You run to the body to check if Arda is still alive
                                       He is laying there dead with a hole in his head
                                    You immedeatly start running away to escape the scene
                  As you start slowing down you clock a police officer walking towards you at a steady pace
                     As soon as you lock eyes you can hear him yelling -You! You there! Stop immedeatly!
                             The officer begins chasing you down the street and into a back alley
                                       You now have no choice but to fight the officer
                  -----------------------------------------------------------------------------------------
                        """;
                System.out.println(SQ_A);
            }
            //Scenario C
            else if(Snitch.equals("C") || Snitch.equals("c"))
            {
                String SQ_C = """
                      ------------------------------------------------------------------------------------------
                                Why? Honestly why? you could've just shot him and then take his money
                            But for whatever reason you've decided to go down the path of serial killers
                                                        Poor Arda! Anyways, 
                            You've now robbed him and proceeded to let him run away before you kill him
                            Once you're sure he's dead you immedeatly start running away to escape the scene   
                       As you start slowing down you clock a police officer walking towards you at a steady pace
                          As soon as you lock eyes you can hear him yelling -You! You there! Stop immedeatly!  
                                 The officer begins chasing you down the street and into a back alley          
                                            You now have no choice but to fight the officer                    
                      ------------------------------------------------------------------------------------------
                        """;
                System.out.println(SQ_C);
            }
            //Scenario B
            else
            {
                System.out.println("I knew you were a pussio");
                String SQ_B = """
                    --------------------------------------------------------------------------------
                                                    You are a Puss
                                    You have absolutely no cojones whatsoever... Anyways,
                        You watch him run away with his phone in his hand and you run the other way
                    The next day you hear a loud knock on your door -It's the police! Open the door!
                        They storm the house and see you running out the backdoor into your backyard
                                You try jump over the fence and one of the feds follow
                        You run out into the stret and turn in between to houses into a back alley
                                    You now have no choice but to fight the officer
                    --------------------------------------------------------------------------------
                        """;
                System.out.println(SQ_B);

            }

            //Boss 2 - The Fed
            for(Player_HP=130; Player_HP>=0;)
            {
                Player_Attacks2();
                System.out.print("Fed Move...");
                Rambo.nextLine();
                Fed_Attacks();
                System.out.println("Player HP: "+Player_HP);
                System.out.println("Fed HP: "+Fed_HP);
                ClearConsole();

                if(Fed_HP<=0)
                {
                    System.out.println("Fed has been killed!!! Press enter to continue;");
                    Rambo.nextLine();
                    //Player_HP = 190;
                    ClearConsole();
                    break;
                }
                if(Player_HP<=0)
                {
                    System.out.println("Game Over!!!");
                    System.out.println("Press enter to restart;");
                    Rambo.nextLine();
                    //Ställer om hp:et så att loopen startas om
                    Player_HP = 130;
                    Fed_HP = 130;
                    ClearConsole();
                    continue;
                }
            }

            String End = """
                    
                        Congratulations!!! You've completed the game!!!
                   You are now officially the king of the southside of Rondua
                   

                    """;
            System.out.println(End);


        }

        //Jag har endast detta för att Johan vill att jag ska ha en convertering och en Array
        //Detta tar emot två int:ar, converterar de till strings och skapar en Array som består av dessa två tal
        static String[] Array_SP(int SP1, int SP2)
        {
            String Convert_SP1 = Integer.toString(SP1);
            String Convert_SP2 = Integer.toString(SP2);

            String[] Array = new String[2];

            Array[0] = Convert_SP1;
            Array[1] = Convert_SP2;
            System.out.println(Array);


            return Array;
        }

        static boolean Player_Attacks()
        {
            /*While loop så att ingen ska kunna skriva ex: banan och kunna fortsätta 
            utan det ska bli invalid input och man ska starta om från "Player Move: "*/
            String[] Kuk = new String[2];

                if(begining)
                {
                    while (true) {
                        try
                        {
                            System.out.print("Välj vilket nummer som ska vara första Special Attacken: ");   
                            SP1 = Laeeb.nextInt();
                            Laeeb.nextLine();
                            System.out.print("Välj vilket nummer som ska vara andra Special Attacken: ");
                            SP2 = Laeeb.nextInt();
                            Laeeb.nextLine();
                            Kuk = Array_SP(SP1, SP2);
                            break;
                        }
                        catch (InputMismatchException ex) {
                            Laeeb.nextLine();
                            continue;
                        }
                    }
    
                    begining=false;
                }
            while(true)
            {
                System.out.print("Player Move: ");
                String moves = Laeeb.nextLine();
    
                double toffla = Math.random()*100;
                
                if(moves.equals(Kuk[0]))
                {
    
                    if(95<=toffla && toffla<=100)
                    {
                        System.out.println("Critical hit!!!");
                        Opp_HP=Opp_HP-90;
    
                        return true;
                    }
                    else
                    {
                        System.out.println("Special Attack Failed!");
                        return false;
                    }
                }  
    
                else if(moves.equals("Attack 1") || moves.equals("attack 1"))
                {
                    return PlAttack(toffla, 10, 5);
                }
    
                else if(moves.equals("Attack 2") || moves.equals("attack 2"))
                {
                    return PlAttack(toffla, 25, 10);
                }
    
                else if(moves.equals("Attack 3") || moves.equals("attack 3"))
                {
                    return PlAttack(toffla, 40, 15);
                }
    
                else if(moves.equals("Attack 4") || moves.equals("attack 4"))
                {
                    return PlAttack(toffla, 50, 20);
                }
                else if(moves.equals("Stats") || moves.equals("<Stats>") || moves.equals("stats") || moves.equals("<stats>"))
                {
                    Stats();
                    continue;
                }
                else
                {
                    System.out.println("Invalid Input!!!");

                    continue;
                }   
            } 

        }

        static boolean Opp_Attacks()
        {
            double Bot_rand = Math.random()*100;
            double Bot_rand2 = Math.random()*100;
            double Bot_rand3 = Math.random()*100;
            double Bot_randSP = Math.random()*100;

            if(75<=Opp_HP && Opp_HP<=100)
            {   
                double toffla1 = Math.random()*100;
                if(65<=toffla1 && toffla1<=100)
                {
                    System.out.println("Opp is jabbing you...");
                    System.out.println("Hit!!!");
                    Player_HP=Player_HP-5;
                    return true;
                }

                if(35<=toffla1 && toffla1<65)
                {
                    return BotAttack_2(Bot_rand, 20, 13);                
                }
                if(15<=toffla1 && toffla1<35)
                {
                    return BotAttack_3(Bot_rand2, 35, 15);
                }
                if(5<=toffla1 && toffla1<15)
                {
                    return BotAttack_4(Bot_rand3, 40, 25);
                }
                if(0<=toffla1 && toffla1<5)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }

            if(25<=Opp_HP && Opp_HP<75)
            {
                double toffla2 = Math.random()*100;

                if(80<=toffla2 && toffla2<=100)
                {
                    System.out.println("Opp is jabbing you...");
                    System.out.println("Hit!!!");
                    Player_HP=Player_HP-5;
                    return true;
                }
                if(50<=toffla2 && toffla2<80)
                {
                    return BotAttack_2(Bot_rand, 20, 13);
                }
                if(30<=toffla2 && toffla2<50)
                {
                    return BotAttack_3(Bot_rand2, 35, 15);
                }
                if(10<=toffla2 && toffla2<30)
                {
                    return BotAttack_4(Bot_rand3, 40, 25);
                }
                if(0<=toffla2 && toffla2<10)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }
            if(0<=Opp_HP && Opp_HP<25)
            {
                double toffla3 = Math.random()*100;

                if(85<=toffla3 && toffla3<=100)
                {
                    System.out.println("Opp is jabbing you...");
                    System.out.println("Hit!!!");
                    Player_HP=Player_HP-5;
                    return true;
                }
                if(60<=toffla3 && toffla3<85)
                {
                    return BotAttack_2(Bot_rand, 20, 13);
                }
                if(35<=toffla3 && toffla3<60)
                {
                    return BotAttack_3(Bot_rand2, 35, 15);
                }
                if(15<=toffla3 && toffla3<35)
                {
                    return BotAttack_4(Bot_rand3, 40, 25);
                }
                if(0<=toffla3 && toffla3<15)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }


            return false;
        }

        public static boolean BotAttack_2(double Opp_rand, int min, int damage)
        {
            System.out.println("Opp is swinging mad...");

            if(min<=Opp_rand && Opp_rand<=100)
            {
                System.out.println("He hit!!!");
                Player_HP-=damage;

                return true;
            }
            else
            {
                System.out.println("He missed!!!");

                return false;
            }
        }
        public static boolean BotAttack_3(double Opp_rand2, int min, int damage)
        {
            System.out.println("Opp has attempted a wild roundhouse to your head...");

            if(min<=Opp_rand2 && Opp_rand2<=100)
            {
                System.out.println("He kicked you in the head!!!");
                Player_HP-=damage;

                return true;
            }
            else
            {
                System.out.println("He missed and landed on his head!!!");
                System.out.println("What a moron...kmt...");

                return false;
            }
        }
        //"min" representerar minstatalet i parametern för random
        public static boolean BotAttack_4(double Opp_rand3, int min, int damage)
        {
            System.out.println("Opp has backed out his rambo...");

                    if(min<=Opp_rand3 && Opp_rand3<=100)
                    {
                        System.out.println("He cheffed you up blud!!!");
                        Player_HP-=damage;

                        return true;
                    }
                    else
                    {
                        System.out.println("He missed!!!");
                        System.out.println("What a Jokeman...");

                        return false;
                    }
        }
        //"min" representerar minstatalet i parametern för random
        /*Eftersom att SP(Special Attack) ska döda spelaren direkt så behöver 
        man inte mata in damage som i de andra metoderna utan 
        det räcker med att subtrahera det nuvarande hp:et med sig själv*/
        public static boolean Op_SP(double Opp_rand4, int min)
        {
            System.out.println("He's reaching for his stainless...");

            if(min<=Opp_rand4 && Opp_rand4<=100)
            {
                System.out.println("He shot you in the head!!!");
                System.out.println("Kmt... how're you gonna let that happen broski...");
                Player_HP-=Player_HP;

                return true;
            }
            else
            {
                System.out.println("Somehow he missed!!!");
                System.out.println("Must be a Chelsea no.9...");

                return false;
            }
        }

        //Metod för Spelarens Attacker mot andra botten aka The Fed
        static boolean Player_Attacks2()
        {
            String[] Kuk = new String[2];
            if(begining)
            {
                while (true)
                {
                    try
                    {
                        System.out.print("Välj vilket nummer som ska vara första Special Attacken: ");   
                        SP1 = Laeeb.nextInt();
                        Laeeb.nextLine();
                        System.out.print("Välj vilket nummer som ska vara andra Special Attacken: ");
                        SP2 = Laeeb.nextInt();
                        Laeeb.nextLine();
                        Kuk = Array_SP(SP1, SP2);
                        break;
                    }
                    catch (InputMismatchException ex) {
                        Laeeb.nextLine();
                        continue;
                    }
                }

                begining=false;
            }
            while(true)
            {

                System.out.print("Player Move: ");
                String moves = Laeeb.nextLine();
                double toffla = Math.random()*100;
                
                if(moves.equals("Special Attack"))
                {
                    
                    if(95<=toffla && toffla<=100)
                    {
                    System.out.println("Critical hit!!!");
                    Fed_HP=Fed_HP-120;

                    return true;
                }
                else
                {
                    System.out.println("Special Attack Failed!");
                    return false;
                }
                
                }  
            
                else if(moves.equals("Attack 1"))
                {
                    return PlAttack2(toffla, 10, 8);
                }
                
                else if(moves.equals("Attack 2"))
                {
                    return PlAttack2(toffla, 25, 14);
                }
                
                else if(moves.equals("Attack 3"))
                {
                    return PlAttack2(toffla, 40, 18);
                }
                
                else if(moves.equals("Attack 4"))
                {
                    return PlAttack2(toffla, 50, 24);
                }
                else if(moves.equals("Stats") || moves.equals("<Stats>") || moves.equals("stats") || moves.equals("<stats>"))
                {
                    Stats();
                    continue;
                }
                else
                {
                    System.out.println("Invalid input!!!");
                    continue;
                }
            
            }
        }
        //Andra bottens method för attacker
        static boolean Fed_Attacks()
        {
            double Bot_rand = Math.random()*100;
            double Bot_rand2 = Math.random()*100;
            double Bot_rand3 = Math.random()*100;
            double Bot_randSP = Math.random()*100;

            if(95<=Fed_HP && Fed_HP<=130)
            {   
                double toffla1 = Math.random()*100;
                if(65<=toffla1 && toffla1<=100)
                {
                    System.out.println("Fed has sent a wild hook at you...");
                    System.out.println("Hit!!!");
                    Player_HP-=8;
                    return true;
                }

                if(35<=toffla1 && toffla1<65)
                {
                    return BotAttack_2(Bot_rand, 20, 15);                
                }
                if(15<=toffla1 && toffla1<35)
                {
                    return BotAttack_3(Bot_rand2, 35, 19);
                }
                if(5<=toffla1 && toffla1<15)
                {
                    return BotAttack_4(Bot_rand3, 40, 26);
                }
                if(0<=toffla1 && toffla1<5)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }

            if(35<=Fed_HP && Fed_HP<95)
            {
                double toffla2 = Math.random()*100;

                if(80<=toffla2 && toffla2<=100)
                {
                    System.out.println("Fed has sent a wild hook at you...");
                    System.out.println("Hit!!!");
                    Player_HP-=8;
                    return true;
                }
                if(50<=toffla2 && toffla2<80)
                {
                    return BotAttack_2(Bot_rand, 20, 15);
                }
                if(30<=toffla2 && toffla2<50)
                {
                    return BotAttack_3(Bot_rand2, 35, 19);
                }
                if(10<=toffla2 && toffla2<30)
                {
                    return BotAttack_4(Bot_rand3, 40, 26);
                }
                if(0<=toffla2 && toffla2<10)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }
            if(0<=Fed_HP && Fed_HP<35)
            {
                double toffla3 = Math.random()*100;

                if(85<=toffla3 && toffla3<=100)
                {
                    System.out.println("Fed has sent a wild hook at you...");
                    System.out.println("Hit!!!");
                    Player_HP-=8;
                    return true;
                }
                if(60<=toffla3 && toffla3<85)
                {
                    return BotAttack_2(Bot_rand, 20, 15);
                }
                if(35<=toffla3 && toffla3<60)
                {
                    return BotAttack_3(Bot_rand2, 35, 19);
                }
                if(15<=toffla3 && toffla3<35)
                {
                    return Fed_Attack_4(Bot_rand3, 40, 26);
                }
                if(0<=toffla3 && toffla3<15)
                {
                    return Op_SP(Bot_randSP, 95);
                }
            }


            return false;
        }

        /*Method för Andra bottens attack 4 eftersom att det inte är så trovärdigt att en Polis har en kniv(Rambo)
        Mer troligt att det är en batong*/
        static boolean Fed_Attack_4(double Bot_rand3, int min, int damage)
        {
            System.out.println("The fed has pulled out his baton...");
            
            if(min<=Bot_rand3 || Bot_rand3<=100)
            {
                System.out.println("He wacked you in the gut...");
                Player_HP-=damage;
                return true;
            }
            else
            {
                System.out.println("He missed!!!");
                return false;
            }
        }
        
        /*Metod för alla Spelarens attacker efter alla bottar
        Jag kommer nu kunna återanvända koden och behöver bara ändra värdena nedan*/
        public static boolean PlAttack(double toffla, int min, int damage) 
        {

            if(min<=toffla && toffla<=100)
                {
                    System.out.println("Hit!!!");
                    Opp_HP=Opp_HP-damage; 

                    return true;
                }
                else
                {
                    System.out.println("Miss!!!");

                    return false;
                }
        }
        public static boolean PlAttack2(double toffla, int min, int damage) 
        {

            if(min<=toffla && toffla<=100)
                {
                    System.out.println("Hit!!!");
                    Fed_HP=Fed_HP-damage; 

                    return true;
                }
                else
                {
                    System.out.println("Miss!!!");

                    return false;
                }
        }
        public static String Stats()
        {
            String PlAttck_list = """
                                                                        Moves List:
                                                    Player hp:            100 hp
                                                                Accuracy            Damage
                                                    Attack 1:     90%                5 hp
                                                    Attack 2:     75%               10 hp
                                                    Attack 3:     60%               15 hp
                                                    Attack 4:     50%               20 hp
                                              Special Attack:      5%               90 hp
                                                            Press enter to continue

                        """;
                System.out.print(PlAttck_list);
                Laeeb.nextLine();
                return PlAttck_list;
        }
        public static void ClearConsole()
        {
            System.out.println("\033[H\033[2J");
        }
        
}