// code starts here
import java.util.Scanner;
class BinarySearch
{
    public static void main(String []args)
    {
        int []A = {10,20,30,40,50,60,70,90,100,120};
        Scanner ONE = new Scanner(System.in);
        System.out.print("Enter a number to be found: ");
        int x = ONE.nextInt();
        int left = 0;
        int right = A.length-1;
        int FLAG = 0;
        int c = 0;
        while(left <= right)
        {
            int mid = (left + right)/2;
            c = mid;
            if (x == A[mid])
            {
                FLAG = 1;
                break;
            }
            if(x < A[mid])
                right = mid - 1;
            if(x > A[mid])
                left = mid + 1;
        }
        if(FLAG == 1)
            System.out.printf("\nElement index found: %d",c);
        else
            System.out.println("Element not found.");
    }
}