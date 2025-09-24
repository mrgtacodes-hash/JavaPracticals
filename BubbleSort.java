import java.util.Scanner;
class BubbleSort
{
    public static void main(String []args)
    {
        Scanner ONE = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = ONE.nextInt();
        int []A = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i<n ; i++)
        {
            A[i] = ONE.nextInt();
        }
        int temp = 0;
        for(int k = 0; k<n; k++)
        {
            for(int l = k+1; l<n ;l++)
            {
                if(A[k] > A[l])
                {
                    temp = A[k];
                    A[k] = A[l];
                    A[l] = temp;
                }
            }
        }
        System.out.println("Array elements sorted: ");
        for(int m = 0; m<n ; m++)
        {
            System.out.print(A[m]+" ");
        }
    }
}