package Abstract;

public class Goat extends Animal {
    public static void main(String[] args) {
        Goat africanGoat = new Goat();
        africanGoat.horns();
        africanGoat.sound();
        africanGoat.eat();

    }
    @Override
    public void sound() {
        System.out.println("bleat");

    }

    @Override
    public void eat() {
        System.out.println("eat grass");

    }
}
