/*Write a program to store array dynamically by reading the size 
 and elements from the user.
 Input as: 
 Enter size of the array:6
 Enter 6 elements: 1 2 3 4 5 6
 Output is: 
 Array elements are: 1 2 3 4 5 6
 --------------------------------*/
import java.util.Scanner;
public class ArrStore_Q2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements: ");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array elements are: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
