import java.util.Scanner;

public class ReadingUsersInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("welcome, please enter your date of birth.");
        short dob =userInput.nextShort();

        short presentYear =2023;
        int customersAge = presentYear -dob;
        System.out.println("You are "+customersAge+" years old");

        if(customersAge<18){

            System.out.println("you are too young, not qualified");

        }else if(customersAge>=18){
            System.out.println("Congratulations, you are qualified");

        }


    }
}
