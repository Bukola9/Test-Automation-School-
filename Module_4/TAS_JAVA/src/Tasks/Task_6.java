package Tasks;

public class Task_6 {
    public static void main(String[] args) {
        String myWord = "DEMOCRACY";
        StringBuilder builder = new StringBuilder();
        builder.append(myWord);
        builder.reverse();
        System.out.println(builder.substring(4,8));


    }
}
