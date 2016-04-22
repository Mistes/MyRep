package HeadFirst.Ep1.Ep1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Map;


public  class ep4GuessGame
{
    public static void main(String[] args){
        GuessGame game1 = new GuessGame();
        game1.startGame();

    }
        public static class Player{
            int number = 0;
            public void guess(){
                number = (int)(Math.random()*10+1);
                System.out.println("Im guessing " + number);
            }
        }
        public  static class GuessGame{

            public static void startGame(){
                Player p1 = new Player();
                Player p2 = new Player();
                Player p3 = new Player();
                boolean p1isright = false;
                boolean p2isright = false;
                boolean p3isright = false;
                int targetNumber = (int)(Math.random()*10+1);
                System.out.println("Im thinking number between 0 to 9...");
                while(true){
                    System.out.println("Number to guess is " + targetNumber);
                    p1.guess();
                    p2.guess();
                    p3.guess();
                   int guessp1 =p1.number;
                    System.out.println("Player 1 guessed " + guessp1);
                   int guessp2 =p2.number;
                    System.out.println("Player 2 guessed " + guessp2);
                   int guessp3 =p3.number;
                    System.out.println("Player 3 guessed " + guessp3);
                    if (guessp1 == targetNumber){p1isright = true;}
                    if (guessp2 == targetNumber){p2isright = true;}
                    if (guessp3 == targetNumber){p3isright = true;}
                    if(p1isright){
                        System.out.println("We have a Winner! Its 1 player!");
                        System.out.println("Game is over");
                        break;}
                    else if(p2isright){
                        System.out.println("We have a Winner! Its 2 player!");
                        System.out.println("Game is over");
                        break;}
                    else if (p3isright){
                        System.out.println("We have a Winner! Its 3 player!");
                        System.out.println("Game is over");
                        break;}
                    else {
                        System.out.println("Need try again");
                    }
                }

            }
        }
    }


