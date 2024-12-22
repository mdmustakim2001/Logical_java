/*Write a java program to find the middle elements of a given array. 
 If array is odd then print only the middle element, if array is even then
 print both the middle elements.

 Input as : 1 2 3 4 5  
 Output is : 3
 Input is :1 2 3 4 5 6 
 Output is :3 4
 ----------------------------------------- */

import java.util.Scanner;
public class ArrMiddElements_Q5
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int mid = size / 2;
        if (size % 2 == 0) {
            System.out.println(arr[mid - 1] + " " + arr[mid]);
        } else {
            System.out.println(arr[mid]);
        }
    }
}
