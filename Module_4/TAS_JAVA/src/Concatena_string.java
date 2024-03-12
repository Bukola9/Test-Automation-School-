public class Concatena_string {
    public static void main(String[] args) {
        String bird = "humming bird";
        String adjective = " is beautiful";
        String newString =bird + adjective;

        //System.out.println(newString);

        //String and primitive concat
        String movieName = "matrix: ";
        int parts =2;
        //System.out.println(movieName+parts);

        //.concat method

        System.out.println(movieName.concat(parts+""));
    }
}
