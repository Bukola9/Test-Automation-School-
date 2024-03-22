import java.util.Arrays;

public class ErrorHandling {
    public static void main(String[] args) {

        try{
            int [] numbers = new int[3];
            numbers[0]=1;
            numbers[1]=2;
            numbers[2]=3;
            numbers[3]=4;
            System.out.println(Arrays.toString(numbers));

        } catch (ArrayIndexOutOfBoundsException numberException){
            System.out.println("sorry, no more space");
        }finally {
            System.out.println("Array is printed out");
        }


    }
}
