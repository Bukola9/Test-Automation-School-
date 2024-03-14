import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        array1[3]=40;
        array1[4]=50;
        //System.out.println(Arrays.toString(array1));

        String []fruits ={"mango","apple", "guava"};
       // System.out.println(Arrays.toString(fruits));

        int [] [] doubleDimension = new int[2][3];
        doubleDimension [0] [0] =20;
        doubleDimension [0] [1] =30;
        System.out.println(Arrays.deepToString(doubleDimension));

        //Arraylist
        //ArrayList<String>arr= new ArrayList<String>();
        ArrayList arr = new ArrayList();
        arr.add("test");
        arr.add(10);
        //System.out.println(arr);
    }
}
