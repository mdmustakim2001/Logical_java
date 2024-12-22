/*Write a java program to print all even elements and odd elements separately
 from an array.

 Input as  : 1 2 3 4 5 6 7
 Even elements are : 2 4 6
 Odd elements are : 1 3 5 7
 --------------------------------- */
import java.util.Scanner;
public class ArrDispOddEven_Q7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Even elements are: ");
        for (int num : arr) 
        if (num % 2 == 0) 
        System.out.print(num + " ");

        System.out.println();
        System.out.print("Odd elements are: ");
        for (int num : arr) if (num % 2 != 0) 
        System.out.print(num + " ");
    }
}
