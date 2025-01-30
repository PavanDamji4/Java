import java.util.*;
public class JC_24_Arrays {
    public static void main(String[] args) {
        //This Program is about some basics of java
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10]; //Method 1 to declare and initialize an array
        int[] arr2 = new int[10];               // ---\\\
        arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// ----/// Method 2 to declare and initialize an array

        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]); //Method 1 to Display an array
        }
        System.out.println("Enter 10 elements of int");
        for (int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt(); // Taking inputs for an array
        }
        for (int element : arr2)
        {
            System.out.println(element); //Method 2 of Displaying an array
        }
    }
}
