import java.util.Scanner;
class LinearSearch
{
    public static void main(String []args)
    {
        Scanner ONE = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = ONE.nextInt();
        int []A = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0;i < n;i++)
        {
            A[i] = ONE.nextInt();
        }
        System.out.print("Enter element to be searched in array: ");
        int a = ONE.nextInt();
        int b = 0;
        int index = 0;
        for(int j = 0;j < n;j++)
        {
            if(A[j] == a)
            {
               b = 1;
               index = j;
            }
            else
            {
                b = 0;
            }
        }
        if(b == 1)
        {
            System.out.print("Element found at index: " + index);
        }
        else
        {
            System.out.print("Element not found !");
        }
    }
}