import java.util.Scanner;
class BinarySearch2
{
    public static void main(String []args)
    {
        Scanner ONE = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = ONE.nextInt();
        int []A = new int[n];
        System.out.print("Enter array elements(in sorted manner): ");
        for(int i = 0;i < n;i++)
        {
            A[i] = ONE.nextInt();
        }
        System.out.print("Enter array element to be searched: ");
        int b = ONE.nextInt();
        int Left = 0;
        int Right = n - 1;
        int FLAG = 1;
        while(Left <= Right)
        {
            int Mid = (Left + Right) / 2;
            if(b == A[Mid])
            {
                System.out.print("Element found at index: " + Mid);
                break ;
            }
            else if(b < A[Mid])
            {
                Right = Mid - 1;
            }
            else if(b > A[Mid] && b < A[n - 1])
            {
                Left = Mid + 1;
            }
            else
            {
                FLAG = 0;
                break ;
            }
        }
        if(FLAG == 0)
            System.out.print("Element not found !");
    }
}