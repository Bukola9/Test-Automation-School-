package Tasks.Task19;

public class ClassB extends ClassA {
    String name = "Anderson";

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.printName();
    }
    public void printName(){
        System.out.println("Class B name is "+name);
        System.out.println("Class A name is "+ super.name);
    }
}
