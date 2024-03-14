package Tasks;

public class Task5 {
    public static void main(String[] args) {
        int myNum =100;
        if(myNum%3==0){
            System.out.println("Fizz");
        } else if (myNum%5==0) {
            System.out.println("Buzz");
        }
        else if (myNum%5==0 &&myNum%3==0) {
            System.out.println("FizzBuzz");
        }

    }
}
