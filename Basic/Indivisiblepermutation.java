/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n=input.nextInt();
		    int arr[]=new int[n];
		    int counter=2;
		    for(int i=0;i<n-1;i++)
		    {
		        arr[i]=counter;
		        counter++;
		    }
		    arr[n-1]=1;
		    
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}
