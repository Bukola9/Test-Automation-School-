package Tasks;

public class Task7 {
    public static void main(String[] args) {
        String [] [] MyFruit = new String[4][3];
        MyFruit [0] [0] ="Apple";
        MyFruit [1] [0] ="Mango";
        MyFruit [2] [0] ="Grape";
        MyFruit [3] [0]= "Orange";

        System.out.println("Fruits in the first column:");
        for (int i = 0; i < MyFruit.length; i++) {
            System.out.println(MyFruit[i][0]);

        }


    }
}
