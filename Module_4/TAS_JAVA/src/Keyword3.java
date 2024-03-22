public class Keyword3 {
    String name;
    int age;

    public Keyword3(){
        this("Bukola",50);

    }
    public Keyword3(String name, int age) {
        System.out.println("I am constructor 2");

    }

    public static void main(String[] args) {
        Keyword3 name = new Keyword3();
    }
}
