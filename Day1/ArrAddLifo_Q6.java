/* Write a java program to add the last and first element of a given array.
 Input as: [1,2,3,4,5,6]
 Output as: 7
-------------------------------------------------------------------*/
public class ArrAddLifo_Q6 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = arr[0] + arr[arr.length - 1];
        System.out.println("Sum of first and last element: " + sum);
    }
}

