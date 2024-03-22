public class ErrorHandling2 {
    public static void main(String[] args) {
        int cash =500;
        if(cash<1000){
            throw new RuntimeException("You dont have enough cash");
        }else {
            System.out.println(" no exception thrown");
        }
    }
}
