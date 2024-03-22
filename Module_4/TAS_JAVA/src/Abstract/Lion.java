package Abstract;

public class Lion extends Animal{
    public static void main(String[] args) {
        Lion africanLion = new Lion();
        africanLion.eat();
        africanLion.sound();
    }
    @Override
    public void sound() {
        System.out.println("I as a lion, roar");
    }

    @Override
    public void eat() {
        System.out.println("I as a lion, eat zebra");

    }
}
