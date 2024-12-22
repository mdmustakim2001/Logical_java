// Write a Java program to create an integer array of size 5.
//  Initialize the array with the numbers 10, 20, 30, 40, and 50,
//  and display all the elements using a for loop.
// ---------------------------------------------
public class ArrSize_Q1 
{
    public static void main(String args[])
    {
        printArr();
    }

    public static void printArr()
    {
        int [] arr={10,20,30,40,50};
        for(int num:arr)
        {
            System.out.println(num+"");
        }
    }
    
}