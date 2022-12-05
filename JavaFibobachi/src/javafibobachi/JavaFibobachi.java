package javafibobachi;

import java.util.Arrays;
/**
 *
 * @author Tural
 */
public class JavaFibobachi {

    public static void main(String[] args) {
        System.out.println("Fibo: "+Arrays.toString(fibonochi(22)));

    }

    public static int[] fibonochi(int a) {
        int[] arr = new int[a];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = arr[0] + arr[1];
        //arr[3] = arr[1] + arr[2];
        for (int i = 3; i < arr.length; i++) {
                  arr[i] = arr[i-1] + arr[i-2];      
        }
return arr;
    }

}
