import java.util.Scanner;
import java.awt.Color;
public class ITSC1212Lab8 {

    static int randomX = (int) ((Math.random() * 100) * 5);
    static int randomY = (int) ((Math.random() * 100) * 5);
    static World w = new World(500, 500);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The correct x-coordinate for tom is " + randomX);
        System.out.println("The correct y-coordinate for tom is " + randomY);

        Turtle tom = new Turtle(randomX, randomY, w);
        Scanner scnr = new Scanner(System.in);
        tom.setVisible(false);

        System.out.println("Enter a guess for the X position of tom");
        int guessX = scnr.nextInt();
        colorGuessX(guessX);
        System.out.println("Enter a guess for the Y position of tom");
        int guessY = scnr.nextInt();
        colorGuessY(guessY);
        while ((guessX != randomX) || (guessY != randomY))
        
        {
            if ((guessX != randomX)) {

                System.out.println("Try and guess the X value ");

                guessX = scnr.nextInt();
                if (guessX < randomX) {
                    System.out.println("Your answer is too low try again");
                    // guessX = scnr.nextInt();
                }

                else if (guessX == randomX) {
                    System.out.println("You are Correct");
                    guessX = scnr.nextInt();
                }

                else if(guessX > randomX) {
                    System.out.println("Your answer is too high try again");
                    // guessX = scnr.nextInt();
                }
            }

            if ((guessY != randomY)) {

                System.out.println("Try and guess the Y value ");

                guessY = scnr.nextInt();
                if (guessY < randomY) {
                    System.out.println("Your answer is too low try again");
                    // guessY = scnr.nextInt();
                }

                    else if (guessY == randomY) {
                        System.out.println("You are Correct");
                        guessY = scnr.nextInt();
                    }

                    else if (guessY > randomY){
                        System.out.println("Your answer is too high try again");
                        // guessY = scnr.nextInt();
                    }

                }
                
            }
        

System.out.println("You found the Turtle!!!");
                tom.setVisible(true);
                scnr.close();
            
        }
      
 
        public static void colorGuessY(int y) {
          Turtle jen = new Turtle(w);
          jen.penUp();
          jen.setVisible(false);
          jen.setPenColor(Color.black);
          if (y > randomY) {
            for (int i = y; i<=500; i++) {
              jen.moveTo(0,i);
              jen.penDown();
              jen.setHeading(90);
              jen.forward(499);
              jen.penUp();
              
            }
          } else {
            for (int i = y; i>=0; i--) {
              jen.moveTo(0, i);
              jen.penDown();
              jen.setHeading(90);
              jen.forward(499);
              jen.penUp();
              
              
            }
          }
        
      
        }
      
      
        public static void colorGuessX(int x) throws InterruptedException {
          Thread.sleep(10);
          Turtle jen = new Turtle(w);
          jen.penUp();
          
          jen.setVisible(false);
          jen.setPenColor(Color.black);
          if (x > randomX) {
            for (int i = x; i<=500; i++) {
              jen.moveTo(i, 0);
              jen.penDown();
              jen.setHeading(180);
              jen.forward(500);
              jen.penUp();
              
            }
          } else {
            for (int i = x; i>0; i++) {
              jen.moveTo(i, 0);
              jen.penDown();
              jen.setHeading(180);
              jen.forward(499);
              jen.penUp();
              
              
            }
          }
          
        }
    }
