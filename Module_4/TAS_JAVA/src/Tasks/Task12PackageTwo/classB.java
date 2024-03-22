package Tasks.Task12PackageTwo;

import Tasks.Task12PackageOne.classA;

public class classB {
    public static void main(String[] args) {
        classA access = new classA();
        access.newMethod();

        classB variable = new classB();
        variable.privateMethod();

    }
    private void privateMethod(){
        System.out.println("this method cannot be accessible");
    }
}
