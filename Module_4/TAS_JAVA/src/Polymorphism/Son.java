package Polymorphism;

public class Son extends Father{
    public static void main(String[] args) {
        Son ayoola = new Son();
        ayoola.playSoccer(5, true);
    }

    @Override
    public void playSoccer(int type, boolean condition) {
        System.out.println("Son plays soccer");
    }
}
