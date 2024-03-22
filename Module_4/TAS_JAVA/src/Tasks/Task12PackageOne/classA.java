package Tasks.Task12PackageOne;

import Tasks.Task12PackageTwo.classB;

public class classA {
    public static void main(String[] args) {
        classA access = new classA();
        access.newMethod();

       // classB variable = new classB();
        //variable.privateMethod();  this method cannot be accessible here

    }
    public void newMethod(){
        System.out.println("this is my task 12");
    }
}
