public class JavaMethods {
    public static void main(String[] args) {

        JavaMethods methodVar = new JavaMethods();
        methodVar.printName();
        methodVar.myAge(55);
        int userAge = methodVar.ageCalculation(1998,2024);
        System.out.println(userAge);



    }

    public void printName(){
        System.out.println("My name is Bukola");
    }

    public void myAge(int age){
        System.out.println("I am "+age);
    }
    public int ageCalculation(int dob, int presentYear){

        int age =presentYear -dob;
        return age;

    }
}
