/*Create a program that accepts the size of an array from the user,
 initializes the array with random numbers between 1 and 100, and 
 prints the array.
*/ 
//--------------------------------------------------------------

import java.util.Random;
import java.util.Scanner;

public class ArrUserSIze_Q3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements: ");

        for (int i = 0; i < size; i++) 
        {
            arr[i] = random.nextInt(20)+1;
        }

        System.out.println("The array elements are: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
