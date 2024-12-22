/*Print all elements in reverse order of an Array.           
 Input as: 1 2 3 4 5
 Output as: 5 4 3 2 1 
 -------------------------------------*/
public class ArrReverse_Q10 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
