/* Find Average of Array Elements.
 Input as: 1 2 3 4 5
 Output as: 3 
 -------------------------------------*/
public class ArrAvarage_Q9 
 {
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, i = 0;
        while (i < arr.length) 
        sum += arr[i++];
        System.out.println((double) sum / arr.length);
    }
}
