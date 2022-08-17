package array;

public class Main {
	 
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
        int cnt=0;
        for (int i = 0; i < n ; i++)
        {    cnt=0;
        	for(int k=i+1;k<n;k++)
        	{
            if (a[i] == a[k])
            {
                cnt++;
            }
        	}
            if(cnt==0)
            {
            temp[j++]=a[i];
        	}
        	
        }
              
               
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 11, 12,11, 13, 14, 11 };
        int n = a.length;
 
        n = removeduplicates(a, n);
 
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}