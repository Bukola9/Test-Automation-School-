package Tasks.Task16B;

public class ChildClass {
    //Override the 2 methods in the child class,
    // and write a different print statement in the body of the overriding method

    public static void main(String[] args) {
        ChildClass bukola = new ChildClass();
        bukola.readBooks("Wole Soyinka", "Ishara");
        bukola.watchFootball("chelsea", true);

    }
    public void readBooks(String author, String title){
        System.out.println("I love to read history");
    }

    public void watchFootball(String club, boolean condition){
        System.out.println("chelsea is actually improving.");
    }
}
