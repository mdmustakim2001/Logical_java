/* Write a Java program to retrieve the value at a specific index from an array.
 Use an array {100, 200, 300, 400, 500} and retrieve the value at index 3.
 ------------------------------------------------------------------------*/
public class ArrRetriveValue_Q4 
{
    public static void main(String args[])
    {
        int[] arr={100,200,300,400,500};
        int index=3;
        if (index>=0 && index<arr.length)
        {
            System.out.println("Value at index " + index + " is: " + arr[index]);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
