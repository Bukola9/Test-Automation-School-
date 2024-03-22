package Tasks.Task16B;

public class ChildClass extends ParenClass{
    //Override the 2 methods in the child class,
    // and write a different print statement in the body of the overriding method

    public static void main(String[] args) {
        ChildClass bukola = new ChildClass();
        bukola.eatFood("Rice", "Afternoon");
        bukola.studyCourse("Geology", true);

    }
    public void eatFood(String type, String when){
        System.out.println("I ate Amala");
    }

    public void studyCourse (String course, boolean condition){
        System.out.println("I studied Geology");
    }
}
