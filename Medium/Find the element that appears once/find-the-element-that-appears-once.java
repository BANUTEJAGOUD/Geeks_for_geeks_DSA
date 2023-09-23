//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int arr[], int N)
    {
        int i=0;
        while(i<N-1)
        {
            if(arr[i]==arr[i+1])
            {
                i=i+2;
            }
            else
            {
                return arr[i];
            }
        }
        if(i==N-1)
        {
            return arr[N-1];
        }
        return -1;
        
    }
}