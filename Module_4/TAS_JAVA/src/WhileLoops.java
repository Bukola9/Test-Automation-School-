import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String UserInput = "";

       /** while(!UserInput.equalsIgnoreCase("exit")){
            System.out.println("Welcome, type \"exit\" to exit this loop");
            UserInput = scanner.nextLine();
        }**/
        /**while(true){
       if(!UserInput.equalsIgnoreCase("exit")){
            System.out.println("Welcome, type \"exit\" to exit this loop");
            UserInput = scanner.nextLine();
           // continue;
        } else if (UserInput.equalsIgnoreCase("exit")){
           System.out.println("You are out of the loop");
           break;
       }
            System.out.println("Hello");**/

       do {
           System.out.println("Welcome, type exit to leave ");
           UserInput = scanner.nextLine();

       } while (!UserInput.equalsIgnoreCase("exit"));

            }


    }


